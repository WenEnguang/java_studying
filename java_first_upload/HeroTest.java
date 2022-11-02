import java.util.*;

/*class Hero{
    private String name;
    private String role;

    public Hero(){
        super();
    }
    public Hero(String name,String role){
        this.name = name;
        this.role = role;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

    public String show() {
        return "Student{" +
                "name='" + name + '\'' + ", age='" + role + '\'' + '}';
    }
}
public class HeroTest {
    public static void main(String[] args){
        ArrayList<Hero> heroes=new ArrayList<>();

        Hero role1=new Hero("张三丰","武当派");
        Hero role2=new Hero("周芷若","峨嵋派");
        Hero role3=new Hero("金毛狮王","江湖散派");
        heroes.add(role1);
        heroes.add(role2);
        heroes.add(role3);
        System.out.println("大陆怪兽入侵......");
        System.out.println("以下门派组队抵抗......");
        Iterator<Hero> it=heroes.iterator();
        while(it.hasNext()){
            Hero s=it.next();
            System.out.println(s.getName()+"  "+s.getRole());
        }

        Random number=new Random();
        int who= number.nextInt(3);
        for(int i=0;i<heroes.size();i++){
            if(who==i){
                heroes.remove(who);
                System.out.println("有人阵亡了......");
            }
        }
        System.out.println("活着的人：");

        Iterator<Hero> f=heroes.iterator();
        while(f.hasNext()){
            Hero d=f.next();

            System.out.println(d.getName()+","+d.getRole());
        }
    }
}
*/
class Hero{
    String name;
    String role;
    public Hero(String name , String series){
        this.name = name;
        this.role = series;
    }
    public void show(){
        System.out.println("姓名:" + this.name);
        System.out.println("属性:" + this.role);
    }
}

public class HeroTest {
    public static void main(String[] args) {
        int sac;
        Scanner sc = new Scanner(System.in);

        Hero ArrayList[] = {
                new Hero("钟离" , "阎王帝君"),
                new Hero("amiya","术士") ,
                new Hero("维吉尔","devil")};
        for(int i = 0 ; i < 3 ; i = i + 1)
        {
            ArrayList[i].show();
        }
        System.out.println("请选择一个英雄的序号，阵亡:");
        sac = sc.nextInt();


        for(int i = 0 ; i < 3 ; i = i + 1)
        {
            if (sac == i + 1)
            {
                continue;
            }
            System.out.println( (i + 1) +"号英雄:");
            ArrayList[i].show();
        }
    }
}