class Point{
    double x;
    double y;
    public void setX(double x){
        this.x = x;
    }
    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public void setTri(double a,double b){
        x = a;
        y = b;
    }
}
class Triangle{
    Point m1;
    Point m2;
    Point m3;
    public Point getM1() {
        return m1;
    }
    public void setM1(Point m1) {
        this.m1 = m1;
    }
    public Point getM2() {
        return m2;
    }
    public void setM2(Point m2) {
        this.m2 = m2;
    }
    public Point getM3() {
        return m3;
    }
    public void setM3(Point m3) {
        this.m3 = m3;
    }
    public static double GetL(Point m1,Point m2) {
        return Math.sqrt(Math.pow(m1.getX()-m2.getX(),2)+Math.pow(m1.getY()-m2.getY(),2));
    }
    public static double GetC(Point m1,Point m2,Point m3) {
        return GetL(m1,m2)+GetL(m2,m3)+GetL(m1,m3);
    }
    public static double GetS(Point m1,Point m2,Point m3) {
        double p=GetL(m1,m2)+GetL(m2,m3)+GetL(m1,m3);
        return Math.sqrt(p*(p-GetL(m1,m2)*(p-GetL(m1,m3)*(p-GetL(m2,m3)))));
    }
}
public class TriangleTest{
    public static void main(String[] args){
        Triangle tri = new Triangle();
        Point m1 = new Point();
        Point m2 = new Point();
        Point m3 = new Point();
        m1.setTri(0,0);
        m2.setTri(7,3);
        m3.setTri(5,4);
        tri.setM1(m1);
        tri.setM2(m2);
        tri.setM3(m3);
        System.out.println("该三角形的周长为："+Triangle.GetC(m1,m2,m3));
        System.out.println("该三角形的面积为："+Triangle.GetS(m1,m2,m3));
    }
}