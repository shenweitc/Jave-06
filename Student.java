package Demo01;
/*
定义一个类
属性（是什么）：姓名，年龄
行为（做什么）：吃饭，睡觉，学习

成员变量（属性）：
    String name;
    int age;
成员方法（行为）：
    public void eat(){}
    public void sleep(){}
    public void study(){}
 */
public class Student {
//    成员变量
    String name;
    int age;
//    成员方法
    public void eat(){
        System.out.println("吃饭！");
    }
    public void sleep(){
        System.out.println("睡觉！");
    }
    public void study(){
        System.out.println("学习！");
    }
}
