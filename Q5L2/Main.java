
public class Main {
    public static void main(String[] args){
        ColaboradorComissionado pessoa1 = new ColaboradorComissionado("Gabriel",20,2,2000);
        DepartamentoCC departamento1 = new DepartamentoCC(12,"Departamento CC");
        departamento1.adicionarColaboradores(pessoa1);
        departamento1.calcularSalario();
        departamento1.relatorio();
    }
}
