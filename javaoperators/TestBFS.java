package javaoperators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestBFS {
    public static void main(String[] args) {
        int v = 7;

        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        System.out.println("BFS");
        bfs(graph, graph[0].get(0).src, new boolean[v]);
        System.out.println();
        System.out.println("DFS");
        dfs(graph, graph[0].get(0).src, new boolean[v]);
        System.out.println();
        System.out.println("DFSStack");
        dfsStack(graph, graph[0].get(0).src, new boolean[v]);
    }

    private static void bfs(ArrayList<Edge>[] graph , Vertex src, boolean[] visited) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(src);
       
        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            
            if(visited[vertex.numberOfVertex] == false){
                System.out.print(vertex.data+ " ");
                visited[vertex.numberOfVertex] = true;

                for (int i = 0; i < graph[vertex.numberOfVertex].size(); i++) {
                    queue.add((Vertex)graph[vertex.numberOfVertex].get(i).dest);
                }
            }
        }        
    }


    private static void dfs(ArrayList<Edge>[] graph, Vertex vertex, boolean[] visited) {
        System.out.print(vertex.data + " ");
        visited[vertex.numberOfVertex] = true;
        
        if (graph[vertex.numberOfVertex].isEmpty() == false) {
            for (int i = 0; i < graph[vertex.numberOfVertex].size(); i++) {
                Edge edge = graph[vertex.numberOfVertex].get(i);
                if (visited[edge.dest.numberOfVertex] == false) {
                    dfs(graph, edge.dest, visited);
                }
            }
        }
    }


    private static void dfsStack(ArrayList<Edge>[] graph, Vertex vertex, boolean[] visited) {
        Stack<Vertex> stack = new Stack<>();
        stack.push(vertex);

        while (!stack.isEmpty()) {
            Vertex v1 = stack.pop();
            if(visited[v1.numberOfVertex] == false){
                System.out.print(v1.data+" ");
                visited[v1.numberOfVertex] = true;
                 
                for(int i=0;i<graph[v1.numberOfVertex].size();i++) {
                    stack.push(graph[v1.numberOfVertex].get(i).dest);
                }
            }
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(new Vertex('A',0), new Vertex('B',1), 2));
        graph[0].add(new Edge(new Vertex('A',0), new Vertex('C',2), 2));

        graph[1].add(new Edge(new Vertex('B',1), new Vertex('A',0), 10));
        graph[1].add(new Edge(new Vertex('B',1), new Vertex('D',3), 0));

        graph[2].add(new Edge(new Vertex('C',2), new Vertex('A',0), 2));
        graph[2].add(new Edge(new Vertex('C',2), new Vertex('E',4), 10));

        graph[3].add(new Edge(new Vertex('D',3), new Vertex('B',1), 0));
        graph[3].add(new Edge(new Vertex('D',3), new Vertex('E',4), -1));
        graph[3].add(new Edge(new Vertex('D',3), new Vertex('F',5), -1));

        graph[4].add(new Edge(new Vertex('E',4), new Vertex('C',2), 0));
        graph[4].add(new Edge(new Vertex('E',4), new Vertex('D',3), -1));
        graph[4].add(new Edge(new Vertex('E',4), new Vertex('F',5), -1));

        graph[5].add(new Edge(new Vertex('F',5), new Vertex('D',3), 0));
        graph[5].add(new Edge(new Vertex('F',5), new Vertex('E',4), -1));
        graph[5].add(new Edge(new Vertex('F',5), new Vertex('G',6), -1));

        graph[6].add(new Edge(new Vertex('G',6), new Vertex('F',5), -1));
    }

    static class Edge {
        Vertex src;
        Vertex dest;
        int weight;

        public Edge(Vertex s, Vertex d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    static class Vertex {
        public int numberOfVertex;
        public char data;
        public Vertex(char d, int number) {
            this.data = d;
            this.numberOfVertex = number;
        }
    }
}