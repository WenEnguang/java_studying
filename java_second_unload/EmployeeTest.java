class Employee{
    public double salary;

    public void setSalary(double salary) {//设置他的基本工资为1000元
        this.salary = salary;
    }
    public double getEarnings(){//返回员工工资
        return this.salary;
    }
}
class Boss extends Employee{//定义一个boss类，每月固定工资
    public double getEarnings() {
        return super.getEarnings()+5500;
    }
}
class PieceWorker extends Employee{//定义一个计件工，按照生产的件数计费
    public int num;
    public void setNum(int num) {
        this.num = num;
    }
    public double getEarnings() {
        return super.getEarnings()+num * 1.2;
    }
}
class HourLyWorker extends Employee{//定义一个小时工，按照工时计费
    public double hour;
    public void setHour(double hour) {
        this.hour = hour;
    }
    public double getEarnings() {
        return super.getEarnings() + hour * 16.5;
    }
}
public class EmployeeTest {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setSalary(1000);
        System.out.println("雇员的基本工资为："+employee.getEarnings());
        Boss bo = new Boss();//定义一个boss类的雇员
        System.out.println("Boss类的雇员工资为："+bo.getEarnings());
        PieceWorker pw = new PieceWorker();//定义一个计件工的雇员
        pw.setNum(4800);//初始化计件工的工作件数
        System.out.println("piece类的雇员的工资为："+pw.getEarnings());
        HourLyWorker hw = new HourLyWorker();//定义一个小时工的雇员
        hw.setHour(400);//初始化小时工的工作小时时间
        System.out.println("Hour类的雇员的工资为："+hw.getEarnings());
    }
}
