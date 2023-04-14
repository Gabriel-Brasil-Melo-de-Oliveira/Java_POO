
public class Quadrado implements FiguraGeometrica {
    private double lado;
    private double area;
    private double perimetro;

    public double getLado(){return this.lado;}
    public double getArea(){return this.area;}
    public double getPerimetro(){return this.perimetro;}

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        this.area = (lado*lado);
        return area;
    }

    public double calcularPerimetro(){
        this.perimetro = (lado*4);
        return perimetro;
    }

    public String toString(){
        return "\nA área do quadrado é de: " + this.area + "\nSeu perimetro é de: " + this.perimetro;
    }
}
