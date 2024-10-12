package linkedlist;

public class TestMyLinkedList {

    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList();

        System.out.println("list size :" + list.size());
        list.linkFirst("wqeiry234");
        list.linkFirst("kjdefbgec");
        list.linkLast("lastlastla");
        list.linkFirst("firstfirs");
        list.addIndex(3,"33333333333");
        System.out.println(list.contains("33333333333"));
        System.out.println("list size :" + list.size());
        list.display();
    }
}
