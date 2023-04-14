 import java.util.ArrayList;
public class DepartamentoCH extends Departamento {
    private ArrayList<ColaboradorHorista> listaColaboradoresHorista;

    public void adicionarColaboradorHorista(ColaboradorHorista pessoa){
        this.listaColaboradoresHorista.add(pessoa);
    }

    /*
    public ArrayList<ColaboradorHorista> getLista(){
        return this.listaColaboradoresHorista;
    }
    */
    
    
    public DepartamentoCH(int codigo,String nome){
        super(codigo,nome);
        this.listaColaboradoresHorista = new ArrayList<ColaboradorHorista>();
    }

    public void calcularSalario(){
        for(ColaboradorHorista pessoa: listaColaboradoresHorista){
            pessoa.setSalario((pessoa.getHorasTrabalhadas()*pessoa.getValorRecebidoHora()));
        }
    }

   
} 
