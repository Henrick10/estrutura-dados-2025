public class Motorista implements Comparable<Motorista> {
    String nome;
    String cpf;
    String cnh;
    String categoriaCnh;
    String dataNascimento;
    String telefone;
    String endereco;

    @Override
    public int compareTo(Motorista outro) {
        // Ordenação por nome, depois CPF
        String valorAtual = this.nome + '-' + this.cpf;
        String valorOutro = outro.nome + '-' + outro.cpf;

        // Retorna:
        // -1 se esse é menor do que outro
        // 1 se esse é maior do que outro
        // 0 se são iguais
        return valorAtual.compareTo(valorOutro);
    }

    // Construtor
    public Motorista(String nome, String cpf, String cnh, String categoriaCnh, String dataNascimento, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.categoriaCnh = categoriaCnh;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Motorista: " + this.nome + " - CPF: " + this.cpf + " - CNH: " + this.cnh + "\n";
    }
}
