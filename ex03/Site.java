import java.util.List;
import java.util.ArrayList;

public class Site implements ISite {
    private List<LeitorObserver> leitores = new ArrayList<>();

    public void adicionarLeitor(LeitorObserver leitor) {
        leitores.add(leitor);
    }

    public void removerLeitor(LeitorObserver leitor) {
        leitores.remove(leitor);
    }

    public void notificarLeitores(String mensagem) {
        for (LeitorObserver leitor : leitores) {
            leitor.atualizar(mensagem);
        }
    }
}
