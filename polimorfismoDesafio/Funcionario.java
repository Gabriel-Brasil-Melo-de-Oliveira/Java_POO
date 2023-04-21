public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double salarioMinimo;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public double getSalarioMinimo(){
        return this.salarioMinimo;
    }
    public void setSalarioMinimo(double salarioMinimo){
        this.salarioMinimo = salarioMinimo;
    }

    public Funcionario(String nome,int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioMinimo = 1000;
    }
    public abstract void calcularSalario();

    public String toString(){
        return "\nO nome do funcionário é: " + this.nome + "\nSua matricula é " + this.matricula + "\nSeu salário é de: " + this.salarioMinimo;
    }
}
