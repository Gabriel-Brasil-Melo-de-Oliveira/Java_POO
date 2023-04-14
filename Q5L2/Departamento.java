import java.util.ArrayList; //Faltou import
public class Departamento {
    private int codigo;
    private String nome;
    private ArrayList<Colaboradores> listaColaboradores;


    public int getCodigo(){return this.codigo;}
    public String getNome(){return this.nome;}

    public Departamento(int codigo,String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.listaColaboradores = new ArrayList<Colaboradores>();
    }
    public ArrayList<Colaboradores> getLista(){
        return this.listaColaboradores;
    }

    public void adicionarColaboradores(Colaboradores pessoa){
        listaColaboradores.add(pessoa);
    } 



}
