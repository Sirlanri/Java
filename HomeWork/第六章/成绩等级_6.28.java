import java.util.Scanner;

class qualityPoint{
    static int qualityPoint(int num){
        if(num>=90){
            return 4;
        }
        if(num>=80&&num<90){
            return 3;
        }
        if(num>=70&&num<80){
            return 2;
        }
        if(num>=60&&num<70){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("告诉我，你考了几分？");
            
            //Python风格的代码2333
            System.out.println("\n等级是"+qualityPoint(input.nextInt()));
        }
    }
}