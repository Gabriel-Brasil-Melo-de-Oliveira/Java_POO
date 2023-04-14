import java.util.ArrayList;

public class ColaboradorHorista extends Colaboradores {
    private double valorRecebidoHora;
    

    public double getValorRecebidoHora(){return this.valorRecebidoHora;}
    public void setValorRecebidoHora(double valorRecebidoHora){this.valorRecebidoHora = valorRecebidoHora;}

    

    public ColaboradorHorista(String nome, int horasTrabalhadas, double valorRecebidoHora){
        super(nome, horasTrabalhadas);
        this.valorRecebidoHora = valorRecebidoHora;
    }

    //horistas devem receber o valor da hora
    //trabalhada multiplicado pelo número de horas trabalhadas;
    

}