package javasort;

import java.util.*;

class DFSSimple {
    public static void main(String[] args) {
      
        Vertex<Character> vs = new Vertex('S');
        Vertex<Character> va = new Vertex('A');
        Vertex<Character> vb = new Vertex('B');
        Vertex<Character> vc = new Vertex('C');
        Vertex<Character> vd = new Vertex('D');
        Vertex<Character> ve = new Vertex('E');
        Vertex<Character> vf = new Vertex('F');
        Vertex<Character> vg = new Vertex('G');

        /*
         * S
         * 
         * A B C
         * 
         * D E F
         * 
         * G
         * 
         * 
         */

        vs.neighbers = List.of(va, vb, vc);
        va.neighbers = List.of(vd);
        vb.neighbers = List.of(ve);
        vc.neighbers = List.of(vf);
        vb.neighbers = List.of(ve);
        vd.neighbers = List.of(vg);
        ve.neighbers = List.of(vg);
        vf.neighbers = List.of(vg);

        //bfs(vs);

        //dfs(vs);

       // recursiveDFS(vs);
    }

    private static void bfs(Vertex<Character> vs) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vs);

        while (!queue.isEmpty()) {

            Vertex vertex = queue.poll();

            if (vertex.isVisited == false) {

                System.out.print(vertex.data + " ");

                vertex.isVisited = true;

                queue.addAll(vertex.neighbers);
            }

        }
    }

    private static void dfs(Vertex<Character> vs) {
        Stack<Vertex> stack = new Stack();
        stack.push(vs);
       
        while (!stack.isEmpty()) {
            Vertex vertex = stack.pop();

            if (vertex.isVisited == false) {
                System.out.print(vertex.data + " ");
                vertex.isVisited = true;
                stack.addAll(vertex.neighbers);
            }

        }
    }


    
    private static void recursiveDFS(Vertex<Character> vs) {
        System.out.print(vs.data +" ");
        vs.isVisited = true;

        for (Vertex vertex : vs.neighbers) {
            if(vertex.isVisited == false){
                recursiveDFS(vertex);
            }
        }
    }
}

class Vertex<T> {
    public T data;
    public boolean isVisited;
    public List<Vertex<T>> neighbers = new ArrayList();

    public Vertex(T i) {
        this.data = i;
    }
}
