import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
//        MyArrayList arr = new MyArrayList();
//        arr.add(10);
//        arr.add(3);
//        arr.add(4);
//        arr.add(6);
//        arr.add(577);
//        arr.add(99);
//        arr.add(434);
//        arr.add(23);
//        arr.add(675);
//        arr.add(345);
//        arr.add(-626);
//        arr.add(10);
//        System.out.println(arr);
//
//        arr.remove(0);
//        arr.remove(0);
//        arr.remove(0);
//        arr.remove(4);
//        arr.remove(4);
//        arr.remove(4);
//        arr.remove(4);
//        arr.remove(4);
//        System.out.println(arr);
//        arr.remove(2);
//        System.out.println(arr);
//        arr.remove(2);
//        System.out.println(arr);
//        arr.remove(2);
//
//        System.out.println(arr);
//        System.out.println(arr.getArrSize());

        MyLinkedList linkArr = new MyLinkedList();
        linkArr.add(13);
        linkArr.add(55);
        linkArr.add(23);
        System.out.println(linkArr);

        System.out.println(linkArr.get(0));
        System.out.println(linkArr.get(1));
        System.out.println(linkArr.get(2));
        System.out.println(linkArr.get(3));

        linkArr.remove(4);
        linkArr.remove(2);
        linkArr.remove(0);
        linkArr.remove(0);
        System.out.println(linkArr);
    }
}
