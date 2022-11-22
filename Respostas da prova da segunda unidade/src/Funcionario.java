/*
implemente o conceito de classe abstrata com base na descrição abaixo.Vale(3,0)

1)A classe Funcionario é abstrata, Mas irar conter os atributos salário e nome que somente poderá ser visto pelas classes que herdam dela.
2)Na classe Funcionario irá ter os métodos concrestos get e set para os atributos nome e salário. Como também o método imprimirSalario que irá imprimir o atributo salário.
3)Irá ter o método abstrato aumentarSalario.
4)Irá ter as classes concrestas Diretor e Analista que herdam de Funcionario.
5)O método aumentarSalario() quando chamado. Se for um Diretor aumenta seu salário em 15%. e se for Analista aumenta seu salario em 25%
6)Crie uma classe para testar as classes criadas. Onde serão criados ! objeto da classe diretor e 1 objetos para a classe analista.
 Em seguida deverá ser chamado o método aumentar salario para ambos os objestoe e sposteriormente chamar o método imprimirSalario para ambos os objetos.
*/
public abstract class Funcionario {
    private String nome;
    private float salario;
    
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void imprimirSalario(){
        System.out.println("Valor do salario: "+getSalario());
    }
    public abstract void aumentarSalario();

}