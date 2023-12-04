package yeni;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Car {
    public static void main(String[] args) {


        ArrayList<String> list1 =new ArrayList<>();
        List<String> list2 =new ArrayList<>();
        LinkedList<String> myList =new LinkedList<>();


        myList.add("Ali");
        myList.add("Veli");
        myList.add("Emrah");
        myList.add("Fatma");
        System.out.println(myList);

        myList.add(1,"Zeynep");
        System.out.println(myList);

        myList.addLast("Hüseyin");
        System.out.println(myList);

        myList.add("Ali");
        System.out.println(myList);

        myList.removeFirstOccurrence("Ali");
        myList.removeLastOccurrence("Ali");
        System.out.println(myList);

        System.out.println(myList.peek());
        System.out.println(myList.poll());
        System.out.println(myList);
        System.out.println(myList.pop());
        System.out.println(myList);


    }
}