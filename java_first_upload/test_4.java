public class test_4 {
    int no = 1001;
    String name = "张小林";
    String sex = "男";
    int age = 24;
    public boolean HaveClass() {
        return false;
    }
    public boolean Sleep() {
        return true;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        test_4 Stu = new test_4();
        System.out.println("学号:" + Stu.no);
        System.out.println("姓名:" + Stu.name);
        System.out.println("性别:" + Stu.sex);
        System.out.println("年龄:" + Stu.age);
        System.out.println("sleep()=" + Stu.Sleep());
        System.out.println("HaveClass=" + Stu.HaveClass());
    }
}