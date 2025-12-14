public class PrincipalProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Celular ", 2000);

        System.out.println("O produto " + produto.getNome() + "custa " + produto.getPreco());

        produto.aplicarDesconto(50);

        System.out.println("Novo preço com desonto " + produto.getPreco());

    }

}
