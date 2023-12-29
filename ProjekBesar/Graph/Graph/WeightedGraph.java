import java.util.*;
class Edge {
    String destination;
    int weight;

    // Konstruktor untuk inisialisasi edge berbobot
    public Edge(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

class WeightedGraph {
    private Map<String, List<Edge>> adjacencyList;

    // Konstruktor untuk inisialisasi graf berbobot
    public WeightedGraph() {
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node baru ke dalam graf
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // Menambahkan edge berbobot antara dua node
    public void addEdge(String source, String destination, int weight) {
        // Pastikan node sumber ada dalam adjacency list
        adjacencyList.putIfAbsent(source, new ArrayList<>());

        // Tambahkan edge berbobot
        adjacencyList.get(source).add(new Edge(destination, weight));
    }

    // Mencetak struktur graf bersama dengan bobot edge
    public void printGraph() {
        for (String node : adjacencyList.keySet()) {
            System.out.print("Node " + node + " terhubung dengan: ");
            for (Edge edge : adjacencyList.get(node)) {
                System.out.print(edge.destination + "(" + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Membuat objek graf berbobot
        WeightedGraph graph = new WeightedGraph();

        // Menambahkan node-node ke dalam graf
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Menambahkan edge-edge berbobot antara node-node
        graph.addEdge("A", "B", 5);
        graph.addEdge("A", "C", 3);
        graph.addEdge("B", "C", 2);
        graph.addEdge("C", "D", 4);

        // Menampilkan struktur graf bersama dengan bobot edge
        graph.printGraph();
    }
}
