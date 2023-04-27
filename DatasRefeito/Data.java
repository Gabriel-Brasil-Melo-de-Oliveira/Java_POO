public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia(){return this.dia;}
    public void setDia(int dia){this.dia = dia;}

    public int getMes(){return this.mes;}
    public void setMes(int mes){this.mes = mes;}

    public int getAno(){return this.ano;}
    public void setAno(int ano){this.ano = ano;}

    public Data(int dia,int mes,int ano){
        if(dia <= 30 && dia >= 1 && mes >= 1 && mes <= 12 && ano >= 2000){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.println("\nData fora da validação");
        }
    }

    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

    public boolean avancarData(){
        if(this.dia == 30){
            if(this.mes == 12){
                this.ano++;
                this.mes = 1;
                this.dia = 1;
                return true;
            }else{
                this.mes++;
                this.dia = 1;
                return true;
            }
        }
        this.dia++;
        return true;
    }

    public void eMaisAntiga(Data parData){
        if(this.ano > parData.getAno()){
            System.out.println("A data: " + this.toString() + " é mais nova que: " + parData);
        }else if(this.ano == parData.getAno() && this.mes > parData.getMes()){
            System.out.println("A data: " + this.toString() + " é mais nova que: " + parData);
        }else if(this.ano == parData.getAno() && this.mes == parData.getMes() && this.dia > parData.getDia()){
            System.out.println("A data: " + this.toString() + " é mais nova que: " + parData);
        }else{
            System.out.println("A data: " + this.toString() + " é mais antiga que: " + parData);

        }
    }
}
