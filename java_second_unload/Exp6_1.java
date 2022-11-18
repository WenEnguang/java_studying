interface Calculability{
   public double area();
}
class Triangle implements Calculability {
    double w,h;
    public Triangle(double width,double height){
        this.w = width;
        this.h = height;
    }
    public double area(){
        return w * h / 2;
    }
}
class Circle implements Calculability{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
}
class Taper {
    Calculability bottom;
    double height;
    public Taper(Calculability b,double h){
        this.bottom = b;
        this.height = h;
    }
    public void getBottom(Calculability bottom) {
        this.bottom = bottom;
    }

    public double volume(){
        return (bottom.area()*height)/3;
    }
}

public class Exp6_1 {
    public static void main(String[] args){
        Calculability bottom;
        bottom = new Circle(5);
        Taper tap = new Taper(bottom,30);
        System.out.println("锥体为圆形的底面积："+bottom.area());
        System.out.println("锥体为圆形的体积为："+tap.volume());
    }
}
