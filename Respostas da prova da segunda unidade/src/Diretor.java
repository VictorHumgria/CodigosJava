
public class Diretor extends Funcionario {
    
    public Diretor(String nome, float salario) {
        super(nome, salario);
        System.out.println("Diretor adicionado com sucesso!");
    }
    @Override
    public void aumentarSalario() {
       setSalario(getSalario()+((getSalario()*15)/100));
    }
}