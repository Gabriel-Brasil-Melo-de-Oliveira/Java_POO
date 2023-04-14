public class Colaboradores {
    private String nome;
    private int horasTrabalhadas;
    private double salario;

    public double getSalario(){return this.salario;}
    public void setSalario(double salario){this.salario = salario;}

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getHorasTrabalhadas(){return this.horasTrabalhadas;}
    public void setHorasTrabalhadas(int horasTrabalhadas){this.horasTrabalhadas = horasTrabalhadas;}

    public Colaboradores(String nome, int horasTrabalhadas){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = 0;
    }

    public String toString(){
        return "\nEsse é o nome do funcionário: " + this.nome + "\nEssa são as horas trabalhadas: " + this.horasTrabalhadas + "\nEsse é o seu salário: " + this.salario;
    }
}
