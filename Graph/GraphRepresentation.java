package Graph;

public class GraphRepresentation {
    private int V;
    private int E;
    private int[][] adjMatrix;

    public GraphRepresentation(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjMatrix=new int [nodes][nodes];
    }

    public void addEdge(int u,int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
        E++;
    }

    public static void main(String[] args) {
        GraphRepresentation g = new GraphRepresentation(4);
        g.addEdge(0,1 );
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);

    }
}
