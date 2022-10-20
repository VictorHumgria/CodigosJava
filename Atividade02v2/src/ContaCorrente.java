import java.util.ArrayList;

/*
    Faça uma classe Conta Corrente que represente o
    sistema de contas correntes do banco, onde é
    armazenado todas as contas do banco. Onde permite
    guardar todas as contas existentes com suas respectivas
    Transações feitas por todos os clientes.

*/
public class ContaCorrente extends Conta{
    public ArrayList<Conta> contas = new ArrayList<>();
    public ContaCorrente() {
        super();
    }
    public void adicionarConta(Conta c){
        contas.add(c);
        System.out.println("Conta adicionada com sucesso.");
    }
    public void transferencia(Conta origem, Conta destino , int valor) throws ContaInexistenteException, SaldoException{
        if(origem.getSaldoAtual()<valor){
            throw new SaldoException("Saldo insuficiente.");
        }
        for(int i=0; i<contas.size();){
            if(destino.getNome().equalsIgnoreCase(contas.get(i).getNome())){
                destino.deposito(valor,1);
                origem.saque(valor,1);
                System.out.println("Transação realizada com sucesso.");
                return;
            }else{
                throw new ContaInexistenteException("Conta inexsistente.");
            }
        }
        
    }
    public void imprimir(){
        for (Conta conta : contas) {
         conta.imprimir();
         System.out.println("------------------------");   
        }
    }

    

}