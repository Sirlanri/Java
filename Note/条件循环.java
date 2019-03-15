//和C语言的if else 一模一样，就不写了

public class 条件循环{
    public static void main(String [] args) {
        
        int score=85;

        int rank=score/10;
        switch(rank){
            case 10:
            case 9:
            System.out.println("Great");
            break;

            case 8:
            case 7:
            System.out.println("Normal");
            break;

            case 6:
            System.out.println("umm....");

            case 5:
            case 4:
            System.out.println("Gun!");
        }

        int i=1;
        
        do{//满足while语句，执行do
            System.out.println(i);
            i+=1;
        }
        while(i<10);{
            System.out.println(i+100);//不满足i<10时输出whil语句
        }
        
    }
}