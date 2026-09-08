// import java.util.*;
// public class graph{
//     static class Edge{
//         int scr;
//         int dest;
//         int Wt;

//         public Edge(int s,int d,int w){
//             this.scr=s;
//             this.dest=d;
//             this.Wt=w;
//         }
//     }
// //     public static void createGraph(ArrayList<Edge> graph[]){
// //         for(int i=0;i<graph.length;i++){
// //             graph[i]=new ArrayList<Edge>();
// //         }
// //         graph[0].add(new Edge(0,2,2));

// //         graph[1].add(new Edge(1,2,10));
// //         graph[1].add(new Edge(1,3,0));

// //         graph[2].add(new Edge(2,0,2));
// //         graph[2].add(new Edge(2,3,-1));
// //         graph[2].add(new Edge(2,1,10));

// //         graph[3].add(new Edge(3,2,-1));
// //         graph[3].add(new Edge(3,1,0));

// //     }
// //     public static void main(String[] args){
// //        // System.out.println("Hello new data structure graph");
// //        int V=4;
// //        @SuppressWarnings("unchecked")
// //        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[V];

// //       //  ArrayList<Edge>[] graph=new ArrayList[V];
// //        createGraph(graph);

// //        for(int i=0;i<graph[0].size();i++){
// //         Edge e=graph[0].get(i);
// //         System.out.print(e.dest+" "+e.Wt+" ");
// //        }
// //        System.out.println();
// //         for(int i=0;i<graph[1].size();i++){
// //         Edge e=graph[1].get(i);
// //         System.out.print(e.dest+" "+e.Wt+" ");
// //        }
// //        System.out.println();
// //         for(int i=0;i<graph[2].size();i++){
// //         Edge e=graph[2].get(i);
// //         System.out.print(e.dest+" "+e.Wt+" ");
// //        }
// //        System.out.println();
// //         for(int i=0;i<graph[3].size();i++){
// //         Edge e=graph[3].get(i);
// //         System.out.print(e.dest+" "+e.Wt+" ");
// //        }
// //     }
// // }

// // BFS.//////////////////////////////////////////////////////// 
// // import java.util.*;
// // public class graph{
// //     static class Edge{
// //         int scr;
// //         int dest;
// //         //int Wt;

// //         public Edge(int s,int d){
// //             this.scr=s;
// //             this.dest=d;
// //            // this.Wt=w;
// //         }
// //     }
// //      public static void createGraph(ArrayList<Edge> graph[]){
// //         for(int i=0;i<graph.length;i++){
// //             graph[i]=new ArrayList<Edge>();
// //         }
// //         graph[0].add(new Edge(0,1));
// //         graph[0].add(new Edge(0,2));

// //         graph[1].add(new Edge(1,3));
// //         graph[1].add(new Edge(1,0));

// //         graph[2].add(new Edge(2,0));
// //         graph[2].add(new Edge(2,4));

// //         graph[3].add(new Edge(3,1));
// //         graph[3].add(new Edge(3,4));
// //         graph[3].add(new Edge(3,5));

// //         graph[4].add(new Edge(4,2));
// //         graph[4].add(new Edge(4,3));
// //         graph[4].add(new Edge(4,5));

// //         graph[5].add(new Edge(5,3));
// //         graph[5].add(new Edge(5,4));
// //         graph[5].add(new Edge(5,6));

// //         graph[6].add(new Edge(6,5));

// //     }
// //     /// BFS
// //     public static void bfs(ArrayList<Edge> graph[],int V){
// //         Queue<Integer> q=new LinkedList<>();
// //         boolean vis[]=new boolean[V];
// //         q.add(0);
// //         while(!q.isEmpty()){
// //             int curr=q.remove();
// //             if(vis[curr]==false){
// //                 System.out.print(curr+" ");
// //                 vis[curr]=true;
// //                 for(int i=0;i<graph[curr].size();i++){
// //                     Edge e=graph[curr].get(i);
// //                     q.add(e.dest);
// //                 }
// //             }
// //         }
// //     }
// //     // DFS.////////////
// //     public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
// //         System.out.print(curr+" ");
// //         vis[curr]=true;
// //         for(int i=0;i<graph[curr].size();i++){
// //             Edge e=graph[curr].get(i);
// //             if(vis[e.dest]==false)
// //             dfs(graph,e.dest,vis); 
// //         }
// //     }
// //     public static void main(String[] args) {
// //         int V=7;
// //         @SuppressWarnings("unchecked")
// //         ArrayList<Edge> graph[]=new ArrayList[V];
// //         createGraph(graph);
// //         boolean vis[]=new boolean[V];
// //         dfs(graph,0,vis);
// //         // bfs(graph,V);
// //         System.out.println();
// //     }
// // }

