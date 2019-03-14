import java.util.Arrays;


public class 数组{
    public static void main(String[] argStrings){
        int [] week={1,2,3,4,5,6,7};
        int len=week.length;
        System.out.println("长度是："+len);

        int [] a=new int [5];//定义长度为5的整型数组a
        int [] b=new int [5];
        Arrays.fill(a,1);//把1填充到数组a里
        Arrays.fill(b, 2,4,20);//把20填充2-4的位置

        //for输出
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
}