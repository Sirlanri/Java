import java.util.Scanner;
public class Sales{
    public static void main(String[] args) {
        String list="1-239.99\n2-129.75\n3-99.95\n4-350.89";
        System.out.println(("输入对应物品的代码\n"+list+"\n输入0退出\n"));
        Scanner input=new Scanner(System.in);
        float ex=0;
        while(true){
            int i=input.nextInt();
            if(i==0){
                break;
            }
            if(i>4){
                System.out.println("输的不对，傻瓜~");
                continue;
            }
            switch(i){
                case 0:
                    break;
                case 1:
                    ex+=239.99;
                case 2:
                    ex+=129.75;
                case 3:
                    ex+=99.95;
                case 4:
                    ex+=350.89;
            }
        }
        double salary=200+ex*0.09;
        System.out.println("工资是 "+salary);
    }
}