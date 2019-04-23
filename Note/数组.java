import java.util.Arrays;//记得导入这个数组操作包

class 笔记{ //为了醒目，就用中文命名了_(:з」∠)_
    void 数组(){
        int [] week={1,2,3,4,5,6,7};//直接初始化+生成数组
        int len=week.length;
        System.out.println("长度是："+len);

        int [] a=new int [5];//定义长度为5的整型数组a
        int [] b=new int [5];
        Arrays.fill(a,1);//把1填充到数组a里
        Arrays.fill(b, 2,4,20);//把20填充2-4的位置

        //用for循环输出，同C语言（赞许Python的输出）
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("现在输出B");
        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }

        //数组复制
        int []c={11,12,13,14,15};
        System.arraycopy(c, 0, a, 2, 3);//嗯嗯嗯？英语解释看不懂，改天再说
        System.out.println("复制后");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }

        //数组比较
        if(Arrays.equals(a,b))
            System.out.println("\n两个数组相等");
        else
            System.out.println("\n数组不相等");

        //数组排序
        Arrays.sort(a);//排序a
        int []d={8,5,9,7,4,2,5};
        System.out.println("D是");
        for(int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }
        Arrays.sort(d,2,5);//将2-5位置排序
        System.out.println("D部分排序后是");
        for(int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }
        //排序数组d
        Arrays.sort(d);
        System.out.println("\n完全排序后");
        for(int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }

        //搜索指定元素
        int [] e={54,65,98,23,4,65};
        int num1=Arrays.binarySearch(e, 98);
        int num2=Arrays.binarySearch(e, 3, 6,65);//在3-6的位置搜索65

        if(num1>=0)
            System.out.println("98的位置是 "+num1);
        else
            System.out.println("不存在");
        if(num2>=0)
            System.out.println("65的位置是 "+num2);
        else
            System.out.println("位置不存在");
        
        //类型转化
        System.out.println("\n");
        Arrays.toString(d);//d是int列表
        System.out.printf("转化后的是%s \n\n", d);
        //换种方式吧~
        System.out.printf("直接输出转化后的是%s ", Arrays.toString(d));


        //二维数组了解一下咧~
        //等会，我似乎没学过Python的二维数组？
        int[][] num;//声明一个二维数组
        int[][][][] four;//四维数组，谁闲的没事玩这玩意儿？

        int[][] num3=new int [3][4];//创建好一个二维数组，长度是3,4
        String[][] str1=new String[2][2];//字符串类型的二维数组
        
        int [][] num4={{3,6,9},{1,2,3,4}};//直接赋值
        
        System.out.println("\n输出二维数组");

        int i,j;
        //像C语言一样用for循环输出（这里点名表扬Python的便捷输出）
        for(i=0;i<num4.length;i++){
            for(j=0;j<num4[i].length;j++){
                System.out.print(num4[i][j]+" ");
            }
            System.out.println();
        }        
    }



    void 字符串(){
        String fuck="hello motherfucker~";
        int 长度=fuck.length();
        System.out.println(长度);

        //字符串比较
        String fuck2="what a hell?";
        System.out.println(fuck.equals(fuck2));//返回的是布尔

        //截取一部分字符串
        String sub1=fuck.substring(2, 15);//截取2-15
        System.out.println("从2-15截取："+sub1);

        //查找&替换
        String word1="I love java";
        String word2="java";
        int index=word1.indexOf(word2);//在w1中查找w2的技术
        System.out.println(index);

        String newword=word1.replace("java", "Python");//后面的词，替换前面的
        System.out.println(newword);

        char[] hello={'h','e','l','l','o'};
        String comhello=new String(hello);//列表组合成一个str
        System.out.println("合成的一个str："+comhello);
        char[] single=comhello.toCharArray();//把字符串转化为字符列表
        System.out.println("str合成一个列表");
        for(int i=0;i<single.length;i++){//用循环输出转化后的字符串列表
            System.out.println(single[i]);
        }
    }


    public static void main(String[] args) {
        //StringBuffer类，非常棒的一个字符串操作方法，节约空间，提升效率
        //会直接改变原定义的内容，比如下面这个例子——sb
        StringBuffer sb=new StringBuffer();//声明一个StringBuffe变量
        sb.append("I ");
        sb.append("love ");
        sb.append("java ");
        System.out.println(sb);
        System.out.println(sb.toString());//闲着没事可以转化成string格式
        sb.insert(2, "don't ");//插入
        System.out.println("插入 "+sb);
        sb.delete(13, 18);//删除13-18位置的内容
        System.out.println("删除java "+sb);
        sb.replace(13,15,"python");
        sb.delete(2,8);
        System.out.println("替换后 "+sb);
    }
}