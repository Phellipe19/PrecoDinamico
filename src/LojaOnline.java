public class LojaOnline {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);
        Produto produto3 = new Produto("Tênis", 200.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total cliente novo: " + carrinho.calcularTotal());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total cliente regular: " + carrinho.calcularTotal());

        carrinho.setDescontoStrategy(new DescontoClienteVip());
        System.out.println("Total cliente vip: " + carrinho.calcularTotal());
    }
}