/*
    • Faça uma classe ProdutoImportado, que herda as características de
    Produto e tem mais um atributo (tipo) que pode ser 1 (eletrônico), 2
    (alimento) e 3 (outros).
    • Crie os métodos get e set para o atributo tipo e sobrescreva os
    métodos CalcularImposto() e ExibirRelatório().
    • O produto importado tem cobrança de imposto dependente do tipo
    de produto. Se for 
    eletrônico o imposto é de 35%, 
    se for alimentício oimposto é de 15% 
    e os demais códigos o imposto é de 20%
*/
public class ProdutoImportado extends Produto {
    private int tipo;

    public ProdutoImportado(String nome, double preco, int tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double calcularImposto(double preco, int tipo){
        if(tipo == 1){
            return preco * 0.35;
        }else if(tipo == 2){
            return preco * 0.15;
        }else{
            return preco * 0.20;
        }
    }
    public void exibirRelatorio(){
        super.exibirRelatorio();
        System.out.println("Tipo do produto: "+getTipo());
    }
    
}