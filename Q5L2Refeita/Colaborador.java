public abstract class Colaborador {
    private int numeroDeHorasTrabalhadas;
    private String nome;
    private double salario;

    public int getNumeroDeHorasTrabalhadas(){
        return this.numeroDeHorasTrabalhadas;
    }
    public void setNumeroDeHorasTrabalhadas(int parNumeroDeHorasTrabalhadas){
        this.numeroDeHorasTrabalhadas = parNumeroDeHorasTrabalhadas;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String parNome){
        this.nome = parNome;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double parSalario){
        this.salario = parSalario;
    }


    public Colaborador(String parNome,int parNumeroDeHorasTrabalhadas){
        this.numeroDeHorasTrabalhadas = parNumeroDeHorasTrabalhadas;
        this.nome = parNome;
        this.salario = 0;
    }

    public String toString(){
        return "\nO nome do colaborador é: " + this.nome + "\nA quantidade de horas trabalhadas foi de: " + this.numeroDeHorasTrabalhadas + "\nSeu salario é de: " + this.salario;
    }
}
