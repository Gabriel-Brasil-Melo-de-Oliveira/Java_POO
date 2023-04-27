public class Main {
    public static void main(String[] args){
        Data data1 = new Data(30,12,2023);
        //data1.avancarData();
        System.out.println(data1);
        Data data2 = new Data(12,12,2023);
        data1.eMaisAntiga(data2);
    }
}
