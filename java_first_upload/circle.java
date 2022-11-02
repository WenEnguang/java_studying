public class circle {
    double x;
    double y;
    double r = 1;
    public  circle(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void setX(double x) {
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
    public void setR(double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public static void main(String[] args){
        circle cir_1 = new circle(4,3);
        System.out.println("使用构造方法初始化圆心的半径和圆心坐标：");
        System.out.println("该圆圆心的半径是："+cir_1.getR());
        System.out.println("该圆圆心的X坐标为："+cir_1.getX());
        System.out.println("该圆圆心的Y坐标为："+cir_1.getY());
        cir_1.setX(5);
        cir_1.setY(5);
        cir_1.setR(6);
        System.out.println("重置后的圆半径："+cir_1.getR());
        System.out.println("重置后该圆圆心的X坐标为："+cir_1.getX());
        System.out.println("重置后该圆圆心的Y坐标为："+cir_1.getY());
    }
}
