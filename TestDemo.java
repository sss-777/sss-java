import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {  //交换两个数组的内容
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {6,7,8,9,0};
        Swap(array2,array3);
        System.out.println("array2:"+Arrays.toString(array2));
        System.out.println("array3:"+Arrays.toString(array3));
    }
    public static void Swap(int[] array2,int[] array3){
        for (int i = 0; i <array2.length ; i++) {
            int tmp = array2[i];
            array2[i] = array3[i];
            array3[i] = tmp;
        }
    }
    public static void main1(String[] args) {    //将一个数组的偶数放在前面奇数放在后面，不要求大小排序
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Order(array1);
        for (int x : array1
        ) {
            System.out.print(x);
        }
    }

    public static void Order(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }
            while (left < right && array[right] % 2 == 1) {
                    right--;
                }
            if (left < right) {
                    int tmp = array[left];
                    array[left] = array[right];
                    array[right] = tmp;
                }
            }
        }
    }
