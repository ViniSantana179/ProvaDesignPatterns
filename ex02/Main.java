public class Main {
    public static void main(String[] args) {
        MetodoPagamento factory = new PagamentoFactory();

        Pagamento pagamento1 = factory.criarMetodoPagamento("boleto");
        pagamento1.pagar(150.0);

        Pagamento pagamento2 = factory.criarMetodoPagamento("pix");
        pagamento2.pagar(200.0);

        Pagamento pagamento3 = factory.criarMetodoPagamento("cartao");
        pagamento3.pagar(300.0);
    }
}