// // Qustion- all paths form source to target.///////////
// // import java.util.*;
// // public class graph{
// //     static class Edge{
// //         int scr;
// //         int dest;
// //         //int Wt;

// //         public Edge(int s,int d){
// //             this.scr=s;
// //             this.dest=d;
// //            // this.Wt=w;
// //         }
// //     }
// //      public static void createGraph(ArrayList<Edge> graph[]){
// //         for(int i=0;i<graph.length;i++){
// //             graph[i]=new ArrayList<Edge>();
// //         }
// //         graph[0].add(new Edge(0,1));
// //         graph[0].add(new Edge(0,2));

// //         graph[1].add(new Edge(1,3));
// //         graph[1].add(new Edge(1,0));

// //         graph[2].add(new Edge(2,0));
// //         graph[2].add(new Edge(2,4));

// //         graph[3].add(new Edge(3,1));
// //         graph[3].add(new Edge(3,4));
// //         graph[3].add(new Edge(3,5));

// //         graph[4].add(new Edge(4,2));
// //         graph[4].add(new Edge(4,3));
// //         graph[4].add(new Edge(4,5));

// //         graph[5].add(new Edge(5,3));
// //         graph[5].add(new Edge(5,4));
// //         graph[5].add(new Edge(5,6));

// //         graph[6].add(new Edge(6,5));

// //     }
// //     /// BFS
// //     public static void bfs(ArrayList<Edge> graph[],int V){
// //         Queue<Integer> q=new LinkedList<>();
// //         boolean vis[]=new boolean[V];
// //         q.add(0);
// //         while(!q.isEmpty()){
// //             int curr=q.remove();
// //             if(vis[curr]==false){
// //                 System.out.print(curr+" ");
// //                 vis[curr]=true;
// //                 for(int i=0;i<graph[curr].size();i++){
// //                     Edge e=graph[curr].get(i);
// //                     q.add(e.dest);
// //                 }
// //             }
// //         }
// //     }
// //     // DFS.
// //     public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
// //         System.out.print(curr+" ");
// //         vis[curr]=true;
// //         for(int i=0;i<graph[curr].size();i++){
// //             Edge e=graph[curr].get(i);
// //             if(vis[e.dest]==false) 
// //             dfs(graph,e.dest,vis); 
// //         }
// //     }
// //     public static void allPath(ArrayList<Edge> graph[],boolean vis[],int src,int tar,String path){
// //         if(src==tar){
// //             System.out.println(path+tar);
// //             return;
// //         }
// //         vis[src]=true;
// //         for(int i=0;i<graph[src].size();i++){
// //             Edge e=graph[src].get(i);
// //             if(!vis[e.dest]){
// //                 allPath(graph, vis,e.dest, tar, path+"->"+e.dest);
// //             } 
// //         }
// //          vis[src]=false;
// //     }
// //     public static void main(String[] args) {
// //         int V=7;
// //         @SuppressWarnings("unchecked")
// //         ArrayList<Edge> graph[]=new ArrayList[V];
// //         createGraph(graph);
// //         int src=0,tar=5;
// //         allPath(graph, new boolean[V], src, tar, "0");
// //         // boolean vis[]=new boolean[V];
// //         // dfs(graph,0,vis);
// //         // bfs(graph,V);
// //        // System.out.println();
// //     }
// // }

// // cycle detection.////////////
// // import java.util.*;
// // public class graph{
// //     static class Edge{
// //         int src;
// //         int dest;

