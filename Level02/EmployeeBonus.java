import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the number of employees
        int numEmployees = 10;

        // Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        // Variables to store total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to input salary and years of service for each employee
        for (int i = 0; i < numEmployees; i++) {
            // Taking input for salary and years of service, ensuring valid input
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Enter details for employee " + (i + 1) + ":");
                System.out.print("Enter salary: ");
                salary[i] = sc.nextDouble();
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextInt();

                // Validate salary (must be positive) and years of service (must be non-negative)
                if (salary[i] > 0 && yearsOfService[i] >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter positive salary and non-negative years of service.");
                }
            }

            // Calculating bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5% bonus for more than 5 years
            } else {
                bonus[i] = salary[i] * 0.02;  // 2% bonus for 5 years or less
            }

            // Calculating new salary (old salary + bonus)
            newSalary[i] = salary[i] + bonus[i];

            // Calculating total old salary, new salary, and total bonus
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        // Printing the results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Closing the scanner object to avoid memory leaks
        sc.close();
    }
}

   