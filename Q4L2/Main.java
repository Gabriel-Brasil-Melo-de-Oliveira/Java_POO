public class Main {
    public static void main(String[] args){
        MatrizDeInteiros minhaMatriz = new MatrizDeInteiros(3, 2);
        minhaMatriz.colocarValor(1,1,6);
        minhaMatriz.colocarValor(1,2,2);
        minhaMatriz.colocarValor(2,1,3);
        minhaMatriz.colocarValor(2,2,4);
        minhaMatriz.colocarValor(3,1,5);
        minhaMatriz.colocarValor(3,2,6);
        minhaMatriz.mostrarMatriz();
        minhaMatriz.eQuadrado();
        double valor = minhaMatriz.somarValorMatriz();
        System.out.println("\nValor total: " + valor);
        minhaMatriz.elementoNaLinha(2);
        

    }

    
}
