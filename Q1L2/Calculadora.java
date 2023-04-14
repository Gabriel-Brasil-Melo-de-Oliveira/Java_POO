public class Calculadora{
    private double ultimoResultado;

    public double getUltimoResultado(){return this.ultimoResultado;}
    public void setUltimoResultado(double ultimoResultado){this.ultimoResultado = ultimoResultado;}

    public Calculadora(){
        this.ultimoResultado = 0;
    }

    public double somar(double valorInserido){
        this.ultimoResultado +=valorInserido;
        System.out.println("\nValor " + this.ultimoResultado);
        return this.ultimoResultado;
    }
    public double subtrair(double valorInserido){
        this.ultimoResultado -= valorInserido;
        System.out.println("\nValor " + this.ultimoResultado);
        return this.ultimoResultado;
    }
    public double multiplicar(double valorInserido){
        this.ultimoResultado *= valorInserido;
        System.out.println("\nValor " + this.ultimoResultado);
        return this.ultimoResultado;
    }
    public double dividir(double valorInserido){
        if(valorInserido == 0){
            System.out.println("\nDivisão por zero, operação cancelada!");
            return 0;
        }else{
            this.ultimoResultado /= valorInserido;
            System.out.println("\nValor " + this.ultimoResultado);
            return ultimoResultado;
        }
    }
    public void resetar(){
        System.out.println("\nValor " + this.ultimoResultado);
        this.ultimoResultado = 0;
    }
}