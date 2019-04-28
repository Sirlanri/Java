class WaterUser{
    WaterUser(int num){
        System.out.println(num*2);
    }
    WaterUser(){
        //指定一个无参数的构造函数，子类可以正常使用
    };
}
class Beijing extends WaterUser{
    Beijing(int num){
        //super(num);
        //这样会调用父类的构造方法，如果不使用父类的构造方法，就不能用super
        if(num<=6){
            System.out.println(2*num);
        }
        else{
            System.out.println(12+(num-6)*3);
        }
    }
    public static void main(String[] args) {
        Beijing wan=new Beijing(7);
    }
}

