public class Main {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Titulo1", "Conteudo1", "Azul", "Arial");
        Documento doc2 = (Documento) doc1.clonar();

        System.out.println("Documento 1: " + doc1.mostrarInfo());
        System.out.println("Documento 2: " + doc2.mostrarInfo());
    }
}
