import java.util.ArrayList;

public class Vertex <KIND> {

    private KIND data;
    private ArrayList<Angle<KIND>> angleIn;
    private ArrayList<Angle<KIND>> angleOut;

    public Vertex (KIND value) {
        this.data = value;
        this.angleIn = new ArrayList<Angle<KIND>> ();
        this.angleOut = new ArrayList<Angle<KIND>> ();
    }

    public ArrayList<Angle<KIND>> getAngleIn() {
        return angleIn;
    }

    public void setAngleIn(ArrayList<Angle<KIND>> angleIn) {
        this.angleIn = angleIn;
    }

    public ArrayList<Angle<KIND>> getAngleOut() {
        return angleOut;
    }

    public void setAngleOut(ArrayList<Angle<KIND>> angleOut) {
        this.angleOut = angleOut;
    }

    public KIND getData() {
        return data;
    }

    public void setData(KIND data) {
        this.data = data;
    }
    public void addAngleIn (Angle<KIND> angle) {
        this.angleIn.add(angle);
    }
    public void addAngleOut (Angle<KIND> angle) {
        this.angleOut.add(angle);
    }

}
