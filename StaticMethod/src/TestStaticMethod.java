import java.util.Scanner;

public class TestStaticMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rollNo");
        int rollNo = Integer.parseInt(scanner.nextLine());
        //dùng nextLine lấy giá trị chuỗi nhập cho tất cả trường hợp để fix bug không nhập được
        System.out.println("Enter name");
        String name = scanner.nextLine();
        Student student1 = new Student(rollNo,name);
        Student.change();
        //gọi thuộc tính static qua lớp
        System.out.println(student1.display());
        //Student student2 = new Student(1,"Tùng");
        //System.out.println(student2.display());
    }
}