public interface ISite {
    void adicionarLeitor(LeitorObserver leitor);
    void removerLeitor(LeitorObserver leitor);
    void notificarLeitores(String mensagem);
}
