package lesson4;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> iList = new GBLinkedList<>();
        System.out.println(iList.size() + ": " + iList);
        iList.add(1);
        System.out.println(iList.size() + ": " + iList);
        iList.add(2);
        System.out.println(iList.size() + ": " + iList);
        iList.add(3);
        System.out.println(iList.size() + ": " + iList);

        iList.add(0, 0);
        System.out.println(iList.size() + ": " + iList);
        iList.add(1, 77);
        iList.add(5, 88);
        System.out.println(iList.size() + ": " + iList);

        for (Integer itm : iList) {
            System.out.println(itm);
        }

        GBList<Node<String>> nodes = new GBLinkedList<>();
        nodes.add(new Node<String>("aaa"));
        nodes.add(new Node<String>("tttth"));
        nodes.add(new Node<String>("hhghghghg"));
        for (Node<String> n : nodes) {
            System.out.println(n.currentElement);
        }

    }
}