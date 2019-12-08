public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Queue theQueue;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;

        // set adjacency matrix to 0
        for (int i = 0; i < MAX_VERTS; i++){
            for (int j = 0; j < MAX_VERTS; j++){
                adjMat[i][j] = 0;
            }
        }

        theQueue = new Queue();
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[start][end] = 1;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public void bfs(){
        vertexList[0].wasVisited = true; // begin at vertex 0 and mark it to true
        displayVertex(0);  // display it
        theQueue.insert(0); // insert at the tail of the queue
        int v2; // create a new int??

        while (!theQueue.isEmpty()){ // while loop until the queue is empty
            int v1 = theQueue.remove(); // remove vertex at head

            while ((v2 = getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
    }

    public int getAdjUnvisitedVertex(int v){
        // returns an unvisited vertex adj to v
        for (int i = 0; i < nVerts; i++){
            if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false){
                return i;
            }
        }
        return -1;
    }
}
