import java.util.Random;

public class EmployeeBonusCalculatorMet {

    // Method to generate random salaries and years of service for 10 employees
    public static int[][] generateSalaryAndService() {
        Random random = new Random();
        int[][] data = new int[10][2]; // [Salary, Years of Service] for 10 employees
        for (int i = 0; i < 10; i++) {
            data[i][0] = random.nextInt(50000) + 50000; // Salary between 50,000 and 99,999
            data[i][1] = random.nextInt(11); // Years of service between 0 and 10
        }
        return data;
    }

    // Method to calculate bonus and new salaries
    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[10][2]; // [Bonus, New Salary]
        for (int i = 0; i < data.length; i++) {
            double bonusPercentage = data[i][1] > 5 ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusPercentage;
            double newSalary = data[i][0] + bonus;
            result[i][0] = Math.round(bonus * 100.0) / 100.0;
            result[i][1] = Math.round(newSalary * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate and display summary
    public static void displaySummary(int[][] data, double[][] result) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Employee\tOld Salary\tYears of Service\tBonus\tNew Salary");
        for (int i = 0; i < data.length; i++) {
            totalOldSalary += data[i][0];
            totalBonus += result[i][0];
            totalNewSalary += result[i][1];
            System.out.printf("%d\t\t%d\t\t%d\t\t\t%.2f\t%.2f\n", i + 1, data[i][0], data[i][1], result[i][0], result[i][1]);
        }
        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] data = generateSalaryAndService();
        double[][] result = calculateBonusAndNewSalary(data);
        displaySummary(data, result);
    }
}
