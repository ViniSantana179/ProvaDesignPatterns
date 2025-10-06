public class RelatorioVendas implements Relatorio {
    @Override
    public String gerarRelatorio() {
        return "Relatório de Vendas\n" +
               "Vendedor: Roberval \n" +
               "Total de Vendas: R$ " + String.format("%.2f", 3450.00) + "\n";
    }

}
