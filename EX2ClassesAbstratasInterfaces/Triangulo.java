

public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;

    public double getBase(){return this.base;}
    public double getAltura(){return this.altura;}
    public double getArea(){return this.area;}
    public double getPerimetro(){return this.perimetro;}
    public double getLado1(){return this.lado1;}
    public double getLado2(){return this.lado2;}
    

    public Triangulo(double base,double altura, double lado1, double lado2){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea(){
        this.area = ((this.base*this.altura)/2);
        return this.area;
    }



    public double calcularPerimetro(){
        this.perimetro = (lado1+lado2+base);
        return perimetro;
    }

    public String toString(){
        return "\nA área do triangulo é de: " + this.area + "\nSeu perimetro é de: " + this.perimetro;
    }
}
