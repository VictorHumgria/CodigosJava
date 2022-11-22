import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Carrinho caixa = new Carrinho();
        
        int x=0;
        while (x != 4) {
        System.out.println("Menu: ");
        System.out.println("1 - Adiconar celular ao carrinho;");
        System.out.println("2 - Adicionar Livro ao carrinho;");
        System.out.println("3 - Exibir produtos no carrinho;");
        System.out.println("4 - Sair;");
        System.out.println("Digite a opcao desejada: ");
        x = scan.nextInt();
            switch (x) {
                case 1:
                System.out.println("Digite o Nome do produto: ");
                String nome = scan.next();
                System.out.println("Digite o preco do produto: ");
                double preco = scan.nextDouble();
                System.out.println("Digite a descricao: ");
                String descricao = scan.next();
                System.out.println("Digite o modelo: ");
                String modelo = scan.next();
                caixa.adicionar(new Celular(nome, preco, descricao, modelo));
                System.out.println("--------------------------------------");
                    break;
                case 2:
                System.out.println("Digite o Nome do produto: ");
                nome = scan.next();
                System.out.println("Digite o preco do produto: ");
                preco = scan.nextDouble();
                System.out.println("Digite a descricao: ");
                descricao = scan.next();
                System.out.println("Digite o autor: ");
                String autor = scan.next();
                caixa.adicionar(new Livro(nome, preco, descricao, autor));
                System.out.println("--------------------------------------");
                    break;
                case 3:
                caixa.imprimirLista();
                    break;
                case 4:
                System.out.println("SAIDA SOLICITADA.");
                System.out.println("--------------------------------------");
                    break;
                default:
                System.out.println("OPCAO INVALIDA!!!!!!!");
                System.out.println("--------------------------------------");
                    break;
            }
        }
        scan.close();
    }
}
