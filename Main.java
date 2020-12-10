import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main5(String[] args) { //创建一个 int 类型的数组,
        int[] array5 = new int[100];//元素个数为 100, 并把每个元素依次设置为 1 - 100
        String newArray = Arrays.toString(Create(array5));
        System.out.println(newArray);
    }
    public static int[] Create(int[] array){
        for (int i = 0; i <array.length ; i++) {
            array[i]=i + 1;
        }
        return array;
    }
    public static void main4(String[] args) { //打印数组
        int[] array4 = {1,2,3,4,5,6,7,8,9};
        printArray(array4);
    }
    public static void printArray(int[] array){
        for (int x:array
             ) {
            System.out.print(x+" ");
        }
    }
    public static void main3(String[] args) {  //改变原有数组元素的值
        int[] array3 = {1,2,3};
        String newArr = Arrays.toString(transform(array3));
        System.out.println(newArr);
    }
    public static int[] transform(int[] array){
        int[] arr = new int[3];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i]*2;
        }
        return arr;
    }
    public static void main2(String[] args) {  //数组所有元素之和
        Scanner sc = new Scanner(System.in);
        int[] array2 = new int[6];
        for (int i = 0; i < 6; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println(sum(array2));
    }
    public static int sum(int[] array){
        int sub = 0;
        for (int x:array
             ) {
            sub += x;
        }
        return sub;
    }
    public static void main1(String[] args) { //求数组的平均值
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[6];
        for (int i = 0; i < 6; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println(avg(array1));
    }
    public static double avg(int[] array){
        double sum = 0;
        double average = 0.0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];
        }
        average = sum/2;
        return average;
    }
}
