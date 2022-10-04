/*
    • Faça uma classe ProdutoImportado, que herda as características de
    Produto e tem mais um atributo (tipo) que pode ser 
    1 (eletrônico), 
    2(alimento) e 
    3 (outros).
    • Crie os métodos get e set para o atributo tipo e sobrescreva os
    métodos CalcularImposto() e ExibirRelatório().
    • O produto importado tem cobrança de imposto dependente do tipo
    de produto. Se for 
    eletrônico o imposto é de 35%, 
    se for alimentício oimposto é de 15%
     e os demais códigos o imposto é de 20%
*/
public class ProdutoImportado extends Produto{

    //Constructor, set e get;
    public ProdutoImportado(String nome, float preco, int tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    //metodos;
    public void calcularImposto(float valor){
        if(getTipo()==1){
            setValorImposto(valor+ valor*35 /100);
        }else if(getTipo()==2){
            setValorImposto(valor+valor*15 /100);
        }else{
            setValorImposto(valor+valor*20 /100);
        }
    }
    public void exibirRelatorio(){
        super.exibirRelatorio();
        System.out.println("Tipo: "+getTipo());
        
    }
}