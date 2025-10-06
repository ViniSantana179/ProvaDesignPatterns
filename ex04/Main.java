public class Main {
    public static void main(String[] args) {
        Relatorio relatorioVendas = new RelatorioVendas();
        System.out.println("Relatório de Vendas Básico:");
        System.out.println(relatorioVendas.gerarRelatorio());

        Relatorio relatorioComGraficos = new RelatorioGrafico(relatorioVendas);
        System.out.println("Relatório com Gráficos:");
        System.out.println(relatorioComGraficos.gerarRelatorio());

        Relatorio relatorioPdf = new RelatorioPdf(relatorioComGraficos);
        System.out.println("Relatório em PDF com Gráficos:");
        System.out.println(relatorioPdf.gerarRelatorio());
    }
}
