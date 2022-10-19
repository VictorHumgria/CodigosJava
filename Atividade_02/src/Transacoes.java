
public class Transacoes {
    private int valor;
    private int tipo;
    public Transacoes(int valor, int tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    public double getTran() {
        return valor;
    }
    public void setTran(int valor) {
        this.valor = valor;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}