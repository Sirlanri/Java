import java.util.Scanner;
public class max_min{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);

        int[] myList = new int[5];
        
        //输入
        for(int i=0;i<5;i++){
            System.out.printf("输入第%d个",i+1);
            myList[i]=input.nextInt();
        }
        maoPao(myList);
    }
    public static void maoPao(int[] x) {  
        for (int i = 0; i < 5; i++) {  
         for (int j = i + 1; j < 5; j++) {  
          if (x[i] > x[j]) {  
           int temp = x[i];  
           x[i] = x[j];  
           x[j] = temp;  
          }  
         }  
        }  
        System.out.print("排序后\n");
        for (int i : x) {  
         System.out.print(i + " ");  
        }  
       }  
}