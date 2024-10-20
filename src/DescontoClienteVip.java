public class DescontoClienteVip implements DescontoStrategy{

    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.80;
    }
}

