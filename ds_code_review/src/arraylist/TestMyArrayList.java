package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class TestMyArrayList {
    public static void main(String[] args) {

        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("g");

        arrayList.add(3,"3333333333");

        arrayList.display();




    }
}
