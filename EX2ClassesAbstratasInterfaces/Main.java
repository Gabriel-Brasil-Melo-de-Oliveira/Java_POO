
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<FiguraGeometrica> listaDeFiguras = new ArrayList<FiguraGeometrica>();
        Triangulo novoTriangulo = new Triangulo(5,10,8,8);
        Quadrado novoQuadrado = new Quadrado(10);
        listaDeFiguras.add(novoQuadrado);
        listaDeFiguras.add(novoTriangulo);

        for(FiguraGeometrica figura: listaDeFiguras){
            figura.calcularArea();
            figura.calcularPerimetro();
        }
        for(FiguraGeometrica figura: listaDeFiguras){
           System.out.println(figura);
        }
    }
}
