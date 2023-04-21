public class Servidor extends Funcionario {
    private int horasExtras;

    public int getHorasExtras(){
        return this.horasExtras;
    }

    public Servidor(String nome,int matricula, int horasExtras){
        super(nome,matricula);
        this.horasExtras = horasExtras;
    }

    @Override 
    public void calcularSalario(){
        super.setSalarioMinimo((super.getSalarioMinimo() + this.horasExtras*15));
    }

    public String toString(){
        return super.toString() + "\nA quantidade de horas extras é de: " + this.horasExtras;
    }
}
