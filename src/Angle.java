import java.util.ArrayList;

public class Angle <KIND>{
    private Double weight;
    private Vertex<KIND> begin;
    private Vertex<KIND> end;

    /* When We use this -> referring to attributes
    When we use only the name (like in the constructor) -> referring to variables */

    public Angle (Double weight, Vertex<KIND> begin, Vertex<KIND> end) {
        this.weight = weight;
        this.end = end;
        this.begin = begin;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertex<KIND> getBegin() {
        return begin;
    }

    public void setBegin(Vertex<KIND> begin) {
        this.begin = begin;
    }

    public Vertex<KIND> getEnd() {
        return end;
    }

    public void setEnd(Vertex<KIND> end) {
        this.end = end;
    }

}
