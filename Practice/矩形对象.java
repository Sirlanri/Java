class point {
    public int x=0;
    public int y=0;

    public point(int a, int b){
        y=a;
        x=b;
    }
}

//类rectangle，代表矩形
class rectangle{
    public int width=0;
    public int height=0;
    public point origin;

    //四种方法
    public rectangle(){
        origin=new point(0, 0);//初始点
    }
    public rectangle(point p){
        origin=p;
    }
    public rectangle(int w, int h){
        origin=new point(w, h);
    }
    public rectangle(point p,int w,int h){
        origin=p;
        width=w;
        height=h;
    }
    public void move(int x,int y){
        origin.x=x;//更新为新值
        origin.y=y;
    }
    public int area(){
        return width*height;
    }
}

//创建main方法
public class 矩形对象{
    public static void main(String[] args) {
        //声明并创建一个坐标点和两个矩形对象
        point originone=new point(23, 94);//创建一个点对象
        rectangle rect1=new rectangle(originone,100,200);//使用已知的点创建矩阵对象
        rectangle rect2=new rectangle(50,100);//创建一个矩形
        //输出宽高和面积
        System.out.println("rect1的高是："+rect1.width);
        System.out.println("rect1的宽是："+rect1.height);
        System.out.println("面积是："+rect1.area());
        //设置rect2的位置为初始默认值
        rect2.origin=originone;
        //显示rect2的位置
        System.out.println("移动之前X坐标是 "+rect2.origin.x);
        System.out.println("移动之前Y坐标是 "+rect2.origin.y);
        //移动rect2
        rect2.move(40,72);
        System.out.println("移动后X坐标是 "+rect2.origin.x);
        System.out.println("移动后Y坐标是 "+rect2.origin.y);
        
    }
}