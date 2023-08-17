public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(16);
        tree.insert(14);
        tree.insert(19);
        tree.insert(15);
        tree.insert(12);
        tree.insert(22);
        tree.insert(17);


        System.out.println(tree.root.info);
        System.out.println(tree.root.left.info);
        System.out.println(tree.root.right.info);



    }
}