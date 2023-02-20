public class mainCode {
    public static void main(String[] args) {
        Grafo<String> grafo1 = new Grafo<String>();
        //Each vertex represent a people in the grafo
        grafo1.addVertex("Eduardo");
        grafo1.addVertex("Sarah");
        grafo1.addVertex("Gabriel");
        grafo1.addVertex("Gustavo");
        grafo1.addVertex("Maria");
        grafo1.addVertex("Mateus");

        grafo1.addAngle(2.0, "Eduardo", "Sarah");
        grafo1.addAngle(3.0, "Sarah", "Gabriel");
        grafo1.addAngle(1.0, "Gabriel", "Gustavo" );
        grafo1.addAngle(1.0, "Gustavo", "Maria");
        grafo1.addAngle(2.0, "Maria", "Mateus");
        grafo1.addAngle(3.0, "Mateus", "Eduardo");

        //We can do the search in any element in the graphic
        grafo1.widthSearch();
    }
}
