import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        announceTeaTime();
        System.out.println("---------");
        calculateTotalMealPrice(15,0.2,0.08);
        System.out.println("----------");
        inBuiltDemo();
    }

    private static void inBuiltDemo() {
        double threePowerSix = Math.pow(3, 6);
        System.out.println("3^6 = " + threePowerSix);
    }


    private static void calculateTotalMealPrice(double listedPrice,
                                                double tipRate,
                                                double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double totalPrice = listedPrice + tip + tax;
        System.out.println("Your total meal price is " + totalPrice);
    }

    private static void announceTeaTime() {
        System.out.println("Waiting for team time...");
        System.out.println("Type in a random word and press Enter" +
                " to start tea time.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time");
    }
}
