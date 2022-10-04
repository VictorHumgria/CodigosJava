import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 4) A classe Empresa deve possuir as seguintes funcionalidades (métodos).
a. cadastrarEmpregado. Onde será permitido realizar o cadastro passando por parâmetro
um objeto Empregado como também um sobrecarga deste método para os dados do
empregado de forma separada(nome, idade, etc). O novo empregado será adicionado
a um vetor de Empregados existente na classe Empresa.
b. obterDadosEmpregado. Onde será passado por parâmetro o CPF de um funcionário e
será retornado uma referencia ao objeto(Empregado) do empregado que possui
aquele CPF.
c. listarEmpregados. Onde será listado o CPF e nome de todos os empregados da
empresa.
d. listarEmpregadosPorGenero. Onde será passado por parâmetro o sexo(M ou F) e será
exibido o CPF e nome de todos os empregados que se encaixarem no valor passado
por parâmetro.
e. qtdEmpregados. Irá retornar um valor inteiro contendo quantos empregados estão
cadastrados na empresa.
CPF, nome, idade, sexo(M ou F), cargo e salário*/

public class Empresa {
    private List<Empregado> e = new ArrayList<Empregado>();
    private Scanner scan = new Scanner(System.in);
    
    public Empresa() {
    }
    public void cadastrarEmpregado(){
        String cpf; String nome; int idade; String sexo; String cargo; double salario;
        System.out.println("\nCADASTRO DOS FUNCIONARIOS\n");
        System.out.println("Digite o cpf: ");
        cpf = scan.nextLine();
        System.out.println("Digite o nome: ");
        nome = scan.nextLine();
        System.out.println("Digite a idade: ");
        idade = scan.nextInt();
        System.out.println("Digite o sexo(M/F): ");
        sexo = scan.nextLine();
        System.out.println("Digite o cargo: ");
        cargo = scan.nextLine();
        System.out.println("Digite o salario: ");
        salario = scan.nextDouble(); 
        e.add(new Empregado(cpf, nome, idade, sexo, cargo, salario));         
    }
    public void aumentarSalarioEmp(){
        Empregado emp = new Empregado();
        System.out.println("Digite o cpf desejado: ");
        String cpf = scan.nextLine();
        System.out.println("Digite o aumento desejado: ");
        double percentual = scan.nextDouble();
        for(int i=0; i<e.size();i++){
            if(cpf.equalsIgnoreCase(e.get(i).getCpf())){
            e.get(i).setSalario(emp.aumentarSalario(percentual));
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            }

            
        }
    }
    public void obterDadosEmpregado(){
        String cpf;
        System.out.println("Digite o cpf desejado: ");
        cpf = scan.nextLine();
        for(int i=0; i<e.size();i++){
            if(cpf.equalsIgnoreCase(e.get(i).getCpf())){
            System.out.println("Nome: "+e.get(i).getNome());
            System.out.println("CPF: "+e.get(i).getCpf());
            System.out.println("Idade: "+e.get(i).getIdade());
            System.out.println("Sexo: "+e.get(i).getSexo());
            System.out.println("Cargo: "+e.get(i).getCargo());
            System.out.println("Salario: "+e.get(i).getSalario());
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            }

            
        }
    }
    public void listarEmpregados(){
        System.out.println("\nLISTA COM TODOS OS EMPREGADOS\n");
        for (Empregado empregado : e) {
            System.out.println("Nome: "+empregado.getNome());
            System.out.println("CPF: "+empregado.getCpf());
        }
    }
    public void listarEmpregadosPorGenero(){
        System.out.println("Digite o genero desejado: ");
        String genero = scan.nextLine();
        for(int i=0; i<e.size();i++){
            if(genero.equalsIgnoreCase(e.get(i).getSexo())){
            System.out.println("Nome: "+e.get(i).getNome());
            System.out.println("CPF: "+e.get(i).getCpf());
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            }
        }
    }
    public void qtdEmpregados(){
        System.out.println("Quantidade total de empregados: "+ e.size());
    }
    public void excluirEmpregadoCpf(){
        System.out.println("Digite o cpf desejado: ");
        String cpf = scan.nextLine();
        for(int i=0; i<e.size();i++){
            if(cpf.equalsIgnoreCase(e.get(i).getCpf())){
                System.out.println("Excluir? (S/N)");
                String key = scan.nextLine();
                if(key.equalsIgnoreCase("s")){
                    e.remove(i);
                    System.out.println("\nREGISTRO REMOVIDO!!!");
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                }
            }
        }
    }
    public void alterarNomeCpf(){
        System.out.println("Digite o cpf desejado: ");
        String cpf = scan.nextLine();
        for(int i=0; i<e.size();i++){
            if(cpf.equalsIgnoreCase(e.get(i).getCpf())){
            System.out.println("Digite o nome desejado: ");
            String nome = scan.nextLine();
            e.get(i).setNome(nome);
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            } 
        }
    }
    public void aumentarSalarioGenero(String genero, double percentual){
        Empregado emp = new Empregado();
        for(int i=0; i<e.size();i++){
            if(e.get(i).getSexo().equalsIgnoreCase(genero)){
                e.get(i).setSalario(emp.aumentarSalario(percentual));
            }
        }
    }

}