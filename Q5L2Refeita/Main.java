public class Main {
    public static void main(String[] args){
        DepartamentoCC departamento = new DepartamentoCC(12,"Departamento cc");
        
        ColaboradorComissionado pessoa1 = new ColaboradorComissionado("Gabriel Comissionado", 2, 20, 200);
        ColaboradorComissionado pessoa2 = new ColaboradorComissionado("Jose horista", 3, 30,300);
        
        departamento.adicionarColaboradores(pessoa1);
        //departamento.adicionarColaboradores(pessoa2);
        
        departamento.calcularSalario();
        
        departamento.relatorio();

        DepartamentoCH departamentoCH = new DepartamentoCH(6,"DCH");

        ColaboradorHorista pessoaH1 = new ColaboradorHorista("Xico",20,3);

        departamentoCH.adicionarColaboradores(pessoaH1);

        departamentoCH.calcularSalario();

        departamentoCH.relatorio();
        
    }
}
