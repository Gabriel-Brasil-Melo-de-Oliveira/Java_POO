//1) Crie uma classe que represente uma conta
//bancária. Toda conta possui um titular, um número
//e um saldo. Crie um método para depositar um
//valor e outro para realizar um saque (lembre que
//saldo não pode ser negativo)


import java.util.Scanner;

public class Main {
    public static void main(String args[ ]){
        //apagar a tela
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("\nBem-vindo(a) ao servidor de Contas GB");
        System.out.println("\nDigite seu nome:");
        Scanner cin = new Scanner(System.in);
        
        String nome_usuario = cin.nextLine();
        Conta usuario = new Conta(nome_usuario,397570,0);
        System.out.println("\nBom dia " + usuario.get_Nome() + "\nO número da sua conta é " + usuario.get_Numero_Conta() + "\nO seu saldo é de: " + usuario.get_Saldo());
        
        System.out.println("\nVocê deseja depositar algum valor?");
        String resposta = cin.next();
        if(resposta.equals("sim")){
            System.out.println("\nDigite o valor que você deseja depositar");
            double valor_para_deposito = cin.nextDouble();
            usuario.depositar(valor_para_deposito);
            System.out.println("\nO seu novo saldo é de " + usuario.get_Saldo());
        }else{
            System.out.println("Desejamos um bom dia!");
        }

        System.out.println("\nVocê deseja sacar algum valor?");
        resposta = cin.next();
        if(resposta.equals("sim")){
            System.out.println("\nDigite o valor que você deseja sacar");
            double valor_para_saque = cin.nextDouble();
            usuario.sacarDinheiro(valor_para_saque);
            System.out.println("\nO seu novo saldo é de " + usuario.get_Saldo());
        }else{
            System.out.println("Desejamos um bom dia!");
        }

        

    }
}
