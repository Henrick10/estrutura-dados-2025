public class Arvorebinariaprojeto<T extends Comparable<T>> implements ProjetoArvore<T> {
    Nodoprojeto<T> raiz;

    public Arvorebinariaprojeto() {
        this.raiz = null;
    }

    @Override
    public void inserir(T objeto) {
        this.raiz = inserirRecursivo(this.raiz, objeto);
    }

    private Nodoprojeto<T> inserirRecursivo(Nodoprojeto<T> noAtual, T objeto) {
        if (noAtual == null) {
            return new Nodoprojeto<>(objeto);
        }
        if (noAtual.valor.compareTo(objeto) > 0) {
            noAtual.filhoesquerda = inserirRecursivo(noAtual.filhoesquerda, objeto);
        } else {
            noAtual.filhodireita = inserirRecursivo(noAtual.filhodireita, objeto);
        }
        return noAtual;
    }

    @Override
    public Nodoprojeto<T> pesquisa(T objeto) {
        return pesquisaRecursivo(this.raiz, objeto);
    }

    private Nodoprojeto<T> pesquisaRecursivo(Nodoprojeto<T> noAtual, T objeto) {
        if (noAtual == null || noAtual.valor.equals(objeto)) {
            return noAtual;
        }
        if (noAtual.valor.compareTo(objeto) > 0) {
            return pesquisaRecursivo(noAtual.filhoesquerda, objeto);
        } else {
            return pesquisaRecursivo(noAtual.filhodireita, objeto);
        }
    }

    @Override
    public void imprimePreFixado() {
        imprimePreFixadoRecursivo(this.raiz);
    }

    private void imprimePreFixadoRecursivo(Nodoprojeto<T> no) {
        if (no != null) {
            System.out.println(no.valor + "");
            imprimePreFixadoRecursivo(no.filhoesquerda);
            imprimePreFixadoRecursivo(no.filhodireita);
        }
    }

    public void imprimeemOrdem() {
        imprimeemOrdemRecursivo(this.raiz);
    }

    private void imprimeemOrdemRecursivo(Nodoprojeto<T> no) {
        if (no != null) {
            imprimeemOrdemRecursivo(no.filhoesquerda);
            System.out.print(no.valor + " ");
            imprimeemOrdemRecursivo(no.filhodireita);
        }
    }
}