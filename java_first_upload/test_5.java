class Student {
    int sNO;
    String sName;
    String sSex;
    int sAge;
    double sJava;
    public Student(int sNO, String sName, String sSex, int sAge, double sJava) {
        super();
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }
    public int getNO() {
        return sNO;
    }
    public String getName() {
        return sName;
    }
    public String getSex() {
        return sSex;
    }
    public int getAge() {
        return sAge;
    }
    public double getJava() {
        return sJava;
    }
    public double GetAvg(Student [] students){
        double sum=0;
        for(int i=0;i<students.length;i++)
        {
            sum=sum+students[i].getJava();
        }
        return sum/students.length;
    }
    public double GetMax(Student [] students){
        double f=-1;
        for(int i=0;i< students.length;i++)
        {
            if(students[i].getJava()>f)
            {
                f=students[i].getJava();
            }
        }
        return f;
    }
    public double GetMin(Student [] students){
        double F=100;
        for(int i=0;i< students.length;i++)
        {
            if(students[i].getJava()<F)
            {
                F=students[i].getJava();
            }
        }
        return F;
    }
}
public class test_5 {
    public static void main(String[] args) {
        Student [] stu =new Student[5];
        Student stu1=new Student(01,"小明","男",18,89);
        Student stu2=new Student(02,"小虎","男",19,87);
        Student stu3=new Student(03,"小红","女",18,94);
        Student stu4=new Student(04,"李华","女",19,91);
        Student stu5=new Student(05,"小强","男",20,83);
        stu[0]=stu1;
        stu[1]=stu2;
        stu[2]=stu3;
        stu[3]=stu4;
        stu[4]=stu5;
        System.out.println("这五位学生Java语言成绩为:"+stu1.GetAvg(stu));
        System.out.println("这五位学生中Java语言成绩的最大值为："+stu1.GetMax(stu));
        System.out.println("这五位学生中Java语言成绩的最小值为："+stu1.GetMin(stu));
    }
}