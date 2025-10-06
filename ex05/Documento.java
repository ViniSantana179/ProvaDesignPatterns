public class Documento implements Modelo {
    private String titulo;
    private String conteudo;
    private String cor;
    private String fonte;

    public Documento(String titulo, String conteudo, String cor, String fonte) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.cor = cor;
        this.fonte = fonte;
    }

    public String mostrarInfo() {
        return "Titulo: " + titulo + ", Conteudo: " + conteudo + ", Cor: " + cor + ", Fonte: " + fonte;
    }

    @Override
    public Modelo clonar() {
        return new Documento(this.titulo, this.conteudo, this.cor, this.fonte);
    }
}
