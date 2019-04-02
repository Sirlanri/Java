import java.util.Scanner;

class Account{
    float balance=1000;
    //使用了两个构造函数
    Account(){
            //空构造函数
    }
    Account(float num){
        if (num>1000){
            System.out.println("超过余额了亲！");
            }
        else{
            balance-=num;
            System.out.println("已经成功扣款了亲亲");
        }
    }
    public static void main(String[] args) {
        Account a=new Account();//可以无参数
        
        System.out.println("你想借几块钱呀？");
        Scanner input=new Scanner(System.in);
        float money=input.nextFloat();
        Account b=new Account(money);
        
    }
}
