/* Faça um programa que peça ao usuário para entrar com 7
números inteiros e armazene-os em um vetor. Peça também para
ele entrar com outro número inteiro X e determine se X está no
vetor e em que posição. */

import java.util.Scanner;

public class Main {
    
    public static void main(String args[ ]){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        int vetor[] = new int[7];

        Scanner cin = new Scanner(System.in);
        
        for(int i = 0; i < 7;i++){

            System.out.print("Digite o número " + (i+1) + ":\n");
            int numero_digitado = cin.nextInt();
            vetor[i] = numero_digitado;

        }
        System.out.println("Digite mais um número para verificar se este número está no vetor: ");
        int numero_verificador = cin.nextInt();

        int cont = 0;

        for(int i = 0; i < 7;i++){
            if(numero_verificador == vetor[i]){
                cont++;
            }
        }

        System.out.println("A quantidade de vezes que o número " + numero_verificador + " aparece é de: " + cont);

        

//  Considerando o vetor da questão anterior, verifique se os números estão em ordem crescente. Caso contrário, ordene e imprima o vetor. 
        int maior_valor = vetor[0], aux = 0;

        for(int i = 0; i < 7; i++){
            for(int w = i+1; w < 7;w++){
                if(vetor[w] < vetor[i]){
                    aux = vetor[w];
                    vetor[w] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        for(int i = 0; i < 7;i++){
            System.out.println("Valor do vetor: " + vetor[i]);
        }

    }
}
