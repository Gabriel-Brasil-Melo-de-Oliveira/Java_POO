public class Secretario extends Funcionario {
    private int horasTrabalho;

    public int getHorasTrabalho(){
        return this.horasTrabalho;
    }
    public void setHorasTrabalho(int horasTrabalho){
        this.horasTrabalho = horasTrabalho;
    }

    public Secretario(String nome, int matricula, int horasTrabalho){
        super(nome,matricula);
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    public void calcularSalario(){
        if(this.horasTrabalho == 20){
            super.setSalarioMinimo((super.getSalarioMinimo() + (horasTrabalho*8)));
        }else if(this.horasTrabalho == 30 || this.horasTrabalho == 40){
            super.setSalarioMinimo((super.getSalarioMinimo() + (horasTrabalho*10)));
        }
    }

    public String toString(){
        return super.toString() + "\nHoras trabalhadas: " + this.horasTrabalho; 
    }
}
