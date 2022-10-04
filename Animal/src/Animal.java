
public class Animal {
	public String nome;
	public double comprimento;
	public int numeroDePatas;
	public String cor;
	public String ambiente;
	public double velocidadeMedia;
	
	
	public Animal(String nome, double comprimento, int numeroDePatas, String cor, String ambiente,double velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroDePatas = numeroDePatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumeroDePatas() {
		return numeroDePatas;
	}
	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidadMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadMedia(double velocidadMedia) {
		this.velocidadeMedia = velocidadMedia;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("Comprimento: "+comprimento);
		System.out.println("Número de patas: "+numeroDePatas);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Velocidade média: "+velocidadeMedia);
		
	}
	
}
