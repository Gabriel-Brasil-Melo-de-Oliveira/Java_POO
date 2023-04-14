public class Main {
    public static void main(String[] args){
        Pais pais1 = new Pais("Brasil", "Brasília", 8516000);
        Pais pais2 = new Pais("Suiça", "Berna", 41285);

        pais1.verificarSeOsPaisesSaoIguais(pais2);

        Pais pais3 = new Pais("Brasil","Brasília",8516000);

        pais1.verificarSeOsPaisesSaoIguais(pais3);

        pais1.definirFronteira(pais2);

        pais1.buscarNomeCapitalDosPaisesQueFazemFronteira();
    }
}
