public class DepartamentoCH extends Departamento {
    
    public DepartamentoCH(int parCodigo,String parNome){
        super(parCodigo,parNome);
    }


     //os horistas devem receber o valor da hora
    //trabalhada multiplicado pelo número de horas trabalhadas;
    public void calcularSalario(){
        for(Colaborador pessoa: super.getListaColaborador()){
            if(pessoa instanceof ColaboradorHorista){
                ColaboradorHorista pessoaHorista = (ColaboradorHorista) pessoa;
                pessoaHorista.setSalario((pessoaHorista.getNumeroDeHorasTrabalhadas()*pessoaHorista.getValorRecebidoHora()));
            }
        }
    }

    public void relatorio(){
        for(Colaborador pessoa: super.getListaColaborador()){
            if(pessoa instanceof ColaboradorHorista){
                ColaboradorHorista pessoaHorista = (ColaboradorHorista) pessoa;
                System.out.println(pessoaHorista);
            }
        }
    }
}
