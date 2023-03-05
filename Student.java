public class Student {
    String name;
    int roll_no;
    
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.roll_no = 2;
        System.out.println("Name: " + student.name);
        System.out.println("Roll No.: " + student.roll_no);
    }
}
