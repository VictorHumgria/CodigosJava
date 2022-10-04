import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x;
        try (Scanner scan = new Scanner(System.in)) {
            ListaProdutos list = new ListaProdutos();
            /*Produto p1 = new Produto("HAMBURGUER", 55);                              // situação criadas para teste;
            Produto p2 = new Produto("Pipoca", 101);
            Produto p3 = new ProdutoImportado("Processador", 5000, 1);
            Produto p4 = new ProdutoImportado("PlacaDeVideo", 2000, 1);
            Produto p5 = new Produto("Geladeira", 3500);
            Produto p6 = new Produto("celular", 1900);
            Produto p7 = new ProdutoImportado("whisk", 1250, 2);
            list.insereProduto(p1);
            list.insereProduto(p2);
            list.insereProduto(p3);
            list.insereProduto(p4);
            list.insereProduto(p5);
            list.insereProduto(p6);
            list.insereProduto(p7);
            list.imprimirProdutos();*/
            do {                                                                       // codigo final com menu para melhor interação e boa prática
            System.out.println("----MENU----");
            System.out.println("1 - Inserir produto;");
            System.out.println("2 - Imprimir produto;");
            System.out.println("3 - sair do programa;");
            System.out.println("Digite a opção desejada: ");
            x = scan.nextInt();
            switch (x) {
                case 1:
                System.out.println("Deseja inserir um produto importado ou nacional? (1/2):");
                x = scan.nextInt();
                if(x==1){
                    System.out.println("Digite o nome do produto: ");
                    String nome = scan.next();
                    System.out.println("Digite o preço: ");
                    float preco = scan.nextFloat();
                    System.out.println("Digite o tipo: ");
                    int tipo = scan.nextInt();
                    list.insereProduto(new ProdutoImportado(nome, preco, tipo));
                }else if (x==2){
                    System.out.println("Digite o nome do produto: ");
                    String nome = scan.next();
                    System.out.println("Digite o preço: ");
                    float preco = scan.nextFloat();
                    list.insereProduto(new Produto(nome, preco));
                }else{
                    System.out.println("----ERROR!!!---- \nOPÇÃO INVALIDA!!!");
                }
                    break;
                case 2:
                list.imprimirProdutos();
                    break;
                case 3:
                System.out.println("SAIDA SOLICITADA!!!");    
                break;
                default:
                System.out.println("----ERROR!!!----\nOPÇÃO INVALIDA POR FAVIR INSIRA UMA VALIDA...");
                    break;
            }
            } while (x!=3);
        }
    }
}
