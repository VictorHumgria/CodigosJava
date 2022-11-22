
public class Analista extends Funcionario {

    public Analista(String nome, float salario) {
        super(nome, salario);
        System.out.println("Analista adicionado com sucesso!");
    }
    @Override
    public void aumentarSalario() {
        setSalario(getSalario()+((getSalario()*25)/100));
    }
}