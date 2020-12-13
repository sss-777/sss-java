import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
    public static void main5(String[] args) { //数组转字符串
        int[] array5 = {1,2,3,4,5};
        System.out.println(toString(array5));
    }
    public static String toString(int[] array){
        if(array==null){
            return null;
        }
        String ret = "[";
        for (int i = 0; i <array.length ; i++) {
            ret += array[i];
            if(i != array.length-1){
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main4(String[] args) { //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
        int[] array4 = {1,2,3,4,5};
        System.out.println(Arrays.toString(copyOf(array4)));
    }
    public static int[] copyOf(int[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
    public static void main3(String[] args) { // 给定一个有序整型数组, 实现二分查找
        int[] array3 = {1,2,3,4,5,6,7,8,9};
        int key = 6;
        System.out.println(BinarySearch(array3,key));
    }
    public static int BinarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(array[key] > array[mid]){
               left = mid + 1;
            }else if(array[key] < array[mid]){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main2(String[] args){ //给定一个整型数组, 判定数组是否有序（递增）
        int[] array2 = {1,2,9,4,5};
        System.out.println(ordered(array2));
    }
    public static boolean ordered(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main1(String[] args) { //给定一个整型数组, 实现冒泡排序(升序排序)
        int[] array1 = {2, 1, 4, 3, 9, 6};
        BubbleSort(array1);
        System.out.println(Arrays.toString(array1));
    }
    public static void BubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length - 1; i++) {
            flg = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
                if(flg == false){
                    return;
                }
            }
        }
    }
}
