import java.util.Scanner;

public class App {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            Calculadora casio = new Calculadora();
            CalculadoraMem mem = new CalculadoraMem();
            float valor1, valor2; int key=0;
            System.out.println("PROGAMA CALCULADORA COM ARMAZENAMENTO DE DADOS.\n");
            
            do {
                System.out.println("1- p/ SOMA;");
                System.out.println("2- p/ SUBTRAÇÃO;");
                System.out.println("3- p/ DIVISÃO;");
                System.out.println("4- p/ MULTIPLICAÇÃO;");
                System.out.println("5- p/ EXIBIR O REGISTRO;");
                System.out.println("6- p/ LIMPAR OS DADOS;");
                System.out.println("7- p/ SAIR;\n");
                System.out.println("Digite a opção desejada:");
               key = scan.nextInt();
               switch (key) {
                case 1:
                System.out.println("Digite o primeiro número: ");
                valor1 = scan.nextFloat();
                System.out.println("Digite o segundo número:");
                valor2 = scan.nextFloat();
                mem.armazenarMemoria(casio.soma(valor1, valor2));
                    break;
               case 2:
                System.out.println("Digite o primeiro número: ");
                valor1 = scan.nextFloat();
                System.out.println("Digite o segundo número:");
                valor2 = scan.nextFloat();
                mem.armazenarMemoria(casio.subtracao(valor1, valor2));
                    break;
                case 3:
                System.out.println("Digite o primeiro número: ");
                valor1 = scan.nextFloat();
                System.out.println("Digite o segundo número:");
                valor2 = scan.nextFloat();
                mem.armazenarMemoria(casio.divisao(valor1, valor2));
                    break;
                case 4:
                System.out.println("Digite o primeiro número: ");
                valor1 = scan.nextFloat();
                System.out.println("Digite o segundo número:");
                valor2 = scan.nextFloat();
                mem.armazenarMemoria(casio.multiplicacao(valor1, valor2));
            
                    break;
                case 5:
                System.out.println("Exibir dados selecionado.");
                mem.recuperarMemoria();
                    break;
                case 6:
                System.out.println("FUNÇÃO LIMPAR DADAOS SELECIONADA");
                System.out.println("Desejado limpar os registros?(s/n)");
                String k = scan.next();
                if(k.equalsIgnoreCase("s")){
                    mem.limparDados();
                    System.out.println("Limpeza executada..");
                }
                    break;
                case 7:
                    System.out.println("SAIDA SOLICITADA.");
                    break;    
                default:
                    break;
               }
            } while (key!=7);
        }
    }
}
