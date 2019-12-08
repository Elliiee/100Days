package dfs;

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private StackX theStack;

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
    }
}
