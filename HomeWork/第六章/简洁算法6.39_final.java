import java.util.Scanner;

class die{

    int [] a=new int [10];//存放随机数a
    int [] b=new int [10];//存放随机数b
    int [] real=new int [10];//根据不同的运算符，计算正确答案
    String [] symble=new String [10];//存放运算符
    int d=1;//难度等级

    die(int n,int d){
        chuti(n);
        this.d=d;
    }

    void chuti(int mode){
        for(int i=0;i<10;i++){
            //生成两个随机数数列
            a[i]=(int) (Math.random()*10*d);
            b[i]=(int) (Math.random()*10*d);
        }
        //根据不同的模式，生成对应的答案real序列
        //加法
        if(mode==1){
            for(int i=0;i<10;i++){
                real[i]=a[i]+b[i];
                symble[i]="+";
            }
        }
        //减法
        if(mode==2){
            for(int i=0;i<10;i++){
                real[i]=a[i]-b[i];
                symble[i]="-";
            }
        }
        //乘法
        if(mode==3){
            for(int i=0;i<10;i++){
                real[i]=a[i]*b[i];
                symble[i]="*";
            }
        }
        //除法
        if(mode==4){
            for(int i=0;i<10;i++){
                real[i]=(int)a[i]/b[i];
                symble[i]="/";
            }
        }
        //随机，这个玩意儿真难！
        if(mode==5){
            for(int i=0;i<10;i++){
                double x=Math.random();
                if (x<0.25){//随机的加法
                    real[i]=a[i]+b[i];
                    symble[i]="+";
                }
                if(x<0.5&&x>=0.25){//随机的减法
                    real[i]=a[i]-b[i];
                    symble[i]="-";
                }
                if(x<0.75&&x>=0.5){//随机乘法
                    real[i]=a[i]*b[i];
                    symble[i]="*";
                }
                else{//随机除法
                    real[i]=(int)a[i]/b[i];
                    symble[i]="/";
                }
            }
        }
        answer();
    }

    void yes(){
        String [] yeslist={"Very good","Excellent",
        "Nice work","keep up the good work"};
        //随机输出一个语句
        System.out.println(yeslist[(int)(Math.random()*4)]);
    }
    void no(){
        String [] nolist={"No,please try again","Wroing, Try once more",
        "Don't give up","No,keep trying"};
        //随机输出一个否定语句
        System.out.println(nolist[(int)(Math.random()*4)]);
    }

    void answer(){
        int count=0;
        for(int i=0;i<10;i++){
            System.out.println(a[i]+symble[i]+b[i]+"的结果是？");
            Scanner input=new Scanner(System.in);

            int ans=input.nextInt();
            if(ans==real[i]){
                yes();
                count+=1;
            }
            else{
                no();
            }
        }
        if (count>7){
            System.out.println("正答率蛮高嘛！更高难度走你！");
            d=10;
        }
        else{
            System.out.println("正答率太低了，找你老师吧");
        }
    }

    public static void main(String[] args) {
        int d=1;
        while (true){

            System.out.println("\n输入\n 1-加法\n2-减法\n3-乘法\n4-除法\n5-随机");
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            die z=new die(n,d);
            d*=10;
        }
    }
}