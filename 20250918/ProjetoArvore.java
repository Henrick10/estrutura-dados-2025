public interface ProjetoArvore<T> {
    public Nodoprojeto<T> pesquisa(T objeto);
    public void inserir(T objeto);
    public void imprimePreFixado();
}