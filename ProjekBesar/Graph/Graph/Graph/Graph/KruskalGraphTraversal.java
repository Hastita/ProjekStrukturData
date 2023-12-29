import java.util.*;

// Representasi Edge pada Graf
class Edge implements Comparable<Edge> {
    String source;       // Node asal
    String destination;  // Node tujuan
    int weight;          // (Weight) dari edge bertipe data integer 

    public Edge(String source, String destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    // Metode pembanding untuk sorting berdasarkan bobot edge
    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.weight, other.weight);
    }
}

// Kelas untuk Traversal Graf
public class KruskalGraphTraversal {
    private List<Edge> edges = new ArrayList<>();    // List untuk menyimpan edge2 graf
    private Map<String, String> parent = new HashMap<>(); // Map untuk menyimpan parent setiap node

    // Menambahkan edge ke list edges
    public void addEdge(String source, String destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }

    // Metode untuk mencari parent suatu node dalam set
    public String find(String node) {
        // Jika node belum memiliki parent, set node sebagai parent
        if (!parent.containsKey(node)) {
            parent.put(node, node);
        }

        // Jika node bukan merupakan root rekursif akan mencari root
        if (!parent.get(node).equals(node)) {
            parent.put(node, find(parent.get(node)));
        }

        return parent.get(node);
    }

    // Metode untuk menggabungkan dua set berdasarkan root masing2 set
    public void union(String node1, String node2) {
        String parent1 = find(node1);
        String parent2 = find(node2);
        parent.put(parent1, parent2);
    }

    // Metode untuk menjalankan algoritma Kruskal dan mencetak Minimum Spanning Tree (MST)
    public void kruskalMST() {
        Collections.sort(edges); // Mengurutkan edge2 berdasarkan bobot

        int mstWeight = 0; // Variabel untuk menyimpan total bobot MST
        for (Edge edge : edges) {
            String root1 = find(edge.source);
            String root2 = find(edge.destination);

            // Jika node asal dan tujuan tidak memiliki root yang sama atau tidak membentuk siklus
            if (!root1.equals(root2)) {
                System.out.println(edge.source + " - " + edge.destination + " [" + edge.weight + "]");
                mstWeight += edge.weight;
                union(edge.source, edge.destination); // Menggabungkan edge.source dan edge.destination
            }
        }

        System.out.println("Total bobot MST: " + mstWeight);
    }

    // Metode main untuk menguji algoritma Kruskal 
    public static void main(String[] args) {
        KruskalGraphTraversal graph = new KruskalGraphTraversal();
        
        // Menambahkan edge-edge pada graf
        graph.addEdge("A", "B", 6);
        graph.addEdge("A", "D", 4);
        graph.addEdge("B", "C", 7);
        graph.addEdge("B", "E", 10);
        graph.addEdge("C", "D", 8);
        graph.addEdge("C", "E", 5);
        graph.addEdge("D", "E", 3);
        
        // Menjalankan algoritma Kruskal
        graph.kruskalMST();
    }
}
