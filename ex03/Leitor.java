public class Leitor implements LeitorObserver {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu uma nova noticia: " + mensagem);
    }
    
}