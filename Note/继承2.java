class University{
    University(int math,int chinese,int english){
        if(math+chinese+english>=180){
            System.out.println("被大学录取啦！");
        }
        else{
            System.out.println("没有被录取");
        }
    }
}
class Important extends University{
    Important(int math,int chinese,int english){
        super(math, chinese, english);//用super继承父类的构造函数
        if(math+chinese+english>=200){
            System.out.println("重点录取");
        }
    }
    public static void main(String[] args) {
        University QDU=new University(20, 180, 50);
        Important SDU=new Important(20, 200, 10);//先执行了父类的构造函数，然后执行子类
        Japanese gangben=new Japanese();
        gangben.getAge();
    }
}

class ren{
    private int age=19;
    
    public void getAge() {
        System.out.println(age);
    }
}
class Japanese extends ren{
    int height=181;
    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }
}