// //         public Edge(int s,int d){
// //             this.src=s;
// //             this.dest=d;
// //         }
// //     }
// //     public static void createGraph(ArrayList<Edge> graph[]){
// //         for(int i=0;i<graph.length;i++){
// //             graph[i]=new ArrayList<Edge>();
// //         }
// //         graph[0].add(new Edge(0,2));

// //         graph[1].add(new Edge(1,0));

// //         graph[2].add(new Edge(2,3));

// //         graph[3].add(new Edge(3,0));

// //     }
// /*public static boolean isCycle(ArrayList<Edge>[] graph){
//     boolean[] vid=new boolean[graph.length];
//     boolean[] rec=new boolean[graph.length];
//     for(int i=0;i<graph.length;i++){
//         if(!vid[i]){ //rec=stack.
//             if(isCycleUtil(graph,i,vid,rec)){
//                 return true;
//             }
//         }
//     }
//     return false;
// }*/

// //     public static boolean iscycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
// //         vis[curr]=true;
// //         rec[curr]=true;

// //         for(int i=0;i<graph[curr].size();i++){
// //             Edge e=graph[curr].get(i);

// //             if(rec[e.dest]){
// //                 return true;

// //             }else if(!vis[e.dest]){
// //                if(iscycle(graph,vis,e.dest,rec)){
// //                 return true;
// //                }
// //             }
// //         }
// //         rec[curr]=false;
// //         return false;

// //     }
// //     public static void main(String[] args) {
// //         int V=4;
// //         @SuppressWarnings("unchecked")
// //         ArrayList<Edge> graph[]=new ArrayList[V];
// //         createGraph(graph);
// //         System.out.println(iscycle(graph,new boolean[V],0,new boolean[V]));
// //     }
// // }

// // import java.util.*;
// // public class graph{
// //     static class Edge{
// //         int src;
// //         int dest;
// //         public Edge(int s,int d){
// //             this.src=s;
// //             this.dest=d;
// //         }
// //     }
// //     public static void createGraph(ArrayList<Edge> graph[]){
// //         for(int i=0;i<graph.length;i++){
// //             graph[i]=new ArrayList<Edge>();
// //         }
// //         graph[2].add(new Edge(2,3));
// //         graph[3].add(new Edge(3,1));
// //         graph[4].add(new Edge(4,0));
// //         graph[4].add(new Edge(4,1));
// //         graph[5].add(new Edge(5,0));
// //         graph[5].add(new Edge(5,2));
// //     }

// //     // Topological sort.
// /// modified DFS algorithm.////////
// /// 
// //     public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer>stack){
// //         vis[curr]=true;
// //         for(int i=0;i<graph[curr].size();i++){
// //             Edge e=graph[curr].get(i);
// //             if(!vis[e.dest]){
// //                 topSortUtil(graph,e.dest,vis,stack);
// //             }
// //         }
// //         stack.push(curr);
// //     }

// ///  // Topological sort.
// //     public static void topSort(ArrayList<Edge> graph[],int V){
// //         boolean vis[]=new boolean[V];
// //         Stack<Integer>stack=new Stack<>();
// //         for(int i=0;i<V;i++){
// //             if(!vis[i]){
// //                 topSortUtil(graph,i,vis,stack);
// //             }
// //         }
// //         while(!stack.isEmpty()){
// //             System.out.print(stack.pop()+" ");
// //         }
// //     }
// //     public static void main(String[] args){
// //         int V=6;
// //         @SuppressWarnings("unchecked")
// //         ArrayList<Edge> graph[]=new ArrayList[V];
// //         createGraph(graph);

// //         topSort(graph,V);

// //     }
// // }
// //cycle detection in undirected graph.///////////
// // import java.util.*;
// // public class graph{
// //     static class Edge{
// //         int src;
// //         int dest;
// //         public Edge(int s,int d){
// //             this.src=s;
// //             this.dest=d;
// //         }
// //     }
// //     public static void createGraph(ArrayList<Edge> graph[]){
// //         for(int i=0;i<graph.length;i++){
// //             graph[i]=new ArrayList<Edge>();
// //         }
// //     graph[0].add(new Edge(0,1));
// //     graph[0].add(new Edge(0,4));

