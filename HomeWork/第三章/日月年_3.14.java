import java.util.Scanner;
class date{
    int month;
    int day;
    int year;
    int [] year1={31,28,31,30,31,30,31,31,30,31,30,31};
    int [] year2={31,29,31,30,31,30,31,31,30,31,30,31};

    void warn(){//专门写了个输出警告的函数
        System.out.println("输入的数据不合法哟");
        return;
    }

    date(int m,int d,int y){//直接调用构造函数
        if(y/4==0){
            if(0<m&&m<13){
                if(d>0&&d<year2[m]){
                    year=y;
                    month=m;
                    day=d;
                }
                else{
                    warn();
                }
            }
            else{
                warn();
            }
        }
        else{
            if(0<m&&m<13){
                if(d>0&&d<year1[m]){
                    year=y;
                    month=m;
                    day=d;
                }
                else{
                    warn();
                }
            }
            else{
                warn();
            }
        }
    }
    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }
    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }
    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    //噫？VSC的代码补全也太强了吧！

    void display(){
        System.out.println(month+"/"+day+"/"+year);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("分别输入年，月，日");
        int y=input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();
        date da=new date(m, d, y);
        System.out.println(da.getDay());
        System.out.println(da.getMonth());
        System.out.println(da.getYear());
        input.close();
    }
}
