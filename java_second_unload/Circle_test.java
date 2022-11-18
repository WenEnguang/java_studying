import java.math.*;
class Circle1{
    public double r;
    public double PI = 3.14;
    public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public double getArea(){
        return 2 * PI * r * r;
    }
    public double getAround(){
        return 2 * PI * r;
    }
}
class Circle_column extends Circle1{
    private double h;
    public Circle_column(){
        super();
    }
    public void setH(double h,double r){
        this.h = h;
        this.r = r;
    }
    public double getArea() {
        return 2 * PI * r + 2 * PI * r * h;
    }
    public double getV() {
        return PI * r * r * h;
    }
}
class Circle_cone extends Circle1{
    private double h;
    public Circle_cone(){
        super();
    }
    public void setH(double h,double r){
        this.h = h;
        this.r = r;
    }
    public double getArea() {
        return PI * r * r + PI * r * Math.hypot(r,h);
    }
    public double getV(){
        return PI * r * r * h/3;
    }
}
public class Circle_test {
    public static void main(String[] args){
        Circle1 c1 = new Circle1();//定义一个圆
        Circle_column c2 = new Circle_column();//定义一个圆柱
        Circle_cone c3 = new Circle_cone();//定义一个圆锥
        c1.setR(3);
        System.out.println("该圆的面积为："+c1.getArea());
        System.out.println("该圆的周长为："+c1.getAround());
        c2.setH(5,3);
        System.out.println("该圆柱的面积为："+c2.getArea());
        System.out.println("该圆柱的周长为："+c2.getV());
        c3.setH(5,4);
        System.out.println("该圆锥的面积为："+c3.getArea());
        System.out.println("该圆锥的周长为："+c3.getV());
    }
}
