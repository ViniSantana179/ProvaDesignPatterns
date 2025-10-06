public class PagamentoFactory implements MetodoPagamento {
    @Override
    public Pagamento criarMetodoPagamento(String tipo) {
        if (tipo.equalsIgnoreCase("boleto")) {
            return new Boleto();
        } else if (tipo.equalsIgnoreCase("pix")) {
            return new Pix();
        } else if (tipo.equalsIgnoreCase("cartao")) {
            return new CartaoCredito();
        }
        throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + tipo);
    }
}