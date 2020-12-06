import com.sun.org.apache.xalan.internal.lib.ExsltMath;

import java.util.Random;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=n ; j++) {
                    if(i==j||i==n-j+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main14(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = "woshizhu";
        int count=1;
        while(count<4){
            String input=sc.nextLine();
            if(input.equals(key)){
                System.out.println("登陆成功");
            }else{
                System.out.println("密码错误");
            }
            if(count==3){
                System.out.println("退出程序");
            }
            count++;
        }
    }
    public static void print(int n){
        if(n<0){
            System.out.println(" ");
            n=-n;
        }
        if(n>9){
            print(n/10);
        }
        System.out.println(n%10);
    }
    public static void main13(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        print(i);
    }
    public static void main12(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                int k=i*j;
                System.out.print(k+"="+i+"*"+j+" ");
            }
            System.out.println();
        }
    }
    public static void main11(String[] args) {   //
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num=sc.nextInt();
        System.out.println("偶数序列：");
        for (int i = 31; i >0 ; i-=2) {
            System.out.print((num>>i)&1);
        }
        System.out.println();
        System.out.println("奇数序列：");
        for (int i = 30; i >=0 ; i-=2) {
            System.out.print((num>>i)&1);
        }
    }
    public static void main10(String[] args) {     //求二进制1的个数
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i = 0;i < 32;i++) {
            if(((num >> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main9(String[] args) {   //  求最大公约数
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i>j){
            i=i^j;
            j=i^j;
            i=i^j;
        }
        for (int k = i; k >0; k--) {
            if(i%k==0&&j%k==0){
                System.out.println(k);
                break;
            }
        }
    }
    public static void main8(String[] args) {     // 求分数的和
        double i=1.0;
        double sum=1.0;
        int n=0;
        for (n = 2; n < 101; n++) {
            i=-i;
            sum+=i/n;
        }
        System.out.println(sum);
    }
}

   
    public static void main7(String[] args) {    //求水仙花数
        int i=0;
        int j=0;
        int k=0;
        for (int l = 0; l < 1000; l++) {
            i=l/100;
            j=(l/10)%10;
            k=l%10;
            if(l== ExsltMath.power(i,3)+ExsltMath.power(j,3)+ExsltMath.power(k,3)){
                System.out.println(l);
            }
        }
    }
}

    public static void main6(String[] args) { //猜数字游戏
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int randNum = rc.nextInt(100);
        int inputNum = sc.nextInt();
        while (true) {
            if (inputNum > randNum) {
                System.out.println("猜大了");
            } else if (inputNum < randNum) {
                System.out.println("猜小了");
            } else {
                System.out.println("找到了");
                break;
            }
        }
        public static void main5 (String[]args){  //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n <= 18) {
                System.out.println("这个人是少年");
            } else if (n > 18 && n < 29) {
                System.out.println("这个人是青年");
            } else if (n > 28 && n < 56) {
                System.out.println("这个人是中年");
            } else {
                System.out.println("这个人是老年");
            }
        }
        public static void main4 (String[]args){  //给定一个数字，判定一个数字是否是素数
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 0;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    break;
                }
            }
            if (i == n) {
                System.out.println(n + "是素数");
            } else {
                System.out.println(n + "不是素数");
            }
        }
        public static void main3 (String[]args){  //打印 1 - 100 之间所有的素数
            int i = 0;
            int j = 0;
            for (i = 1; i < 101; i++) {
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        break;
                    }
                }
                if (j == i) {
                    System.out.println(i);
                }
            }
        }
        public static void main2 (String[]args){  //输出 1000 - 2000 之间所有的闰年
            for (int i = 1000; i < 2001; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    System.out.println(i);
                }
            }
        }
        public static void main1 (String[]args){   //1到100中9的个数
            int count = 0;
            for (int i = 1; i < 101; i++) {
                if (i % 10 == 9) {
                    count++;
                }
            }
            for (int j = 1; j < 101; j++) {
                if (j / 10 == 9) {
                    count++;
                }
            }
            System.out.println(count);
        }



