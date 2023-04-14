import java.util.ArrayList;

public abstract class Departamento {
    private int codigo;
    private String nome;
    private ArrayList<Colaborador> listaColaborador;

    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int parCodigo){
        this.codigo = parCodigo;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String parNome){
        this.nome = parNome;
    }

    public ArrayList<Colaborador> getListaColaborador(){
        return this.listaColaborador;
    }

    public void adicionarColaboradores(Colaborador pessoa){
        listaColaborador.add(pessoa);
    }

    public Departamento(int parCodigo,String parNome){
        this.codigo = parCodigo;
        this.nome = parNome;
        this.listaColaborador = new ArrayList<Colaborador>();
    }

    public abstract void calcularSalario();



    //Cada colaborador pertence a um departamento, que possui código e nome. No final de cada
    //mês, cada departamento deverá calcular o salário de seus colaboradores da seguinte forma: os
    //comissionados devem receber o valor total de vendas multiplicado pela percentagem,
    //independentemente do número de horas trabalhadas;
}
