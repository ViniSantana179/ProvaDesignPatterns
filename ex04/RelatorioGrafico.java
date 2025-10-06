public class RelatorioGrafico extends RelatorioDecorator {
    
    public RelatorioGrafico(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerarRelatorio() {
        return super.gerarRelatorio() + "Inclui gráficos no relatório.\n";
    }
}
