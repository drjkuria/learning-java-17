public class Employee {
    public static void main(String[] args) {
        double salaryOne = calculateYearlySalary(40, 20);
        double salaryTwo = calculateYearlySalary(85.5, 35);
        double salaryThree = calculateYearlySalary(0, 35);

        System.out.println("Employee's one yearly salary: " + salaryOne);
        System.out.println("Employee's two yearly salary: " + salaryTwo);
        System.out.println("Employee's three yearly salary: " + salaryThree);
    }

    private static double calculateYearlySalary(double hoursPerWeek,
                                                double amountPerHour) {
        double weeklySalary;
        if (amountPerHour <= 0 || hoursPerWeek <= 0) {
            weeklySalary = 0;
        } else {
            weeklySalary = hoursPerWeek * amountPerHour;
        }
        // 52 weeks in a year
        return weeklySalary * 52;
    }
}
