package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int s : numbers) {
            addNode(s, root);
        }
        dfs(root);
    }

    private  static void dfs(Node node){
        if (node == null){
            return;
        }

        dfs(node.getLeft());
        System.out.println(node.getValue() + " ");
        dfs(node.getRight());
    }

    private static void addNode(int insertValue, Node root){
        if (root == null){
            return;
        }

        Node current = null;
        Node nextNode = root;

        while(nextNode != null){
            current = nextNode;

            if (insertValue < current.getValue()){
                nextNode = current.getLeft();
            }
            else {
                nextNode = current.getRight();
            }
        }

        if (insertValue < current.getValue()){
            current.setLeft(new Node(insertValue));
        }
        else {
            current.setRight(new Node(insertValue));
        }
    }
}

     class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
