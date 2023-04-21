public class Professor extends Funcionario {
    private String titulacao;
    private int horasAula;
    private boolean cordenador;

    public String getTitulacao(){
        return this.titulacao;
    }
    public int getHorasAula(){
        return this.horasAula;
    }

    public Professor(String nome, int matricula, String titulacao, int horasAula, boolean cordenador){
        super(nome,matricula);
        this.titulacao = titulacao;
        this.horasAula = horasAula;
        this.cordenador = cordenador;
    }

    @Override
    public void calcularSalario(){
        double valorFinal = 0;
        if(this.titulacao.equals("mestre")){
            super.setSalarioMinimo((super.getSalarioMinimo()+this.horasAula*80));
            valorFinal = super.getSalarioMinimo();
        }else if(this.titulacao.equals("doutor")){
            super.setSalarioMinimo((super.getSalarioMinimo()+this.horasAula*100));
            valorFinal = super.getSalarioMinimo();
        }
        if(this.cordenador == true){
            valorFinal = valorFinal+(valorFinal*0.2);
        }
        super.setSalarioMinimo(valorFinal);
    }

    public String toString(){
        return super.toString() + "\nA sua titulação é: " + this.titulacao + "\nA quantidade de horas aula: " + this.horasAula + "\nCordenador: " + this.cordenador;
    }

}
