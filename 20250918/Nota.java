public class Motorista implements Comparable<Motorista> {
    String nome;
    String id;
    String endereco;

    // Construtor
    public Motorista(String nome, String id, String endereco) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
    }

    // Implementação do método compareTo para comparar motoristas
    @Override
    public int compareTo(Motorista outro) {
        // Concatenando nome, id e endereco para comparação
        String valorAtual = this.nome + this.id + this.endereco;
        String valorOutro = outro.nome + outro.id + outro.endereco;
        return valorAtual.compareTo(valorOutro);
    }

    // Método toString para imprimir as informações do motorista
    @Override
    public String toString() {
        return "Motorista: " + this.nome + " - ID: " + this.id + " - Endereço: " + this.endereco;
    }
}

public class Arvorebinariaprojeto<T extends Comparable<T>> {
    private Nodo<T> raiz;

    // Método para inserir um elemento na árvore
    public void inserir(T elemento) {
        raiz = inserirRecursivo(raiz, elemento);
    }

    // Inserção recursiva
    private Nodo<T> inserirRecursivo(Nodo<T> raiz, T elemento) {
        if (raiz == null) {
            return new Nodo<>(elemento);
        }

        if (elemento.compareTo(raiz.elemento) < 0) {
            raiz.esquerda = inserirRecursivo(raiz.esquerda, elemento);
        } else if (elemento.compareTo(raiz.elemento) > 0) {
            raiz.direita = inserirRecursivo(raiz.direita, elemento);
        }

        return raiz;
    }

    // Impressão em ordem
    public void imprimeemOrdem() {
        imprimeemOrdemRecursivo(raiz);
    }

    private void imprimeemOrdemRecursivo(Nodo<T> raiz) {
        if (raiz != null) {
            imprimeemOrdemRecursivo(raiz.esquerda);
            System.out.println(raiz.elemento);
            imprimeemOrdemRecursivo(raiz.direita);
        }
    }

    // Impressão pré-fixada
    public void imprimePreFixado() {
        imprimePreFixadoRecursivo(raiz);
    }

    private void imprimePreFixadoRecursivo(Nodo<T> raiz) {
        if (raiz != null) {
            System.out.println(raiz.elemento);
            imprimePreFixadoRecursivo(raiz.esquerda);
            imprimePreFixadoRecursivo(raiz.direita);
        }
    }

    // Classe Nodo para armazenar os elementos da árvore
    private static class Nodo<T> {
        T elemento;
        Nodo<T> esquerda, direita;

        public Nodo(T elemento) {
            this.elemento = elemento;
            esquerda = direita = null;
        }
    }
}

public class Mainprojeto {
    public static void main(String[] args) {
        // Criando a árvore binária para motoristas
        Arvorebinariaprojeto<Motorista> arvoreMotoristas = new Arvorebinariaprojeto<>();

        // Criando motoristas
        Motorista motorista1 = new Motorista("João Silva", "001", "Rua A");
        Motorista motorista2 = new Motorista("Maria Oliveira", "002", "Rua B");
        Motorista motorista3 = new Motorista("Pedro Souza", "003", "Rua C");
        Motorista motorista4 = new Motorista("Ana Costa", "004", "Rua D");
        Motorista motorista5 = new Motorista("Carlos Pereira", "005", "Rua E");
        Motorista motorista6 = new Motorista("Lucia Santos", "006", "Rua F");
        Motorista motorista7 = new Motorista("Roberto Almeida", "007", "Rua G");
        Motorista motorista8 = new Motorista("Fernanda Lima", "008", "Rua H");
        Motorista motorista9 = new Motorista("Ricardo Mendes", "009", "Rua I");
        Motorista motorista10 = new Motorista("Patrícia Ferreira", "010", "Rua J");

        // Inserindo motoristas na árvore
        arvoreMotoristas.inserir(motorista5);
        arvoreMotoristas.inserir(motorista3);
        arvoreMotoristas.inserir(motorista1);
        arvoreMotoristas.inserir(motorista7);
        arvoreMotoristas.inserir(motorista2);
        arvoreMotoristas.inserir(motorista4);
        arvoreMotoristas.inserir(motorista6);
        arvoreMotoristas.inserir(motorista8);
        arvoreMotoristas.inserir(motorista9);
        arvoreMotoristas.inserir(motorista10);

        // Impressão em ordem
        System.out.println("\n--- Impressão em ordem ---");
        arvoreMotoristas.imprimeemOrdem();

        // Impressão pré-fixada
        System.out.println("\n\n--- Impressão pré-fixada ---");
        arvoreMotoristas.imprimePreFixado();
    }
}
