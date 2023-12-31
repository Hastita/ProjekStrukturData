package Graph.Graph;

import java.util.*;

class SimpleGraph {
    private Map<Integer, List<Integer>> adjacencyList;

    // Konstruktor untuk inisialisasi graf
    public SimpleGraph() {
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node baru ke dalam graf
    public void addNode(Integer node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // Menambahkan edge (sambungan) antara dua node
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    // Mengembalikan daftar tetangga dari suatu node
    public List<Integer> getNeighbors(int node) {
        return adjacencyList.getOrDefault(node, Collections.emptyList());
    }

    // Menampilkan struktur graf beserta hubungan antar node
    public void printGraph() {
        for (int node : adjacencyList.keySet()) {
            System.out.print("Node " + node + " terhubung dengan: ");
            for (int neighbor : adjacencyList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Membuat objek graf
        SimpleGraph graph = new SimpleGraph();

        // Menambahkan node-node ke dalam graf
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);

        // Menambahkan edge-edge antara node-node
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);

        // Menampilkan struktur graf
        graph.printGraph();
    }
}
