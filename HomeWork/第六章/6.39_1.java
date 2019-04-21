import java.util.Scanner;

class random{

    static int add(){
        //先 生成俩随机数~
        //math.random函数会返回一个大于0小于1的double数
        int x = (int)(Math.random() * (10));
        int y = (int)(Math.random() * (10));
        System.out.println("告诉我，"+x+"+"+y+"等于几鸭？");
    
        int yes=0;
        Scanner input=new Scanner(System.in);
        int answer=input.nextInt();
        
        String []a={"Very good","Excellent",
        "Nice work","keep up the good work"};
        String []b={"No,please try again","Wroing, Try once more",
        "Don't give up","No,keep trying"};

        for(int i=0;i<10;i++){
            int z=(int)(Math.random()*4);
            if(answer==x+y){
                System.out.println(a[z]);
                yes+=1;
            }
            else{
                System.out.println(b[z]);
            }
        }

        if(yes>7){
            System.out.println("yooo你做的真不错哈~来，更高难度走你！");
            return 1;
        }
        else{
            System.out.println("哎呀不行呀！赶紧去问问你老师吧！");
            return 0;
        }
    }

    static void difficult(){

    }
    
    public static void main(String[] args) {
        System.out.println("\n输入\n 1-加法\n2-减法\n3-乘法\n4-除法");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        
        
    }
}