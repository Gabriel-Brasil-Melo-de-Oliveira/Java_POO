import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args){
        Datas primeiraData = new Datas(22, 4, 1999);
        Datas segundaData = new Datas(21,5,1999);

        primeiraData.eMaisAntiga(segundaData);
    }
}
