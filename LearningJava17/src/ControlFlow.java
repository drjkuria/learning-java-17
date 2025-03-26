import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        whileDemo();
        forDemo();
    }

    private static void forDemo() {
        for (int i=0; i < 5; i++) {
            System.out.println(i);
        }
    }

    private static void whileDemo() {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song " +
                    "off of repeat! If so, answer yes");
            String input = scanner.next();

            if ("yes".equals(input)) {
                isOnRepeat = false;
            }
        }
    }
}
