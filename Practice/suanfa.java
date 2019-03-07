import java.util.Scanner;
public class suanfa{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int num1,num2,num3,sum,ave,pru;

        //输入数字
        System.out.print("输入第一个数字");
        num1=input.nextInt();
        System.out.print("第二个数字");
        num2=input.nextInt();
        System.out.print("最后一个数字");
        num3=input.nextInt();

        //进行计算（懒得直接输出一步完成了）
        sum=num1+num2+num3;
        ave=sum/3;
        pru=num1*num2*num3;

        System.out.print("和为:"+sum+"\n平均数:"+ave+"\n乘积:"+pru);
    }
}