// //     graph[1].add(new Edge(1,0));
// //     graph[1].add(new Edge(1,2));
// //     graph[1].add(new Edge(1,4));

// //      graph[2].add(new Edge(2,1));
// //     graph[2].add(new Edge(2,3));

// //      graph[3].add(new Edge(3,2));

// //       graph[4].add(new Edge(4,0));
// //        graph[4].add(new Edge(4,1));
// //         graph[4].add(new Edge(4,5));

// //          graph[5].add(new Edge(5,4));

// //     }
// //     public static boolean iscycleUndirected(ArrayList<Edge> graph[],boolean vis[],int curr,int parent){
// //         vis[curr]=true;
// //         for(int i=0;i<graph[curr].size();i++){
// //             Edge e=graph[curr].get(i);
// //             if(vis[e.dest] && e.dest!=parent){
// //                 return true;
// //             }
// //             else if(!vis[e.dest]){
// //                 if(iscycleUndirected(graph,vis,e.dest,curr)){
// //                     return true;
// //                 }
// //             }
// //         }
// //         return false;
// //     }
// //      public static void main(String[] args){
// //         int V=6;
// //         @SuppressWarnings("unchecked")
// //         ArrayList<Edge> graph[]=new ArrayList[V];
// //         createGraph(graph);
// //         System.out.println(iscycleUndirected(graph,new boolean[V],0,-1));

// //     }
// // }

// // import java.util.*

// // public class graph {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter a string: ");
// //         String s = sc.nextLine().toLowerCase();  // convert to lowercase

// //         int count = 0;

// //         for (int i = 0; i < s.length(); i++) {
// //             char ch = s.charAt(i);

// //             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// //                 count++;
// //             }
// //         }

// //         System.out.println("Number of vowels in the string: " + count);

// //         sc.close();
// //     }
// // }

// /*
//                                               Bipartite Graph
// A Bipartite Graph is a graph whose vertices can be divided into two independent sets, U and V such that every edge
// (u, v) either connects a vertex from U to V or a vertex from V to U. In other words, for every edge (u, v), either u
// belongs to U and v to V, or u belongs to V and v to U. We can also say that there is no edge that connects vertices of
// same set. */

// /*import java.util.*;
// public class graph {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//     }

//     public static boolean isBipartite(ArrayList<Edge> graph[], int V) {
//         int[] color = new int[V];
//         Arrays.fill(color, -1); // Initialize all vertices as uncolored

//         for (int i = 0; i < V; i++) {
//             if (color[i] == -1) { // If the vertex is uncolored
//                 if (!bfsCheck(graph, i, color)) {
//                     return false; // Not bipartite
//                 }
//             }
//         }
//         return true; // Bipartite
//     }

//     private static boolean bfsCheck(ArrayList<Edge> graph[], int start, int[] color) {
//         Queue<Integer> queue = new LinkedList<>();
//         queue.add(start);
//         color[start] = 0; // Assign first color

//         while (!queue.isEmpty()) {
//             int curr = queue.poll();

//             for (Edge e : graph[curr]) {
//                 if (color[e.dest] == -1) { // If the vertex is uncolored
//                     color[e.dest] = 1 - color[curr]; // Assign alternate color
//                     queue.add(e.dest);
//                 } else if (color[e.dest] == color[curr]) { // If the adjacent vertex has the same color
//                     return false; // Not bipartite
//                 }   
//             }
//         }
//         return true; // Bipartite
//     }

//     public static void main(String[] args) {
//         int V = 6;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);

//         System.out.println(isBipartite(graph, V));
//     }
// }*/

// /*Topological Sort using BFS -Kahn's Algorithm */
// /*import java.util.*;
// public class graph{
//     public static class Edge{
//         int scr;
//         int dest;
//         public Edge(int s,int d){
//             this.scr=s;
//             this.dest=d;
//         }
//     }
    
