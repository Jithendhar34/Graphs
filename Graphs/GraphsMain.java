package Graphs;

public class GraphsMain {

    public static void main(String[] args) {
        
        Graph myGraph = new Graph();
       // adding the vertex "A"

       
      myGraph.addVertex("A");
      myGraph.addVertex("B");
      
      
        myGraph.addEdge("A", "B");

        myGraph.printGraph();
    }
    
}
