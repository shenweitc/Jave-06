package Demo01;

public class Student_01 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.age=21;
        stu.name="包八";
        System.out.println(stu.age);
        System.out.println(stu.name);
        stu.sleep();
    }
}
