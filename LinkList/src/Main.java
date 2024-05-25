import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
         //System.out.println(list.contains(309));
        //list.indexOf(10);
        //list.deleteLast();
        //list.deleteLast();
        //list.print(list);
       // System.out.println(Arrays.toString(list.toArray()));
        //list.reverse_2();
        //list.print(list);
        list.getKthNodeFromEnd(6);
    }

}