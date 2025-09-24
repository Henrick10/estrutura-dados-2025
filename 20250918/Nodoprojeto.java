public class Nodoprojeto<T> {
    public Nodoprojeto<T> filhoesquerda;
    public T valor;
    public Nodoprojeto<T> filhodireita;

    public Nodoprojeto(T valor) {
        this.valor = valor;
        this.filhodireita = null;
        this.filhoesquerda = null;
    }
}