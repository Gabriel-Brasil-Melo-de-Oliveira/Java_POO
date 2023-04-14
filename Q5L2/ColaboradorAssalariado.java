public class ColaboradorAssalariado extends Colaboradores {
    private double valorSalario;

    public double getValorSalario(){return this.valorSalario;}
    public void setValorSalario(double valorSalario){this.valorSalario = valorSalario;}

    public ColaboradorAssalariado(String nome, int horasTrabalhadas, double valorSalario){
        super(nome, horasTrabalhadas);
        this.valorSalario = valorSalario;
    }
}
