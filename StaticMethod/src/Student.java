public class Student {
    private int rollNo;
    private String name;
    private static String collage = "HCM University";
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    static void change(){
        collage = "University Of Technology";
    }
    String display(){
        return this.rollNo + " " + this.name + " " + collage;
    }
}
