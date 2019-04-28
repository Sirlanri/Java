//工厂模式，我也不知道啥意思，暂时无法理解

interface Car{//车的父类（接口）
    public void driver();
}
class Bike implements Car{
    public void driver(){
        System.out.println("自行车叮叮当~");
    }
}
class Benz implements Car{
    public void driver(){
        System.out.println("今天开奔驰！");
    }
}
class Bmw implements Car{
    @Override//确定重新父类的函数，否则报错
    public void driver() {
        System.out.println("换个宝马");
    }
}

class Driver{//车的工厂
    public static Car driveCar(String s) throws Exception{
        if(s.equalsIgnoreCase("Benz")){//判断传入参数返回不同的实现类
            return new Benz();
        }
        if(s.equalsIgnoreCase("Bmw")){
            return new Bmw();
        }
        if(s.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        else{
            throw new Exception();//抛出异常
        }
    }
}
class Testthis{
    public static void main(String[] args) {
        try{
            Car car=Driver.driveCar("bike");
            System.out.println("亲亲，今天开什么车呀？");
            car.driver();
        }
        catch(Exception e){
            System.out.println("老司机翻车啦！！！");
        }
        finally{//不管正确与否，代码都被执行
            System.out.println("-------");
        }
    }
}