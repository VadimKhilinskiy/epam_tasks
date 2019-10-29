package binary_tree;

public class Tree {
    private Node root;

    public Node find(int key){
        Node current = root;
        while(current.key!=key){
            if(current.key<key){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }
            if(current==null){
                return null;
            }
        }
        return current;
    }

    public void insert(int key, String data){
        Node node = new Node();
        node.key = key;
        if(root==null){
            root = node;
        }else{
            Node current = root;
            Node prev = null;
            while (true){
                prev = current;
                if(key<prev.key){
                    current = current.leftChild;
                    if(current==null){
                        prev.leftChild = node;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if(current==null){
                        prev.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public void lvp(Node startNode){
        if(startNode != null){
            lvp(startNode.leftChild);
            startNode.print();
            lvp(startNode.rightChild);
        }
    }


}
