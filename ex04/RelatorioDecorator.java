public class RelatorioDecorator  implements Relatorio{
    protected Relatorio relatorio;
    
    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }


    @Override
    public String gerarRelatorio() {
        return relatorio.gerarRelatorio();
    }
}
