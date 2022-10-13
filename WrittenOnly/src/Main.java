public class Main{
    public static void main(String[] args) {
        Student studentA = new Student();
        studentA.setName("Tung");
        Student.setClasses("Biology");
        //setClasses là phương thức tĩnh nên phải gọi qua class Student
        System.out.println(studentA.name);
        System.out.println(Student.classes);
        //biến và phương thức được đánh dấu là static là thành viên thuộc về class; thay vì thuộc về một Object khởi tạo cụ thể nào
    }
}