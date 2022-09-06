package Demo01;
/*
问题描述：定义person的年龄时，无法阻止不合理的数值进来
解决方法：用private关键字将需要保护的成员变量进行修饰

一旦使用了private进行修饰，本类中可以随意访问
超出了本类范围之外就不能直接访问
*/

public class DemoPerson {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫："+name+",年龄："+age);
    }

    public void setAge(int num){
        if(num<100&&num>0){
            age=num;
        }
        else {
            System.out.println("数据不合理！");
        }
    }
    public int getAge(){
        return age;
    }
}
