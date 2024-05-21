import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.indexOf(300);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(20);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        var array = arrayList.toArray();
        System.out.println(Arrays.toString(array));
    }
}