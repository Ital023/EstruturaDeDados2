public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(15);

        tree.insert(8);
        tree.insert(12);
        tree.insert(11);
        tree.insert(6);
        tree.insert(20);
        tree.insert(17);
        tree.insert(21);
        tree.insert(18);

        tree.delete(8);

        System.out.println(tree.search(12).info);

        tree.inOrder();




    }
}
