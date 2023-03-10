import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("Digite seu nome: ");
        Scanner cin = new Scanner (System.in);
        String nome_usuario = cin.next();
        System.out.println("O nome do usuário é: " + nome_usuario);
        System.out.println("Agora digite outro nome: ");
        String nome_usuario_2 = cin.next();
        System.out.println("O segundo nome é: " + nome_usuario_2);
    }
}
