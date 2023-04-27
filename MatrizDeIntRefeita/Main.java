//package MatrizDeIntRefeita;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner cin = new Scanner(System.in);
       int valorEscolhido = 0;
       MatrizDeInteiros novaMatriz = new MatrizDeInteiros(0,0);
       
       do{
        System.out.println("\nBem vindo ao calculador de matriz");
        System.out.println("\nDigite a opção desejada");
        System.out.println("\n1 - Criar nova matriz");
        System.out.println("\n2 - Preencher matriz");
        System.out.println("\n3 - Somar os elementos da matriz");
        System.out.println("\n4 - Colocar valor na matriz");
        System.out.println("\n5 - Mostrar Matriz");
        System.out.println("\n6 - sair");

        valorEscolhido = cin.nextInt();

        if(valorEscolhido == 1){
            System.out.println("\nDigite a quantidade de linhas e colunas, respectivamente.");
            int linha = cin.nextInt();
            int coluna = cin.nextInt();
            novaMatriz = new MatrizDeInteiros(linha,coluna);
        }else if(valorEscolhido == 2){
            novaMatriz.preencherMatriz();
        }else if(valorEscolhido == 3){
            novaMatriz.somarElementos();
        }else if(valorEscolhido == 4){
            System.out.println("\nDigite o valor da linha e coluna respectivamente");
            int linha = cin.nextInt();
            int coluna = cin.nextInt();
            novaMatriz.colocarValor(linha,coluna);
        }else if(valorEscolhido == 5){
            novaMatriz.mostrarMatriz();
        }
        




       }while(valorEscolhido != 6);
       cin.close();
    }

}
