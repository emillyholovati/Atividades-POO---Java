public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Mouse", 150, 5);

        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preco: " + p1.getValor());
        System.out.println("Quantidade: " + p1.getQuantidade());
        System.out.println("Valor Total: " + p1.valorTotalEstoque());

        p1.adicionarEstoque(5);
        p1.removerEstoque(3);

        System.out.println("Quantidade atual: " + p1.getQuantidade());
    }
}
