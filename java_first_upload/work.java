import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        boolean fileCorrect = false;
        boolean emailCorrect = false;
        Scanner input = new Scanner(System.in);
        System.out.println("成功进入系统，请输入你的java文件名称：");
        String fileName = input.next();
        System.out.println("请输入你的邮箱名称：");
        String emailName = input.next();

        int index = fileName.lastIndexOf(".");
        if(index != -1 && index != 0 && fileName.substring(index + 1).equals("java")){
            fileCorrect = true;
        }
        else{
            System.out.println("文件名无效。");
        }

        if(emailName.indexOf('@') != -1 && emailName.indexOf('.') > emailName.indexOf('@')){
            emailCorrect = true;
        }
        else{
            System.out.println("Email无效。");
        }

        if(fileCorrect && emailCorrect){
            System.out.println("作业提交成功！");
        }
        else{
            System.out.println("作业提交失败！");
        }
    }
}
