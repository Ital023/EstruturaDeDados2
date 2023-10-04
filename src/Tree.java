public class Tree {
    Node root;
    Tree() {
        root = null;
    }


    Tree(int value) {
        root = new Node(value);
    }

    void insert(int value) {
        root = insert(root, value, null);
    }

    Node insert(Node root, int value, Node parent) {
        if (root == null) {
            Node newNode = new Node(value);
            newNode.parent = parent;
            return newNode;
        }

        if (value < root.info) {
            root.left = insert(root.left, value, root);
        } else {
            root.right = insert(root.right, value, root);
        }
        return root;
    }
    Node search(int value) {
        return search(root, value);
    }

    Node search(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (root.info == value) {
            return root;
        } else {
            if (value < root.info) {
                return search(root.left,value);
            } else {
                return search(root.right,value);
            }
        }
    }


    void inOrder() {
        inOrder(root);
    }


    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.info + " ");
            inOrder(root.right);
        }
    }

    void preOrder(){
        preOrder(root);
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.info + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void posOrder(){
        posOrder(root);
    }

    void posOrder(Node root) {
        if (root != null) {
            posOrder(root.left);
            posOrder(root.right);
            System.out.print(root.info + " ");
        }
    }
    void printTree(Node root,String string) {
        if (root != null) {
            System.out.println(string + "|- " + root.info);

            if (root.left != null || root.right != null) {
                printTree(root.right, string + "   |");
                printTree(root.left, string + "   ");
            }
        }
    }
    void delete(int value){
        Node node = search(value);

        if (node.left == null && node.right == null) {
            if (node.parent != null) {
                if (node == node.parent.left) {
                    node.parent.left = null;
                } else {
                    node.parent.right = null;
                }
            } else {
                root = null;
            }
        }
        else if(node.left == null || node.right == null) {
            if (node.parent != null && node == node.parent.left && node.left != null) {
                node.parent.left = node.left;
                node.left.parent = node.parent;
                return;
            }
            if (node.parent != null && node == node.parent.left) {
                node.parent.left = node.right;
                node.right.parent = node.parent;
                return;
            }
            if (node.parent != null && node == node.parent.right && node.left != null) {
                node.parent.right = node.left;
                node.left.parent = node.parent;
                return;
            }
            if (node.parent != null && node == node.parent.right) {
                node.parent.right = node.right;
                node.right.parent = node.parent;
                return;
            }
        }
        else {
            Node successor = minimum(node.right);

            if (successor.parent.left == successor) {
                successor.parent.left = null;
            } else {
                successor.parent.right = null;
            }
            node.info = successor.info;
        }

    }
    Node minimum(Node node) {
        if (node.left != null) {
            return minimum(node.left);
        }
        return node;
    }

    Node rotacaoSimples(Node raiz) {
        Node filho = raiz.right;
        raiz.right = filho.left;
        filho.left.parent = raiz;
        filho.left = raiz;
        raiz.parent = filho;
        return filho;
    }

}