//     static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }
//         graph[2].add(new Edge(2,3));
//         graph[3].add(new Edge(3,1));  
//         graph[4].add(new Edge(4,0));
//         graph[4].add(new Edge(4,1));
//         graph[5].add(new Edge(5,0));
//         graph[5].add(new Edge(5,2));

//     }
//     public static void calcIndegree(ArrayList<Edge> graph[],int indegree[]){
//         for(int i=0;i<graph.length;i++){
//             for(int j=0;j<graph[i].size();j++){
//                 Edge e=graph[i].get(j);
//                 indegree[e.dest]++;
//             }
//         }
//     }
//     public static void topSort(ArrayList<Edge> graph[],int V){
//         int indegree[]=new int[V];
//         calcIndegree(graph, indegree);

//         Queue<Integer> q=new LinkedList<>();
//         for(int i=0;i<V;i++){
//             if(indegree[i]==0){
//                 q.add(i);
//             }
//         }

//         while(!q.isEmpty()){
//             int curr=q.poll();
//             System.out.print(curr+" ");
//             for(int i=0;i<graph[curr].size();i++){
//                 Edge e=graph[curr].get(i);
//                 indegree[e.dest]--;
//                 if(indegree[e.dest]==0){
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }
//     public static void main(String[] args){
//         int V=6;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge> graph[]=new ArrayList[V];
//         createGraph(graph);
//         topSort(graph,V);
//         // int indegree[]=new int[V];
//         // for(int i=0;i<V;i++){
//         //     for(int j=0;j<graph[i].size();j++){
//         //         Edge e=graph[i].get(j);
//         //         indegree[e.dest]++;
//         //     }
//         // }
//         // Queue<Integer> q=new LinkedList<>();
//         // for(int i=0;i<V;i++){
//         //     if(indegree[i]==0){
//         //         q.add(i);
//         //     }
//         // }
//         // while(!q.isEmpty()){
//         //     int curr=q.remove();
//         //     System.out.print(curr+" ");
//         //     for(int i=0;i<graph[curr].size();i++){
//         //         Edge e=graph[curr].get(i);
//         //         indegree[e.dest]--;
//         //         if(indegree[e.dest]==0){
//         //             q.add(e.dest);
//         //         }
//         //     }
//         }
//     }*/

// /*all paths from source to destination */
// /*import java.util.*;

// public class graph {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 3));
//         graph[1].add(new Edge(1, 4));

//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 5));
//     }

//     public static void allPath(ArrayList<Edge> graph[], int src, int dest, String path) {
//         if (src == dest) {// base case.
//             System.out.println(path + dest);
//             return;
//         }
//         for (int i = 0; i < graph[src].size(); i++) {
//             Edge e = graph[src].get(i);
//             allPath(graph, e.dest, dest, path + src + "->");
//         }
//     }

//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         int v = 7;
//         ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[v];
//         createGraph(graph);
//         int src = 0, dest = 5;
//         allPath(graph, src, dest, "");
//     }
// }

// //////////////////////////////////////////* Dijkstra's algorithm. *///////////////////////////////////////////////////
import java.util.*;
public class graph {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }
        public int compareTo(Pair p2) {
            return this.path - p2.path;// path based sorting. if path is less than p2.path then it will return negative value and it will be sorted in ascending order.
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src, int V) {
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {// loop for bfs.
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++) {// neighbors of curr.n
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0, V);
    }
}

// // Bellman-Ford Algorithm./////////////////////
import java.util.*;
public class graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
     static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, -4));
       

        graph[2].add(new Edge(2, 3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));  
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V){
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        // algorithm for relaxation of edges. V-1 times.
        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);

                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;// relaxation.
                    }
                
            }
        }
        }
        // print.
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();

        // check for negative weight cycle.
        for(int j=0;j<graph.length;j++){
            for(int k=0;k<graph[j].size();k++){
                Edge e=graph[j].get(k);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                    System.out.println("Negative weight cycle detected");
                    return;
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void allPath(ArrayList<Edge> graph[], int src, int dest, String path) {
        if (src == dest) {// base case.
            System.out.println(path + dest);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            allPath(graph, e.dest, dest, path + src + "->");
        }
    }
    public static void main(String[] args) {
        int V = 5;
       @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0, V);
        int src = 0, dest = 4;
        System.out.println("All paths from " + src + " to " + dest + ":");
        allPath(graph, src, dest, "");
    }
}

