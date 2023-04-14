public class Main {
    public static void main(String[] args){
        Vilao nefesto = new Vilao("Nefesto",666,"Demon");

        System.out.println("\nEsse é o nome do vilão: " + nefesto.getNome() + "\nEsse é a classe " + nefesto.getClasse());
        System.out.println(nefesto);
        Jogador gabriel = new Jogador("Gabriel",777,"Draconiano");
        System.out.println(gabriel);
    }
}
