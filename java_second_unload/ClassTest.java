class MyClass{
    private int data;
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
}
class SubClass extends MyClass{
    private int Mydata;
    public void setMydata(int mydata){
        this.Mydata = mydata;
    }
    public int getMydata(){
        return Mydata;
    }
}
public class ClassTest {
    public static void main(String[] args){
        SubClass sub = new SubClass();
        sub.setData(100);
        System.out.println("父类MyClass数值为："+sub.getData());
        sub.setMydata(200);
        System.out.println("子类SubClass的数值为："+sub.getMydata());
    }
}
