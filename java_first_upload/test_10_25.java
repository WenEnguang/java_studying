class value{
    int x,y;
    value(int a,int b){
        x = a;
        y = b;
    }
}
public class test_10_25 {
    public static void main(String[] args){
        int total;
        value num = new value(24,65);
        total = num.x + num.y;
        System.out.println("add="+total);
    }
}