//                                   /*Minimum Spanning Tree (MST)
// A minimum spanning tree (MST) or minimum weight spanning tree is a subset of the
// edges of a connected, edge-weighted undirected graph that connects all the vertices
// together, without any cycles and with the minimum possible total edge weight. */

// // prims algorithm./////////////////////
import java.util.*;
public class graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 12));
        graph[1].add(new Edge(1, 2, 5));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 10));

        graph[3].add(new Edge(3, 1, 12));
        graph[3].add(new Edge(3, 2, 10));
    }
    public static void prims(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
        pq.add(new Edge(0, 0, 0)); 

        while (!pq.isEmpty()) {
            Edge curr = pq.poll();
            if (!vis[curr.dest]) {
                vis[curr.dest] = true;
                System.out.println("Edge: " + curr.src + " - " + curr.dest + " Weight: " + curr.wt);

                for (Edge e : graph[curr.dest]) {
                    if (!vis[e.dest]) {
                        pq.add(e);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prims(graph, V);
    }
}

 /*Cheapest Flights within K Stops
There are n cities connected by some number of flights. You are given an array flights where
flights[i] = [from, to, price] indicates that there is a flight.
You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.
If there is no such route, return -1.

all values are positive

100

0

1

100

flights = [ [0,1,100], [1,2,100], [0,2,500] ]
src = 0, dst = 2, k=1
ans = 200

500

2 */
import java.util.*;
public class graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 100));
        graph[1].add(new Edge(1, 2, 100));
        graph[0].add(new Edge(0, 2, 500));
    }
    public static int cheapestFlight(ArrayList<Edge> graph[], int src, int dst, int k) {
        int V = graph.length;
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] tempDist = Arrays.copyOf(dist, V);
            for (int j = 0; j < V; j++) {
                for (Edge e : graph[j]) {
                    if (dist[j] != Integer.MAX_VALUE && dist[j] + e.wt < tempDist[e.dest]) {
                        tempDist[e.dest] = dist[j] + e.wt;
                    }
                }
            }
            dist = tempDist;
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static void main(String[] args) {
        int V = 3;
      @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0, dst = 2, k = 1;
        System.out.println(cheapestFlight(graph, src, dst, k));
    }
}
///////////////////////////////////// another solution,////////
import java.util.*;
public class graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        for(int i=0;i<flights.length;i++){
            int src=flights[i][0];
            int dest=flights[i][1];
            int wt=flights[i][2];

           Edge e=new Edge(src,dest,wt);
           graph[src].add(e);
        }
    }
    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int cost,int stops){
            this.v=v;
            this.cost=cost;
            this.stops=stops;
        }
    }
    @SuppressWarnings("unchecked")
    public static int cheapestFlight(int n, int flights[][], int src, int dst, int k) {
        ArrayList<Edge> graph[]=new ArrayList[n];
        createGraph(flights, graph);

       int[] dist = new int[n];
       for(int i=0;i<n;i++){
        if(i!=src){
            dist[i]=Integer.MAX_VALUE;
        }
       }
       Queue<Info> q=new LinkedList<>();
       q.add(new Info(src, 0, 0));
       while(!q.isEmpty()){
        Info curr=q.remove();
        if(curr.stops>k){
            continue;
        }
        for(int i=0;i<graph[curr.v].size();i++){
            Edge e=graph[curr.v].get(i);
            int u=e.src;
            int v=e.dest;
            int wt=e.wt;

            if(curr.cost+wt<dist[v] && curr.stops<=k){
                dist[v]=curr.cost+wt;
                q.add(new Info(v, dist[v], curr.stops+1));
            }
        }
       }
       return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
    public static void main(String[] args){
        int n=4;
        int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0,dst=3,k=1;   
        System.out.println(cheapestFlight(n, flights, src, dst, k));
    }
}
