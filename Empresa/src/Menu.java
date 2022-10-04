import java.util.Scanner;
public class Menu {
    private Empresa x = new Empresa();
    public void imprimirMenu() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("1 - Cadastrar empregado");
            System.out.println("2 - Consultar dados de um empregado pelo cpf");
            System.out.println("3 - Aumentar o salário do empregado");
            System.out.println("4 - Listar Empregados");
            System.out.println("5 - Listar Empregados por genero");
            System.out.println("6 – Excluir empregado pelo cpf");
            System.out.println("7 – Alterar o nome do empregado pelo cpf");
            System.out.println("8 – Aumentar os salários dos empregados pelo genero"); // passando o gênero e o percentual do aumento
            System.out.println("9 - Sair do sistema");
            System.out.println("Digite a opção desejada: ");
            int key = scan.nextInt();
            while (key != 9){
                    switch (key) {
                        case 1:
                        x.cadastrarEmpregado();
                        
                            break;
                        case 2:
                        x.obterDadosEmpregado();
                            break;
                        case 3:
                        x.aumentarSalarioEmp();
                            break;
                        case 4:
                        x.listarEmpregados();    
                            break;
                        case 5:
                        x.listarEmpregadosPorGenero();
                            break;
                        case 6:
                        x.excluirEmpregadoCpf();
                            break;
                        case 7:
                        x.alterarNomeCpf();
                            break;
                        case 8:
                        System.out.println("Digite o genero desejado: ");
                        String genero = scan.nextLine();
                        System.out.println("Digite o percentual desejado: ");
                        double percentual = scan.nextDouble();
                        x.aumentarSalarioGenero(genero, percentual);
                            break;
                        case 9:
                        System.out.println("SAIDA SOLICITADA...\n ENCERRANDO CÓDIGO!!");
                            break;          
                        default:
                            break;
                    }
                System.out.println("1 - Cadastrar empregado");
                System.out.println("2 - Consultar dados de um empregado pelo cpf");
                System.out.println("3 - Aumentar o salário do empregado");
                System.out.println("4 - Listar Empregados");
                System.out.println("5 - Listar Empregados por genero");
                System.out.println("6 – Excluir empregado pelo cpf");
                System.out.println("7 – Alterar o nome do empregado pelo cpf");
                System.out.println("8 – Aumentar os salários dos empregados pelo genero"); // passando o gênero e o percentual do aumento
                System.out.println("9 - Sair do sistema");
                System.out.println("Digite a opção desejada: ");
                key = scan.nextInt();
            } 
  
            }
        }
    }