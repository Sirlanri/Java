import java.util.Scanner;

//为了做3.15，我他喵的要敲三个题！(╯‵□′)╯︵┻━┻
class Account{
    private String name;
    private double balance;

    public Account(String name,double balance){
        this.name=name;
        if(balance>0.0){
            this.balance=balance;
        }
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    public void deposit(double num){
        if (num>0.0){
            balance+=num;
        }
    }
}


class AccountTest{
    static void out(String name,double balance){
        System.out.println(name+" "+balance);
    }

    public static void main(String[] args) {
        Account a1=new Account("Green", 50.00);
        Account a2=new Account("john", -7.53);

        out(a1.getName(), a1.getBalance());
        out(a2.getName(), a2.getBalance());

        Scanner input=new Scanner(System.in);
        System.out.println("输入账户1的存款");
        a1.deposit(input.nextDouble());

        out(a1.getName(), a1.getBalance());
        out(a2.getName(), a2.getBalance());

        System.out.println("输入账户2的存款~");
        a2.deposit(input.nextDouble());

        out(a1.getName(), a1.getBalance());
        out(a2.getName(), a2.getBalance());

        input.close();
    }
}