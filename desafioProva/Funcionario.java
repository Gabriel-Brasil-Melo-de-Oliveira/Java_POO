public class Funcionario {
    String nome;
    double salario;

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getSalario(){return this.salario;}
    public void setSalario(double salario){this.salario = salario;}

    public Funcionario(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String toString(){
        return "\nNome: " + this.nome + "\nSalario: " + this.salario;
    }
}
