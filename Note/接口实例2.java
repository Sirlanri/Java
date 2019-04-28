class Employee{
    String name;
    String gender;
    int age;
    int salary;
    public Employee(String name,String gender,int age,int salary){
        super();
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.salary=salary;
    }
    //以下代码为vscode自动生成
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }
}

interface PersonForm{//定义接口
    public int getFormCol();
    public int getFormRow();
    public String getValue(int row,int col);
    public String getColName(int col);
}

class FormA implements PersonForm{
    String [][] data;

    public FormA(String [][] data){//带参数的构造方法，传入一个二维数组
        this.data=data;
    }
    public String getColName(int col){//获得指定的列名
        return data[0][col];
    }
    public int getFormCol(){//获得表格的列数
        return data[0].length;
    }
    public int getFormRow(){//获得表格的行数
        return data.length - 1;
    }
    public String getValue(int raw,int col){//获得指定某行某列的值
        return data[raw+1] [col];
    }
}

class FormB implements PersonForm{
    Employee[] data;

    public FormB(Employee[] data){//带参数的构造参数
        this.data=data;
    }
    public String getColName(int col){
        switch(col){
            case 0:
                return "姓名\t";
            case 1:
                return "性别\t";
            case 2:
                return "年龄\t";
            case 3:
                return "工资\t";
            default://最后一个选项必须有的哟
                return null;
        }
    }
    public int getFormCol(){
        return 4;
    }
    public int getFormRow(){
        return data.length;
    }
    public String getValue(int row,int col){
        switch(col){
            case 0:
                return data[row].getName();
            case 1:
                return data[row].getGender();
            case 2:
                return data[row].getAge()+"";
            case 3:
                return data[row].getSalary()+"";
            default:
                return null;
        }
    }
}

class Table{//表格类
    PersonForm form;

    public Table(PersonForm form){//传入的是接口类型的数据
        //带参数的构造方法
        this.form=form;
    }          
    public void display(){//输出格式和取值
        for (int i=0;i<form.getFormCol();i++){//循环显示列名
            System.out.println(form.getColName(i));
        }
        System.out.println("----------");
        for(int i=0;i<form.getFormRow();i++){//循环显示行信息
            for(int j=0;j<form.getFormCol();j++){//循环显示列信息
                System.out.println(form.getValue(j, j)+"\t");
            }
            System.out.println();
        }
    }
}

class TextInterface{
    public static void main(String[] args) {
        String[][] str=new String[][]{    //二维字符串数组
            {"name\t","gender\t","age\t","salary\t"},
            {"Tom","male","20","2000"},
            {"Linda","female","21","2001"},
            {"susan","female","22","2200"},
            {"Ansen","female","24","2500"}
        };
        PersonForm form=new FormA(str);//接口变量引用类对象
        Table table=new Table(form);
        table.display();
        System.out.println("++++++++++++");
        Employee em1=new Employee("张三", "男", 20, 2000);
        Employee em2=new Employee("李四", "女", 22, 21000);
        Employee em3=new Employee("艾米莉亚", "女", 16, 88886);
        Employee em4=new Employee("雷姆", "女", 15, 2100);
        Employee em5=new Employee("拉姆", "女", 15, 2500);
        Employee[] data={em1,em2,em3,em4,em5};//创建员工数组
        PersonForm form1=new FormB(data);//接口变量引用类对象
        Table table2=new Table(form1);//创建表格实例
        table2.display();//显示员工薪资
        System.out.println("程序运行完毕");
    }
}