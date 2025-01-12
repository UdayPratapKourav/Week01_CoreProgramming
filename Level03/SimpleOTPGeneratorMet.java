import java.util.Random;

public class SimpleOTPGeneratorMet {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);  // Generates a 6-digit OTP
    }

    // Method to check if all OTPs are unique
    public static boolean areUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;  // Duplicate found
                }
            }
        }
        return true;  // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate and store 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check if all OTPs are unique
        if (areUniqueOTPs(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
