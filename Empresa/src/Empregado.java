//CPF, nome, idade, sexo(M ou F), cargo e salário

public class Empregado {
    private String cpf;
    private String nome;
    private int idade;
    private String sexo;
    private String cargo;
    private double salario;
    
    public Empregado() {
    }
    public Empregado(String cpf, String nome, int idade, String sexo, String cargo, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double aumentarSalario(double percentual){
         return this.salario += salario*(percentual/100);
    }
}