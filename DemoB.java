import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoB {
    public static void main(String[] args) {  //青蛙跳台阶
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(jump1(n));
        System.out.println(jump2(n));
        System.out.println(jump3(n));
    }
    public static int jump1(int n){ //非递归
        if(n<3){
            return n;
        }
        int a = 1;
        int b = 2;
        int sum = 0;
        for (int i = 3; i <=n ; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
    public static int jump2(int n){ // 递归
        if(n<3){
            return n;
        }
        return jump2(n-1) + jump2(n-2);
    }
    public static int jump3(int n){ //变态跳
        if(n<3){
            return n;           //f(n) = f(n-1) + f(n-2) + f(n-3) + … + f(0)
                                //f(n-1) = f(n-2) + f(n-3) + f(n-4) +… +f(0)
                                //两式联合可以推出 f(n) = 2 * f(n-1)
        }
        return 2*jump3(n-1);
    }
    public static void main10(String[] args) { // 汉诺塔问题
        hanota(3,'a','b','c');
    }
    public static void hanota(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
            return;
        }
        hanota(n-1,pos1,pos2,pos3);
        move(pos1,pos3);
        hanota(n-1,pos2,pos1,pos3);
    }
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void main9(String[] args) { // n的阶乘
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    public static int fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main8(String[] args) { //1到n依次相加
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main7(String[] args) { //输出一个数的每一位
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n>9){
            print(n/10);
        }
        System.out.print(n%10 + " ");
    }
    public static void main6(String[] args) {  //输出一个数的每位数之和
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sub(n));
    }
    public static int sub(int n){
        if(n>=0) {
            if (n == 0) {
                return 0;
            } else {
                return n % 10 + sub(n / 10);
            }
        }else{
            return 0;
        }
    }
    public static void main5(String[] args) { // 斐波那契数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n));
    }
    public static int Fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }
    public static void main4(String[] args) { //数字之和的重载计算
        int n = 2;
        int m = 3;
        double i = 2.1;
        double j = 3.5;
        double k = 5.4;
        System.out.println(sub(n,m));
        System.out.println(sub(i,j,k));
    }
    public static int sub(int n, int m){
        return n+m;
    }
    public static double sub(double i,double j,double k){
        return i+j+k;
    }
    public static void main3(String[] args) { //比较数字大小的重载计算
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        System.out.println(max(i, j));
        System.out.println(max(n, m));
        System.out.println(max(i, n, m));
    }

    public static int max(int n, int m) {
        if (n < m) {
            return m;
        }else{
            return n;
        }
    }

    public static double max(double n, double m) {
        if (n < m) {
            return m;
        }else{
            return n;
        }
    }

    public static double max(int n, double m, double l) {
        if (n < (int) max(m, l)) {
            return max(m,l);
        }else{
            return n;
        }
    }
        public static void main2 (String[]args){ //判断数的大小
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(max3(i, j, k));
        }
        public static int max2 ( int n, int m){
            if (n < m) {
                n = n ^ m;
                m = n ^ m;
                n = n ^ m;
            }
            return n;
        }
        public static int max3 ( int n, int m, int l){
            return max2(max2(n, m), l);
        }
        public static void main1 (String[]args){ //将一个数组中的奇数放在前面，偶数放在后面，不考虑大小。
            int[] arr = {1, 2, 3, 4, 5, 6};
            Order(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void Order ( int[] arr){
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                while (left < right && arr[left] % 2 == 1) {
                    left++;
                }
                while (left < right && arr[right] % 2 == 0) {
                    right--;
                }
                if (left < right) {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                }
            }
        }
    }

