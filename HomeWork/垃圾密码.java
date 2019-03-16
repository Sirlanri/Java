import java.util.Scanner;
public class 垃圾密码{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int [] ls=new int[4];
        int [] ls2=new int[4];
        for(int i=0;i<4;i++){
            System.out.println("输入第"+(i+1)+"个数");
            ls[i]=input.nextInt();
        }

        //用新列表盛数据
        ls2[0]=ls[2]+7;
        ls2[1]=ls[3]+7;
        ls2[2]=ls[0]+7;
        ls2[3]=ls[1]+7;

        for(int i=0;i<4;i++){
            if (ls2[i]>=10){
                ls2[i]-=10;
            }
        }
        
        for(int i=0;i<4;i++){
            System.out.println(ls2[i]);
        }
    }
}