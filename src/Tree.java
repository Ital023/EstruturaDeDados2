public class Tree {
    Node root;
    Tree(int value){
        root = new Node(value);
    }
    public Tree() {
        root = new Node();
    }

    void insert(int value){
        insert(root,value);
    }

    void insert(Node root,int value){
        if(root == null){
            root = new Node(value);
        }else{
            if(value < root.info){
                //Inserir a esquerda
                if(root.left == null){
                    root.left = new Node(value);
                }else{
                    insert(root.left,value);
                }
            }else{
                //Inserir a direita
                if(root.right == null){
                    root.right = new Node(value);
                }else{
                    insert(root.right,value);
                }

            }
        }
    }

    void inOrder() {
        inOrder(root);
    }

    void inOrder(Node root){
        if(root != null){
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
    void posOrder(Node root){
        if (root != null) {
            posOrder(root.left);
            posOrder(root.right);
            System.out.print(root.info + " ");
        }
    }

}

