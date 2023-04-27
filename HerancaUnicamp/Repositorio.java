public interface Repositorio {
    public abstract void guarda(Pessoa novaPessoa);
    public abstract Pessoa recupera(String cpf);
    public abstract Pessoa primeiro();
    public abstract Pessoa proximo();
}
