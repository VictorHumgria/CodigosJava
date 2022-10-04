
/*
 * a. Os dados do empregado são: CPF, nome, idade, sexo(M ou F), cargo e salário.
b. Criar o construtor que permita passar os dados acima do empregado.
c. Criar os métodos get dos atributos CPF, nome, idade, sexo(M ou F), cargo e salário e os
métodos set dos atributos nome, idade, sexo(M ou F) e cargo.
d. Criar o método aumentarSalario onde será passado por parâmetro o percentual do
aumento do empregado.*/
public class Empregado {
	private String cpf;
	private String nome;
	private int idade;
	private String Sexo;
	private String cargo;
	private double salario;
	
	
	public Empregado(String cpf, String nome, int idade, String sexo, String cargo, double salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.Sexo = sexo;
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
		return Sexo;
	}


	public void setSexo(String sexo) {
		Sexo = sexo;
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
}
