public class Module3 {

    public static double calculateTaxWithholding(double weeklyIncome) {
        double taxRate;

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else { // weeklyIncome >= 2500
            taxRate = 0.30;
        }

        return weeklyIncome * taxRate;
    }

    public static void main(String[] args) {
        double[] weeklyIncomes = {450, 700, 1600, 2800};

        for (double income : weeklyIncomes) {
            double tax = calculateTaxWithholding(income);
            System.out.printf("Weekly income: $%.2f, Tax withholding: $%.2f%n", income, tax);
        }
    }
}
