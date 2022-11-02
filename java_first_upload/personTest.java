class Person {
    String name = "张三";
    String sex = "男";
    String num = "001";
    int age = 20;
    public int getAge(){
        return age;
    }
}
public class personTest{
    public static void main(String[] args){
        Person person=new Person();
        System.out.println("该对象姓名："+person.name);
        System.out.println("性别："+person.sex);
        System.out.println("学号："+person.num);
        System.out.println("年龄："+person.getAge());
    }
}