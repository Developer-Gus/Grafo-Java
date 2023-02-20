import java.util.ArrayList;

//KIND - Generics creation type
public class Grafo <KIND> {
    private ArrayList<Vertex<KIND>> vertices;
    private ArrayList<Angle<KIND>> angles;

    public Grafo() {
        this.vertices = new ArrayList<Vertex<KIND>>();
        this.angles = new ArrayList<Angle<KIND>>();
    }

    public void addVertex (KIND data){
        Vertex<KIND> newVertex = new Vertex<KIND>(data);
        this.vertices.add(newVertex);
    }

    public void addAngle (Double weight, KIND dataBegin, KIND dataEnd) {
        Vertex<KIND> begin = this.getVertex(dataBegin);
        Vertex<KIND> end = this.getVertex(dataEnd);
        Angle<KIND> angle = new Angle<KIND>(weight, begin,end);
        begin.addAngleOut(angle);
        end.addAngleIn(angle);
        this.angles.add(angle);
    }

    public Vertex<KIND> getVertex (KIND data) {
        Vertex<KIND> vertex = null;
        for (int cont = 0; cont < this.vertices.size(); cont++) {
            //If the data that We're searching is the same of the data Grafo
            if (this.vertices.get(cont).getData().equals(data)) {
                //So here is the data for the one that We're searching for
                vertex = this.vertices.get(cont);
                break;
            }
        }
        return vertex;
    }

    public ArrayList<Vertex<KIND>> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertex<KIND>> vertices) {
        this.vertices = vertices;
    }

    public ArrayList<Angle<KIND>> getAngles() {
        return angles;
    }

    public void setAngles(ArrayList<Angle<KIND>> angles) {
        this.angles = angles;
    }

    public void widthSearch () {
        ArrayList<Vertex<KIND>> marked = new ArrayList<Vertex<KIND>>();
        ArrayList<Vertex<KIND>> row = new ArrayList<Vertex<KIND>>();
        //Actual is the marker, so it means that It already was visited
        Vertex<KIND> actual = this.vertices.get(0);
        marked.add(actual);
        System.out.println(actual.getData());
        row.add(actual);
        /*The algorithm works while there are item inside the grafo and will
        *stop when the row was smaller than zero*/
        while(row.size() > 0) {
            Vertex<KIND> visited = row.get(0);
            for (int cont =0; cont < visited.getAngleOut().size(); cont++) {
                Vertex<KIND> next = visited.getAngleOut().get(cont).getEnd();
                if (!marked.contains(next)) { //If the vertex wasn't marked
                    marked.add(next);
                    System.out.println(next.getData());
                    row.add(next);
                }
            }
            //the looping will continue and remove each visited item
            row.remove(0);
        }
    }
}
