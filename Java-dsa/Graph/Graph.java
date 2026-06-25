import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private class Node {
        private String label;

        public Node(String label){
            this.label = label;
        }
    }
    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>
    public void addNode(String label){
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
    }
    public void addEdge(String from, String to){
        var fromNode = nodes.get(from);
        if(fromNode == null){
            throw new IllegalAccessException();
        }
    }
}
