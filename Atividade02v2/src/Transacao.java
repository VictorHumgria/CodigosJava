/*
    Na classe Transação é guardado o valor da transação e o
    tipo da mesma (crédito ou débito)
    • A classe Transação tem somente o construtor e os
    métodos get e set dos dois atributos
*/
public class Transacao {
    private int valor;
    private int tipo;
    public Transacao(int valor, int tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}