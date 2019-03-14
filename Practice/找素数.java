//闲的没事别看这份代码，有点小难 <(￣︶￣)>

import java.util.Arrays;

public class 找素数{
    private static boolean[] findNum (int num){//for筛选质数
        //必须大于0
        if(num<=0){
            System.out.println("值必须大于0哟");
            return null;
        }

        //是质数，返回true，比如isPrime[2]=true
        boolean[] isPrime=new boolean[num+1];

        isPrime[1]=false;//1不是素数
        Arrays.fill(isPrime,2,num+1,true);//将布尔数组元素都赋值为true
        int n=(int)Math.sqrt(num);//求开方
        for(int i=1;i<n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<num;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        return isPrime;
    }
    public static void showArea(int num){//显示指定范围内的质数
        boolean [] primes=findNum(num);//调用方法赋值给布尔数组
        int num1=0;
        if(primes!=null){
            for(int i=1;i<primes.length;i++){
                if(primes[i]){
                    System.out.println(i+" ");
                }
            }
            System.out.println();
        }
        System.out.println("一共有"+num1+"个");
    }
    public static void main(String[] args) {
        int number=200;
        System.out.println("范围在"+number+"的质数有：");
        showArea(number);
    }
}