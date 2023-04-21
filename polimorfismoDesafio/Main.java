public class Main {
    public static void main(String[] args){
       /*  
        
        professor1.calcularSalario();
        System.out.println("\nDepois de calcular o salario: \n");
        System.out.println(professor1);
        
        System.out.println(secretario1);
        System.out.println("\nDepois de calcular o salario\n");
        secretario1.calcularSalario();
        System.out.println(secretario1);

        
        System.out.println(servidor1);
        servidor1.calcularSalario();
        System.out.println(servidor1);*/
        Professor professor1 = new Professor("Gabriel",12,"mestre",10,true);
        Secretario secretario1 = new Secretario("Jose", 10, 40);
        Servidor servidor1 = new Servidor("Igor", 0, 10);

        Universidade uece = new Universidade("UECE");
        uece.adicionarFuncionario(professor1);
        uece.adicionarFuncionario(secretario1);
        uece.adicionarFuncionario(servidor1);

        for(int i = 0; i < uece.getLista().size(); i++){
            uece.getLista().get(i).calcularSalario();
        }
        

        uece.folhaDePagamento();

    } 
}
