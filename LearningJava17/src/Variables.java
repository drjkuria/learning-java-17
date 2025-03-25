public class Variables {
    public static void variablesDemo() {
        int studentAge = 15;
        double studentGPA = 3.95;
        char studentFirstInitial = 'J';
        char studentLastInitial = 'D';
        boolean hasPerfectAttendance = true;
        String studentFirstName = "John";
        String studentLastName = "Doe";

        System.out.println("Student Age: " + studentAge);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Student First Initial: " + studentFirstInitial);
        System.out.println("Student Last Initial: " + studentLastInitial);
        System.out.println("Student Has Perfect Attendance: " + hasPerfectAttendance);
        System.out.println("Student Name: " + studentFirstName + " " + studentLastName);
    }

    public static void main(String[] args) {
        variablesDemo();
    }
}
