interface printDetail{//定义一个接口，可满足输出细节信息
    public String detail();
}
interface printPrinter{//定义一个接口，实现打印机打印
    public void print(String content);
}

class BlackPrinter implements printPrinter{//定义一个黑白打印机
    @Override
    public void print(String content) {
        System.out.println("黑白打印机:"+content);
    }
}
class ColorPrinter implements printPrinter{//定义一个彩色的打印机
    @Override
    public void print(String content) {
        System.out.println("彩色打印机："+content);
    }
}
class Printer implements printPrinter{//定义一个打印机
    printPrinter printer;

    public void setPrinter(printPrinter printer) {
        this.printer = printer;
    }
    public void print(printDetail p){
        printer.print(p.detail());
    }

    @Override
    public void print(String content) {
        System.out.println("开始打印："+content);
    }
}
class School implements printDetail{ //定义系部
    printPrinter printer;
    public void setPrinter(printPrinter printer) {
        this.printer = printer;
    }
    public void print(printDetail p){
        printer.print(p.detail());
    }

    @Override
    public String detail() {
        return "这里是系部！！！";
    }
}
class Teacher implements printDetail{ //定义老师职业
    @Override
    public String detail() {
        return "我是老师！！！";
    }
}
class Stu implements printDetail{//定义学生
    @Override
    public String detail() {
        return "我是这里的学生。";
    }
}

public class java1021 {
    public static void main(String[] args){
        Teacher tea = new Teacher();//定义一个老师的实例
        Stu stu = new Stu();//定义一个学生的实例
        School sc = new School(); //创建一个学校实例
        sc.setPrinter(new ColorPrinter());//采用的是彩色打印机
        sc.print(sc);
        Printer pt = new Printer();//创建一个打印机
        pt.setPrinter(new BlackPrinter());//采用的是黑白打印机
        pt.print(tea.detail());
        pt.print(stu.detail());
    }
}

