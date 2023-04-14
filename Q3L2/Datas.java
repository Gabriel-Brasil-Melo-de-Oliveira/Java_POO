public class Datas {
    private int dia;
    private int mes;
    private int ano;

    public int getDia(){return this.dia;}
    public int getMes(){return this.mes;}
    public int getAno(){return this.ano;}

    public Datas(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public void avancar(){
        this.dia += 1;
    }

    public void eMaisAntiga(Datas dataRecebida){
        int valorTotal = (this.dia+(this.mes*30)+(this.ano*365));
        //System.out.println("\nVALORTOTALTESTE: " + valorTotal);
        int valorTotalDataInserida = (dataRecebida.getDia()+(dataRecebida.getMes()*30)+(dataRecebida.getAno()*365));
        if(valorTotal < valorTotalDataInserida){
            System.out.println("\nA data " + this.toString() + " é mais antiga que a data " + dataRecebida.toString());
        }else{
            System.out.println("\nA data " + this.toString() + " é mais nova que a data " + dataRecebida.toString());

        }
    }
}
