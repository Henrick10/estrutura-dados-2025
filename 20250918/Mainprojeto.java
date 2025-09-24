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

        // Criando a árvore binária para motoristas com comparação baseada em nome, id e endereço
        Arvorebinariaprojeto<MotoristaComparator> arvoreMotoristasComparator = new Arvorebinariaprojeto<>();
        
        MotoristaComparator motoristaComp1 = new MotoristaComparator("João Silva", "001", "Rua A");
        MotoristaComparator motoristaComp2 = new MotoristaComparator("Maria Oliveira", "002", "Rua B");

        // Inserindo motoristas com comparador na árvore
        arvoreMotoristasComparator.inserir(motoristaComp1);
        arvoreMotoristasComparator.inserir(motoristaComp2);

        // Impressão em ordem para a árvore com comparador
        System.out.println("\n--- Impressão em ordem (com comparador) ---");
        arvoreMotoristasComparator.imprimeemOrdem();

        // Impressão pré-fixada para a árvore com comparador
        System.out.println("\n\n--- Impressão pré-fixada (com comparador) ---");
        arvoreMotoristasComparator.imprimePreFixado();
    }
}
