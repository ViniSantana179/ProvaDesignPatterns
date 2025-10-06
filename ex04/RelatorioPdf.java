public class RelatorioPdf extends RelatorioDecorator {

    public RelatorioPdf(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerarRelatorio() {
        return super.gerarRelatorio() + "Formato: PDF\n";
    }
}
