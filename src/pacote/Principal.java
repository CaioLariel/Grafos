package pacote;

public class Principal {
    public static void main(String[] args) {
        Grafos<String> grafos = new Grafos<String>();
        grafos.adcionarVertice("Marcela");
        grafos.adcionarVertice("Caio");
        grafos.adcionarVertice("Vict�ria");
        grafos.adcionarVertice("Lucas");
        
        grafos.adcionarAresta(3.0, "Marcela", "Vict�ria");
        grafos.adcionarAresta(2.0, "Vict�ria", "Lucas");
        grafos.adcionarAresta(4.0, "Lucas", "Caio");
        grafos.adcionarAresta(1.0, "Caio", "Marcela");
        
        grafo.buscaEmLargura();
    }
    
}
