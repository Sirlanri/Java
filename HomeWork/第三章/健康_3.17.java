class health{
    String first,last,sexy;
    int year,month,day,beats;
    double height,weight,bmi,heart;
    //懒得用构造函数了(这个我会=-=)，直接用VSC自动生成的set和get吧

    double cbmi(){
        return weight/(height*height);
    }
    void cheart(){
        beats=220-(2019-year);
        double max=0.85*beats;
        double min=0.5*beats;
        System.out.println("最高："+max+"\n最低："+min);
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
   }
   /**
    * @param day the day to set
    */
   public void setDay(int day) {
       this.day = day;
   }
   /**
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
    * @param height the height to set
    */
   public void setHeight(double height) {
       this.height = height;
   }
   /**
    * @param weight the weight to set
    */
   public void setWeight(double weight) {
       this.weight = weight;
   }
   /**
    * @param sexy the sexy to set
    */
   public void setSexy(String sexy) {
       this.sexy = sexy;
   }
   /**
    * @param beats the beats to set
    */
   public void setBeats(int beats) {
       this.beats = beats;
   }


}