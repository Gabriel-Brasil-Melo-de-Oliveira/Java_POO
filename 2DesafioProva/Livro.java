import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String autor;
    public LocalDate dataAtual = LocalDate.now();

    public String getTitulo(){return this.titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}

    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

    public Livro(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String toString(){
        return "\nTitulo: " + this.titulo + "\nAutor: " + this.autor + "\nData: " + this.dataAtual;
    }


}
