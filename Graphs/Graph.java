package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph{
    //Graph consists of "A" = [" A" , " B"];
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

public void printGraph(){
    // printing the graph
    System.out.println(adjList);

}



public boolean addVertex(String vertex){
    if(adjList.get(vertex) == null){
        // if vertex is null then create a new arraylist for vertex;

        adjList.put(vertex,new ArrayList<String>());
        return true;
    }
    return false;
}



    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) !=null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
}
