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
        Professor professor1 = new Professor("Gabriel",12,"mestre",1110,false);
        Secretario secretario1 = new Secretario("Jose", 10, 40);
        Servidor servidor1 = new Servidor("Igor", 0, 10);
        Professor professor2 = new Professor("Carla", 821, "doutor", 20, true);
        Secretario secretario2 = new Secretario("Xica", 123, 120);
        Servidor servidor2 = new Servidor("Victor", 12234, 50);

        Universidade uece = new Universidade("UECE");
        uece.adicionarFuncionario(professor1);
        uece.adicionarFuncionario(secretario1);
        uece.adicionarFuncionario(servidor1);
        uece.adicionarFuncionario(servidor2);
        uece.adicionarFuncionario(professor2);
        uece.adicionarFuncionario(secretario2);

       // for(int i = 0; i < uece.getLista().size(); i++){
        //    uece.getLista().get(i).calcularSalario();
       // }
       // uece.maiorSalario();

        //uece.ordenarOrdemAlfabetica();

       // uece.outraFormaDeOrdenar();

       // uece.folhaDePagamento();


        //uece.miar();

        //uece.maiorSalario();
        //uece.folhaDePagamento();

        
        

    } 
}
