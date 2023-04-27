import java.util.Scanner;
//package MatrizDeIntRefeita;

public class MatrizDeInteiros {
    private int[][] matriz;

    public int[][] getMatriz(){return this.matriz;}
    public void setMatriz(int[][] matriz){this.matriz = matriz;}

    public MatrizDeInteiros(int linha,int coluna){
        matriz = new int[linha][coluna];
        for(int i = 0; i < linha;i++){
            for(int j = 0;j < coluna;j++){
                this.matriz[i][j] = 0;
            }
        }
    }

    public void mostrarMatriz(){
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length;j++){
                System.out.print("[" + this.matriz[i][j] + "]");
            }
            System.out.print("\n");
        }
    }

    public void colocarValor(int linha,int coluna){
        linha--;
        coluna--;
        if(this.matriz.length < linha+1){
            System.out.println("\nLinha fora do alcance");
        }else if(this.matriz[0].length < coluna+1){
            System.out.println("\nColuna fora do alcance");
        }
        Scanner cin = new Scanner(System.in);
        System.out.println("\nDigite o valor para a linha " + (linha+1) + " e coluna: " + (coluna+1));
        int valor = cin.nextInt();
        this.matriz[linha][coluna] = valor;

    }

    public void preencherMatriz(){
        Scanner cin = new Scanner(System.in);
        for(int i = 0; i < this.matriz.length;i++){
            for(int j = 0; j < this.matriz[i].length;j++){
                System.out.println("\nLinha: " + (i+1) + " Coluna: " + (j+1));
                int valor = cin.nextInt();
                this.matriz[i][j] = valor;
            }
        }
    }

    public void somarElementos(){
        int soma = 0;
        for(int i = 0; i < this.matriz.length;i++){
            for(int j = 0; j < this.matriz[i].length;j++){
                soma += this.matriz[i][j];
            }
        }
        System.out.println("\nSoma final = " + soma);
    }
}
