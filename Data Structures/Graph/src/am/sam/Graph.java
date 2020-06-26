package am.sam;

import java.util.*;

public class Graph {
    List<Node> nodes = new ArrayList();

    public void breadthFirstTraversal(Node rootNode){
        Queue<Node> q = new LinkedList();
        q.add(rootNode);
        rootNode.visited=true;
        while(!q.isEmpty()){
            Node n = q.poll();
            System.out.print(n.data + " ");
            for(Node adj : n.adjacentNodes){
                if(!adj.visited){
                    adj.visited=true;
                    q.add(adj);
                }
            }
        }
        for(Node adj : nodes){
            adj.visited=false;
        }
    }

    public void depthFirstTraversal(Node rootNode) {

        Stack<Node> s = new Stack();
        s.push(rootNode);
        rootNode.visited = true;
        while(!s.isEmpty()){
            Node n = s.pop();
            System.out.print(n.data +  " ");
            for(Node adj : n.adjacentNodes){
                if(!adj.visited){
                    adj.visited = true;
                    s.push(adj);
                }
            }
        }
        for(Node adj : nodes){
            adj.visited=false;
        }
    }
}
