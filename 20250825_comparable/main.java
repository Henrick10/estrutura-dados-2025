public class Main {
    public static void main(String[] args) {
        // Criando alguns motoristas
        Motorista motorista1 = new Motorista("João Silva", "11111111111", "CNH001", "B", "10/05/1985", "11999999999", "Rua A, 123");
        Motorista motorista2 = new Motorista("Maria Oliveira", "22222222222", "CNH002", "C", "15/08/1990", "11988888888", "Rua B, 456");
        Motorista motorista3 = new Motorista("Carlos Santos", "33333333333", "CNH003", "D", "20/02/1980", "11977777777", "Rua C, 789");
        Motorista motorista4 = new Motorista("Ana Pereira", "44444444444", "CNH004", "B", "05/11/1992", "11966666666", "Rua D, 321");
        Motorista motorista5 = new Motorista("Pedro Almeida", "55555555555", "CNH005", "E", "30/01/1988", "11955555555", "Rua E, 654");
        Motorista motorista6 = new Motorista("Lucas Lima", "66666666666", "CNH006", "B", "12/07/1995", "11944444444", "Rua F, 987");

        // Criando árvore binária de motoristas
        ArvoreBinaria<Motorista> arvore = new ArvoreBinaria<>();

        // Inserindo motoristas na árvore
        arvore.inserir(motorista1);
        arvore.inserir(motorista4);
        arvore.inserir(motorista6);
        arvore.inserir(motorista3);
        arvore.inserir(motorista5);
        arvore.inserir(motorista2);

        // Impressões
        System.out.println("Impressão em ordem:");
        arvore.imprimeEmOrdem();

        System.out.println("\nImpressão pré-fixada:");
        arvore.imprimePreFixado();
    }
}
