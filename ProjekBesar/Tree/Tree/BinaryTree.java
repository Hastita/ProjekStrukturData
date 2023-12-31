class Node {
    int data;        // Nilai pada node yang menggunakan tipe data integer
    Node left, right; // Referensi ke kiri dan kanan

    // membuat node baru dengan nilai awal atau null
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {

    Node root;  //untuk menyimpan referensi ke akar pohon

    // untuk run atau menjalankan
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();  // membuat BinaryTree baru

        // Membuat struktur pohon biner 
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.right.left = new Node(9);
        tree.root.right.left.left = new Node(10);

        // Memanggil metode printTree untuk mencetak struktur pohon
        printTree(tree.root, "", true);
    }

    // Metode untuk mencetak struktur pohon 
    public static void printTree(Node node, String indent, boolean last) {
        if (node != null) {
            // Mencetak nilai node 
            System.out.println(indent + "+-- " + node.data);
    
            indent += last ? "    " : "|   ";

            // Rekursif untuk mencetak anak kanan dan anak kiri
            printTree(node.right, indent, false);
            printTree(node.left, indent, true);
        }
    }
}
