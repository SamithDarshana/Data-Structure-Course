import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    private int[] arr;
    private int count;

    private int i;
    public ArrayList<Integer> num;
    public Array(int length){
        arr = new int[length];
    }

    void insert(int item){
        if(count == arr.length){
            int[] newArr = new int[count*2];
            for (int j = 0; j < count; j++) {
                newArr[j] = arr[j];
            }
            arr = newArr;
        }
        arr[count] = item;
        count++;
    }

    void removeAt(int index){
        if(index >= count || index<0 ) {
            System.out.println("-1");
            return;
        }
        for (int j = index; j < count-1 ; j++) {
            arr[j] = arr[j+1];
        }
        count--;
    }
    void indexOf(int value){
        for (int i = 0; i < count; i++) {
            if(value == arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
    void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

}
