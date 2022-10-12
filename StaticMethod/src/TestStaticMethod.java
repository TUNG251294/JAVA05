import java.util.Scanner;

public class TestStaticMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rollNo");
        int rollNo = scanner.nextInt();

        System.out.println("Enter name");
        String name = scanner.nextLine();

        Student student1 = new Student(rollNo,name);
        student1.change();
        System.out.println(student1.display());
        //        Student student2 = new Student(1,"Tùng");
        //        System.out.println(student2.display());
    }
}