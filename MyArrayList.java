import java.util.Arrays;

public class MyArrayList {
    private int[] elem;
    private int usedSize;

    public MyArrayList() {
        this.elem = new int[5];
    }

    public MyArrayList(int capacity) {
        this.elem = new int[capacity];
    }
    public void init(int array[]) {
        usedSize = usedSize + array.length;
        for (int i = 0; i <this.usedSize ; i++) {
            this.elem[i] = array[i];
        }
    }
    public void disPlay() { //打印顺序表
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void resize() {  //扩容顺序表
        this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
    }

    public boolean Full() {  //判断顺序表是否为满
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    public void add(int pos, int data) {   //在pos位置加入一个data
        if (Full()) {
            resize();
        }
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }
        for (int i = this.usedSize; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    public void add2(int data) { //往尾部差data
        if (Full()) {
            resize();
        }
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    public boolean contains(int toFind) {  //查找是否有某个值
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        for (int i = 0; i <this.usedSize ; i++) {
            if (this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        if(pos >= 0 || pos < this.usedSize){
            return this.elem[pos];
        }
        else{
            return -1;
        }
    }
    public void setPos(int pos,int value){
        if(pos >= 0 || pos < this.usedSize){
            this.elem[pos] = value;
            return;
            }else{
            System.out.println("pos不合法");
            }
        }
    public void remove(int toRemove){
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i] == toRemove){
                for (int j = i; j <this.usedSize-1 ; j++) {
                    this.elem[j] = this.elem[j+1];
                    this.usedSize--;
                    return;
                }
            }
        }
    }
    public int size(){
        return this.usedSize;
    }
    public void clear(){
        this.usedSize = 0;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        MyArrayList myArrayList = new MyArrayList(6);
        myArrayList.init(array);
        myArrayList.disPlay();
        boolean d = myArrayList.Full();
        System.out.println(d);
        myArrayList.resize();
        myArrayList.add(2,4);
        myArrayList.disPlay();
        myArrayList.add2(7);
        myArrayList.disPlay();
        boolean f = myArrayList.contains(3);
        System.out.println(f);
        System.out.println(myArrayList.getPos(4));
        System.out.println(myArrayList.search(4));
        myArrayList.remove(3);
        myArrayList.disPlay();
        System.out.println(myArrayList.size());
        myArrayList.clear();
    }
}

