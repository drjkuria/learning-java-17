public class Main {
    public static void main(String[] args) {
        // Using Triangle Class
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        System.out.println("Number of sides: " + Triangle.numberOfSides);
        System.out.println("Triangle A Area: " + triangleA.findArea());
        System.out.println("Triangle B Area: " + triangleB.findArea());

        // Using Book Class
        String bookName = "Best Software Developer Tips";
        Book book = new Book(bookName);
        System.out.println("Book name: " + book.getName());
    }
}
