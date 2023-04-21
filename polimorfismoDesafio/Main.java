public class Main {
    public static void main(String[] args){
        Professor professor1 = new Professor("Gabriel",12,"mestre",10,true);
        System.out.println(professor1);
        professor1.calcularSalario();
        System.out.println("\nDepois de calcular o salario: \n");
        System.out.println(professor1);
        Secretario secretario1 = new Secretario("Jose", 10, 40);
        System.out.println(secretario1);
        System.out.println("\nDepois de calcular o salario\n");
        secretario1.calcularSalario();
        System.out.println(secretario1);

        Servidor servidor1 = new Servidor("Igor", 0, 10);
        System.out.println(servidor1);
        servidor1.calcularSalario();
        System.out.println(servidor1);
    }
}
