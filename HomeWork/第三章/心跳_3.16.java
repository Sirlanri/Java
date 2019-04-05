import java.util.Scanner;

class heart{
    Scanner input=new Scanner(System.in);
    int beats;
    String first;
    String last;
    int year,month,day;
    //构造方法直接导入年龄
    heart(int y,int m,int d){
        year=y;
        month=m;
        day=d;
    }
    void caculate(){
        beats=220-(2019-year);
        double max=0.85*beats;
        double min=0.5*beats;
        System.out.println("最高："+max+"\n最低："+min);
    }

    //以下内容是VSC的自动补全

    /**
     * @param beats the beats to set
     */
    public void setBeats(int beats) {
        this.beats = beats;
    }
    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }
    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = first;
    }
    /**
     * @param last the last to set
     */
    public void setLast(String last) {
        this.last = last;
    }/**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * @return the beats
     */
    public int getBeats() {
        return beats;
    }
    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }
    /**
     * @return the first
     */
    public String getFirst() {
        return first;
    }
    /**
     * @return the last
     */
    public String getLast() {
        return last;
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
        return 2019-year;
    }

    public static void main(String[] args) {
        heart a=new heart(2000, 2, 10);
        a.caculate();
    }
    

}