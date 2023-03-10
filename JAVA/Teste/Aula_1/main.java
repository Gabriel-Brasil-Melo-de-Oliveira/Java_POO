//Faça um programa que receba dois números reais (double),
//calcule e mostre a média entre eles.

//Caso a média seja maior que 7, mostrar a mensagem “Aprovado”,
//senão mostrar “Reprovado”

/* import java.util.Scanner;
public class main {
    public static void main(String args[ ]){
        System.out.println("Digite dois números");
        Scanner cin = new Scanner(System.in);
        int numero_1, numero_2;
        numero_1 = cin.nextInt();
        numero_2 = cin.nextInt();
        double media;
        media = (numero_1+numero_2)/2;
        if(media >= 7){
            System.out.println("A media dos dois números é: " + media);
        }else{
            System.out.println("Reprovado!");
        }
    }
} */

//--------------------------------------------------------------------------------------------------------

//Faça um programa que receba o nome e a idade de um 5 pessoas e
//mostre o nome e a idade da pessoa mais nova e da pessoas mais
//velha

import java.util.Scanner;

public class main{
    public static void main(String args[ ]){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner cin = new Scanner(System.in);

        Pessoa[] lista_de_pessoas = new Pessoa[5];

        for(int i = 0; i < 5;i++){

            System.out.println("Digite seu nome: ");
            String nome_digitado = cin.next();

            System.out.println("Digite sua idade: ");
            int idade_digitada = cin.nextInt();
            
            lista_de_pessoas[i] = new Pessoa(nome_digitado, idade_digitada);

        }

        int posicao_pessoa_maior_idade = 0;

        for(int i = 0; i < 5;i++){
            for(int w = i+1; w < 5;w++){
                if(lista_de_pessoas[w].pegar_idade() > lista_de_pessoas[i].pegar_idade()){
                    posicao_pessoa_maior_idade = w;
                }
            }
        }


        System.out.println("A pessoa que possui a maior idade é: ");

        System.out.println("Nome da pessoa: " + lista_de_pessoas[posicao_pessoa_maior_idade].pegar_nome());
        System.out.println("Idade da pessoa: " + lista_de_pessoas[posicao_pessoa_maior_idade].pegar_idade());

    }
}