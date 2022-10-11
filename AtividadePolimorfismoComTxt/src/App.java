public class App {
    public static void main(String[] args){
        Produto p1 = new Produto("Cachaca", 10);
        ProdutoImportado p2 = new ProdutoImportado("Cachaca cara", 20000, 2);
        Produto p3 = new Produto("Biscoito", 3);
        Produto p4 = new Produto("Farinha ", 7);
        ProdutoImportado p5 = new ProdutoImportado("Placa de video", 5000, 1);
        ProdutoImportado p6 = new ProdutoImportado("CelularIphone14ProMax", 14550, 1);
        Produto p7 = new Produto("cueca ", 15);
        ProdutoImportado p8 = new ProdutoImportado("Processador ", 2000, 1);
        Produto p9 = new Produto("cuecaDiamond ", 40);
        ProdutoImportado p10 = new ProdutoImportado("MemoriaRam", 55, 3);
        ListaProdutos list = new ListaProdutos();
        list.insereProdurto(p10);
        list.insereProdurto(p9);
        list.insereProdurto(p8);
        list.insereProdurto(p7);
        list.insereProdurto(p6);
        list.insereProdurto(p5);
        list.insereProdurto(p4);
        list.insereProdurto(p3);
        list.insereProdurto(p2);
        list.insereProdurto(p1);
        list.imprimirProdutos();

    }
}
