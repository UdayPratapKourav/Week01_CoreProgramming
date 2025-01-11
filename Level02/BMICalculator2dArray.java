import java.util.Scanner;

class BMICalculator2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of persons:");
        int person = sc.nextInt();

        // Define a 2D array to store weight, height, and BMI
        double[][] personData = new double[person][3]; 
        String[] weightStatus = new String[person];
        String[] status = {"Underweight", "Normal weight", "Overweight", "Obese"};

        // Input weight and height
        for (int i = 0; i < person; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            do {
                System.out.print("Enter weight in kg: ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please try again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height in cm: ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please try again.");
                }
            } while (personData[i][1] <= 0);

            // Convert height to meters and calculate BMI
            double heightInMeters = personData[i][1] / 100.0;
            double bmi = personData[i][0] / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;  // Store BMI

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = status[0];  // Underweight
            } else if (bmi < 24.9) {
                weightStatus[i] = status[1];  // Normal weight
            } else if (bmi < 29.9) {
                weightStatus[i] = status[2];  // Overweight
            } else {
                weightStatus[i] = status[3];  // Obese
            }
        }

        // Display results
        System.out.println("Weight Height BMI Weight Status");
        for (int i = 0; i < person; i++) {
            System.out.println(personData[i][0] + " " + personData[i][1] + " " + 
                               personData[i][2] + " " + weightStatus[i]);
        }

        sc.close();
    }
}
