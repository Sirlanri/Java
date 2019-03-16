import java.util.Scanner;
public class Gas{
    public static void main(String []args){
        int i=1;
        float miles=0;
        float gass=0;
        float mile,gas,ave;
        Scanner input=new Scanner(System.in);
        while (true){

            System.out.println("输入第"+i+"个英里");
            mile=input.nextFloat();
            if(mile==0){
                break;
            }
            miles+=mile;

            System.out.println("输入第"+i+"个汽油");
            gas=input.nextFloat();
            if(gas==0){
                break;
            }
            gass+=gas;

            i++;
        }
    ave=miles/gass;
    System.out.println("平均值是 "+ave);
    }
}