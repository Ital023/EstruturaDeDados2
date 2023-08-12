public class Tree {
    Node root;

    Tree(int value){
        root = new Node();
        root.info = value;
    }
    public Tree() {
        root = new Node();
    }

    void insert(int value){
        insert(root,value);
    }

   void insert(Node root,int value){
        if(root == null){
            root = new Node();
            root.info = value;

        }else{
            if(value < root.info){
                //Inserir a esquerda
                insert(root.left,value);
            }else{
                //Inserir a direita
                insert(root.right,value);
            }
        }


    }



}
