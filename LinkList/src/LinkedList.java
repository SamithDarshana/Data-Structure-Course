import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;

        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    //add first
    void addFirst(int item){
        var node = new Node(item);
        if(first == null){
            first = last = node;
            first.next = null;
        }
        else {
            var temp = first;
            first = node;
            first.next = temp;
        }
        size++;
    }
    //add last
    void addLast(int item){
        var node = new Node(item);
        if(isEmpty()) {
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }
        size++;
    }
    //delete first
    void deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        } else if (size == 1) {
            first = last = null;
            size--;
        }
        else {
            var temp = first.next;
            first.next = null;
            first = temp;
            size--;
        }
    }
    //delete last
    void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        else if (size == 1) {
            first = last = null;
            size--;
        } //else if (size == 2) {
          //  last = first;
          //  first.next = last;
          //  size--;
         else {
            var prev = first;
            var temp = prev.next;
            while (temp.next != null){
                temp = temp.next;
                prev = temp;
            }
            last = prev;
            size--;
        }
    }
    void indexOf(int item){
        int count = 0;
        if(isEmpty())
            throw new NoSuchElementException();
        var current = first;
        while (current != null){
            if(current.value == item){
                System.out.println("Index : " + count);
                return;
            }
            current = current.next;
            count++;
        }
        throw new NoSuchElementException();
    }
    boolean contains(int item){
        if(isEmpty())
            throw new NoSuchElementException();
        var current = first;
        while (current != null){
            if(current.value == item)
                return true;
            current = current.next;
        }
        return false;
    }
    //print
    void print(LinkedList list){
        for (int i = 0; i < size; i++) {
            System.out.println(first.value);
            first = first.next;
        }
    }
    boolean isEmpty(){
        if(first == null)
            return true;
        else
            return false;
    }
    //contains
    //index of
}
