class Box{
    double width;
    double heigth;
    double depth;

    Box(Box box){//带对象的构造方法
        this.depth=box.depth;
        this.heigth=box.heigth;
        this.width=box.width;
    }
    Box(){//默认构造方法
        this.depth=-1;//初始化为-1
        this.heigth=-1;
        this.width=-1;
        System.out.println("这是个初始化的正方体");
    }
    Box(double len){//正方体
        this.width=this.heigth=this.depth=len;
    }
    double volume(){//求体积
        return width*heigth*width;
    }
}
class BoxWeight extends Box{
    double weight;
    
    BoxWeight(double w,double h,double d,double m){
        width=w;
        depth=d;
        weight=m;
        heigth=h;
    }
    BoxWeight(){//无参数的构造方法
        System.out.println("我是一个小小的盒子~~~");
    }
}
public class 继承例子{
    public static void main(String[] args) {
        BoxWeight boxweight=new BoxWeight(10,20,30,15.0);//子类实例化对象
        Box box=new Box();//超类实例化对象
        double vol;
        //试图子类调用超类方法，失败=-=
        Box box2=new BoxWeight();//超类引用子类对象
        
    }
}