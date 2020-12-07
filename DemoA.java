import jdk.nashorn.internal.runtime.FindProperty;
import sun.security.util.Length;

import javax.naming.directory.SearchControls;
import java.util.Scanner;

public class DemoA {

    public static int Fib3(int n){
        int mul = 1;
        for (int i = 1; i <=n ; i++) {
            mul *= i;
        }
        return mul;
    }
    public static void main4(String[] args) { // n的阶乘
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib3(n));
    }
    public static int Fac1(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += Fac2(i);
        }
        return sum;
    }
    public static int Fac2(int n){
        int mul = 1;
        for (int j = 1; j <=n ; j++) {
            mul *= j;
        }
        return mul;
    }
    public static void main3(String[] args) {  //阶乘之和
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fac1(n));
    }
    public  static  int Fib(int n){
        int Fib1= 1;
        int Fib2 = 1;
        int Fib3 = 1;
        for (int i = 3; i <=n ; i++) {
            Fib3 = Fib1 + Fib2;
            Fib1 = Fib2;
            Fib2 = Fib3;
        }
        return Fib3;
    }
    public static void main2(String[] args) { //  斐波那契额数 迭代
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n));
    }
    public  static  void  Find(int[] arr){
        int i = arr[0];
        for (int j = 1; j < arr.length; j++) {
            i = i^arr[j];
        }
        System.out.println(i);
    }
    public static void main1(String[] args) { //找数组中出现一次的数字
        int[] array = {1,2,3,3,1};
        Find(array);
    }
}
