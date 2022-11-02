class Cylinder_test {
    static double PI = 3.14;
    double r;
    double h;
    public Cylinder_test(double r,double h){
        this.r = r;
        this.h = h;
    }
    public double getS(){
        return 2 * PI * r * (h + r);
    }
    public double getV(){
        return PI * r * r * h;
    }
}
public class cylinder{
    public static void main(String[] args){
        Cylinder_test test_cy = new Cylinder_test(10,5);
        System.out.println("该圆柱体的表面积为："+test_cy.getS());
        System.out.println("该圆柱体的表面积为："+test_cy.getV());
    }
}
