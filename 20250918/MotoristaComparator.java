public class MotoristaComparator implements Comparable<MotoristaComparator> {
    String nome;
    String id;
    String endereco;

    // Construtor
    public MotoristaComparator(String nome, String id, String endereco) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
    }

    // Método compareTo para comparar motoristas
    @Override
    public int compareTo(MotoristaComparator outro) {
        // Concatenando nome, ID e endereço para comparação
        String valorAtual = this.nome + this.id + this.endereco;
        String outroValor = outro.nome + outro.id + outro.endereco;
        return valorAtual.compareTo(outroValor);
    }

    // Método toString para imprimir as informações do motorista
    @Override
    public String toString() {
        return "Motorista [Nome=" + this.nome + ", ID=" + this.id + ", Endereço=" + this.endereco + "]";
    }
}
