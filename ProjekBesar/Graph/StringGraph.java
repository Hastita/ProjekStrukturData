import java.util.*;

class StringGraph {
    private Map<String, List<String>> adjacencyList;

    // Konstruktor untuk inisialisasi graph
    public StringGraph() {
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node baru ke dalam graph
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // Menambahkan edge ke dalam graph
    public void addEdge(String source, String destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Untuk graf tidak terarah
    }

    // Mencetak graph
    public void printGraph() {
        for (String node : adjacencyList.keySet()) {
            System.out.print("Node " + node + " terhubung dengan: ");
            for (String neighbor : adjacencyList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StringGraph graph = new StringGraph();

        // Menambahkan node ke dalam graph
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Menambahkan edge ke dalam graph
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");
        graph.addEdge("C", "D");

        // Mencetak graph
        graph.printGraph();
    }
}
