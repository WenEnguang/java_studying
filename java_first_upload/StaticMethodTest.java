public class StaticMethodTest {
    static int a = 100;
    static int b = 13;
    public static int sum(){
        return a + b;
    }
    public static int cha(){
        return (a - b);
    }
    public static void main(String[] args){
        System.out.println("静态输出："+StaticMethodTest.sum());
        StaticMethodTest CHA = new StaticMethodTest();
        System.out.println("实例输出："+CHA.cha());
    }
}
