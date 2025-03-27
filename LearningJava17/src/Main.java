public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        System.out.println("Number of sides: " + Triangle.numberOfSides);
        System.out.println("Triangle A Area: " + triangleA.findArea());
        System.out.println("Triangle B Area: " + triangleB.findArea());
    }
}
