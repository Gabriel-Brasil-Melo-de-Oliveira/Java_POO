public class ColaboradorHorista extends Colaborador {
    private double valorRecebidoHora;

    public double getValorRecebidoHora(){
        return this.valorRecebidoHora;
    }
    public void setValorRecebidoHora(double valorRecebidoHora){
        this.valorRecebidoHora = valorRecebidoHora;
    }

    public ColaboradorHorista(String nome, int numeroDeHorasTrabalhadas,double valorRecebidoHora){
        super(nome,numeroDeHorasTrabalhadas);
        this.valorRecebidoHora = valorRecebidoHora;
    }

    public String toString(){
        return super.toString() + "\nValor recebido por hora: " + this.valorRecebidoHora;
    }
}
