public class Student {
    public String name = "John";
    public static String classes = "English";
    public Student(){
    }
    public void setName(String newName){
        this.name = newName;
    }
    //classes là biến static nên gọi bằng phương thức static
    public static void setClasses(String newClasses){
        Student.classes = newClasses;
    }
}


