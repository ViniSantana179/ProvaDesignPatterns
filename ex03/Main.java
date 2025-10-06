public class Main {
    public static void main(String[] args) {
        Site site = new Site();

        Leitor leitor1 = new Leitor("João");
        Leitor leitor2 = new Leitor("Maria");
        Leitor leitor3 = new Leitor("José");

        site.adicionarLeitor(leitor1);
        site.adicionarLeitor(leitor2);
        site.adicionarLeitor(leitor3);

        site.notificarLeitores("Nova noticia sobre esportes!");
        site.notificarLeitores("Nova noticia sobre tecnologia!");
        site.notificarLeitores("Nova noticia sobre politica!");

        site.removerLeitor(leitor2);

        site.notificarLeitores("Nova noticia sobre economia!");

    }
}
