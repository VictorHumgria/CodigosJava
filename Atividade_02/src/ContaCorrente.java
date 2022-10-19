import java.util.ArrayList;


/*
    Faça uma classe Conta Corrente que permite guardar o
    saldo e as Transações feitas por determinados clientes
*/
public class ContaCorrente {
    protected ArrayList<Transacoes> mov = new ArrayList<>();
    protected ArrayList<Conta> acc = new ArrayList<>();
    public ContaCorrente(Conta c, Transacoes rs) {
        acc.add(c);
        mov.add(rs);
    }
    public ContaCorrente(Conta c, int valor) {
        acc.add(c);
        mov.add(new Transacoes(valor, 1));
    }
    public ContaCorrente(){

    }
    public void adicionarConta(Conta c){
        this.acc.add(c);
    }
    
    public ArrayList<Transacoes> getMov() {
        return mov;
    }
    public ArrayList<Conta> getAcc() {
        return acc;
    }
    public boolean verificarConta(String nome){
        for(int i=0; i<acc.size(); i++){
            if(acc.get(i).getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }
    
    
}