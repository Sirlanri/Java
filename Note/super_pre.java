class A{
    public void say(){
        System.out.println("父类A");
    }
    public void speak(){
        System.out.println("未重写的父类A");
    }
}
class B extends A{
    //子类复写了父类的say
    public void say(){
        System.out.println("重写过的子类B");
    }
}

class C{
    String name="深蓝蓝";

}
class D extends C{
    String name="蓝蓝邃";
    void say(){
        System.out.println("子类的名字是 "+name);
        //用super访问父类的值
        System.out.println("父类的 "+super.name);
    }
}
//调用父类的无参构造方法
class E{
    E(){
        System.out.println("父类E的构造方法");
    }
}
class F extends E{
    F(){
        super();
        System.out.println("子类F的构造方法");
    }
}
//构造方法链，I继续继承f
class I extends F{
    I(){
        System.out.println("这是I，继承了F");
    }
    //如果在main使用I，会依次调用父类F,D的构造方法
}


//调用父类的带参构造方法
class G{
    public String name;
    public int age;
    public void people(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class H extends G{
    public String password;
    public void people(String name, int age, String password){
        this.password=password;
        //尝试使用super，失败=-=
    }
    public void login(){
        System.out.println("OK");
    }
}


public class super_pre{
    public static void main(String[] args) {
        F f=new F();//创建对象后，自动调用构造方法
    }
}