import java.util.Scanner;//导入输入功能的“包”（固定格式，记住就好）

class Users{
    //定义值
    public String name;//定义一个公开的name，外界可以访问
    private String email;//私有，只能在class内部访问
    int age;//默认是protected，可以在包（package）内部访问


    //下面是方法

    //构造方法，new对象时自动调用此函数
    Users(String name,int age){     //接受的参数名称重复，所以要用this表示类的值
        this.name=name;
        this.age=age;
        this.email="";
    }

    //为每个变量都配置set方法，将输入的值赋给类的变量，由VScode自动生成代码
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        if(age<=0){     //进行一个简单的判断，年龄必须大于0
            System.out.println("年龄小于0");
        }
        else{
            this.age = age;
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    //为每个变量都配置get方法，返回变量的值，需要在主程序里配合System.out.print输出
    public int getAge() {
        return age;
    }
    public void getEmail() {
        if (email==""){
            System.out.println("未设置email");
        }
        else{
            //这里直接输出email，而不是返回email的字符串给主函数
            System.out.println(email);
        }
    }
    public String getName() {
        return name;
    }
}


//重新定义一个类，用来放主程序（当然，也可以把主程序放在上一个类里），把这个类放在另一个java文件里也可以
class dothis{
    public static void main(String[] args) {    //主程序

        //定义input为输入函数，固定套路，记住就行
        Scanner input=new Scanner(System.in);

        System.out.println("年龄是？");
        int age=input.nextInt();//从键盘输入int型的数据，赋值给age

        System.out.println("君の名 （你的名字是？）");
        String name=input.next();//从键盘输入字符串类型的数据，赋值给name
        /*注意！输入字符串时，尽量用input.next()，
        不要用input.nextline(),课本上貌似用的这个....很无奈╮(╯▽╰)╭
        因为nextline会“吃掉”你上一个回车*/

        //调用11行的构造函数，新建了lan这个对象，并且将键盘上输入的两个数据作为参数传入
        //想起高中英语被李华支配的恐惧233
        Users lan=new Users(name, age);
        

        //现在lan就是一个对象了，可以使用users中的各个函数

        //调用setemail函数设置email，这是字符串类型的数据，所以要用双引号，name是变量，不需要引号
        lan.setEmail(name+"@gmail.com");

        //调用getAge方法，配合System.out.println输出年龄
        int x=lan.getAge();
        System.out.println(lan.name+"的年龄是："+x);

        //getemail方法，直接在方法里输出，不需要在主函数中使用print
        lan.getEmail();

        //由于name是公开的，所以可以直接读取，修改name
        //name是一个值，而不是函数（方法），所以调用的时候不需要在后面加小括号
        System.out.println(lan.name);

        //在程序的最后，顺手关掉input功能，是个好习惯哟 <(￣ˇ￣)/
        input.close();
        //如果你不关，也无所谓_(:з」∠)_
    }
}