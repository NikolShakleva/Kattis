import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.BipartiteX;
import edu.princeton.cs.algs4.DepthFirstPaths;
import edu.princeton.cs.algs4.BreadthFirstPaths;
import java.util.*;

class GraphAssignement {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner("4 5\n0 1 1\n1 2 1\n2 3 1\n0 3 0\n0 2 0");
    int verteces = sc.nextInt();
    int edges = sc.nextInt();
    Graph g = new Graph(verteces);
    for(int i=0; i<edges; i++){
        int v = sc.nextInt();
        int e = sc.nextInt();
        int c = sc.nextInt();
        g.addEdge(v,e);
    }
    g.adj(0);
    BipartiteX bx = new BipartiteX(g);
    BreadthFirstPaths bp = new BreadthFirstPaths(g, 0);
    bp.pathTo(3);
    bp.hasPathTo(3);
    DepthFirstPaths dp = new  DepthFirstPaths(g,0);
    dp.pathTo(3);
    dp.hasPathTo(3);







    if(bx.isBipartite()){
        System.out.println("1");
     }else{
        System.out.println("0");
    }

    }
}