public class App {
    public static void main(String[] args) throws Exception {
        ListaProdutos list = new ListaProdutos();
        Produto p1 = new Produto("Pacoca", 2.5);
        Produto p2 = new Produto("Iphone 14 ProMAx", 15565);
        Produto p3 = new ProdutoImportado("Whisk_20_Year ", 15500, 2);
        Produto p4 = new ProdutoImportado("MacBook", 20600, 1);
        Produto p5 = new Produto("Geladreira", 3000);
        list.insereProduto(p1);
        list.insereProduto(p4);
        list.insereProduto(p3);
        list.insereProduto(p2);
        list.insereProduto(p5);
        list.ImprimirProdutos();
        }
}
