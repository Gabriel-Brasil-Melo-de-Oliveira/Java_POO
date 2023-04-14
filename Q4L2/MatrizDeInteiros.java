/* Escreva uma classe chamada “MatrizDeInteiros” que tenha como atributo uma matriz de
inteiros e um construtor que receba como parâmetro a ordem da matriz, a instancie e inicialize
com zeros. Acrescente a classe os seguintes métodos:
a) um método que receba como parâmetro três números inteiros indicando respectivamente
linha, coluna e o valor que deve ser armazenado na linha e coluna indicada. Obs: Caso a linha ou
a coluna passadas como parâmetro estejam fora da ordem da matriz indique com uma mensagem
o erro.
b) um método “éQuadrada”, que retorna true se a matriz for quadrada (isto é, tem o mesmo
número de linhas e colunas).
c) um método total que some todos os valores da matriz retornando o resultado.
d) um método que receba como parâmetro um determinado valor e retorne a linha onde o
elemento foi encontrado na matriz ou –1 caso contrário.
Crie uma classe Main que exercite sua classe MatrizDeInteiros. */






public class MatrizDeInteiros {
    private int[][] matrizDeInteiros;

    public int[][] getMatriz(){
        return this.matrizDeInteiros;
    }

    public void setMatriz(int[][] matrizDeInteiros){
        this.matrizDeInteiros = matrizDeInteiros;
    }

    public MatrizDeInteiros(int linha, int coluna){
        this.matrizDeInteiros = new int[linha][coluna];
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna;j++){
                matrizDeInteiros[i][j] = 0;
            }
        }
    }

    public void mostrarMatriz(){
        for(int i = 0; i < matrizDeInteiros.length; i++){
            for(int j = 0; j < matrizDeInteiros[i].length;j++){
                System.out.print("[" + matrizDeInteiros[i][j] + "]");
            }
            System.out.print("\n");
        }
    }

    // um método que receba como parâmetro três números inteiros indicando respectivamente
    //linha, coluna e o valor que deve ser armazenado na linha e coluna indicada. Obs: Caso a linha ou
    //a coluna passadas como parâmetro estejam fora da ordem da matriz indique com uma mensagem
    //o erro.

    public void colocarValor(int linha, int coluna, int valorInserido){
        linha--;
        coluna--;
        if(linha+1 > matrizDeInteiros.length){
            System.out.println("\nO valor da linha está fora do alcance da matriz.");
        }else if(coluna+1 > matrizDeInteiros[linha].length){
            System.out.println("\nO valor da coluna está fora do alcance da matriz.");
        }else{
            matrizDeInteiros[linha][coluna] = valorInserido;
        }

    }

    //um método “éQuadrada”, que retorna true se a matriz for quadrada (isto é, tem o mesmo
    //número de linhas e colunas).

    public boolean eQuadrado(){
        if(this.matrizDeInteiros.length == this.matrizDeInteiros[0].length){
            System.out.println("\nA matriz é quadrada");
            return true;
        }else{
            System.out.println("\nA matriz não é quadrada");
            return false;
        }
    }


    //um método total que some todos os valores da matriz retornando o resultado.
    public double somarValorMatriz(){
        double valorTotal = 0;
        for(int i = 0; i < matrizDeInteiros.length; i++){
            for(int j = 0; j < matrizDeInteiros[i].length;j++){
                valorTotal += matrizDeInteiros[i][j];
            }
        }
        return valorTotal;
    }

    //um método que receba como parâmetro um determinado valor e retorne a linha onde o
    //elemento foi encontrado na matriz ou –1 caso contrário.

    public int elementoNaLinha(double valor){
        for(int i = 0; i < matrizDeInteiros.length; i++){
            for(int j = 0; j < matrizDeInteiros[i].length; j++){
                if(matrizDeInteiros[i][j] == valor){
                    System.out.println("\nValor encontrado na linha: " + (i+1) + " e coluna: " + (j+1));
                    return (i+1);
                }
            }
        }
        System.out.println("\nElemento não encontrado!");
        return -1;
    }
    
}
