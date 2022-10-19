
/*
    • Na classe Conta são armazenados os seguintes dados:
    numero, nome, salto atual e o conjunto de transações
    realizadas

        • Na classe Conta tem os seguintes métodos
    • public Conta(int numero, String nome, double saldoInicial)
    • public void deposito(int valor)
    • public void saque(int valor) throw SaldoException
    • public void transferencia(Conta c, int valor) throw SaldoException,
    ContaInexistenteException
    • public void mostrarLancamentos()
*/
public class Conta extends ContaCorrente{
    
    private int numero;
    private String nome;
    private  int saldoAtual;
    
    public Conta(int numero, String nome, int saldoAtual) {
        this.numero = numero;
        this.nome = nome;
        this.saldoAtual = saldoAtual;
    }
    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public void deposito(int valor){
        this.saldoAtual += valor;
        System.out.println("Saldo atual: "+getSaldoAtual());
    }
    public void saque(int valor){
        this.saldoAtual -= valor;
        System.out.println("Saldo atual: "+getSaldoAtual());
    }
    public void transferencia(Conta c, int valor) throws SaldoException, ContaInexistenteException{
        if(verificarConta(c.getNome())== false){
            throw new ContaInexistenteException();
        }else if(getSaldoAtual()<valor){
            throw new SaldoException();
        }else{
           ContaCorrente c3 = new ContaCorrente(c, valor);
           this.saldoAtual -= valor;
            
        }
        
    }
    public void mostrarLancamentos(){
        for(int i=0; i<acc.size();i++){
            System.out.println("Dados dos lançamentos: ");
            System.out.println("Nome: "+acc.get(i).getNome());
            System.out.println("Numero da conta: "+acc.get(i).getNumero());
            System.out.println("Transação: "+mov.get(i).getTran());
            System.out.println("Tipo de transacao: "+mov.get(i).getTipo());
        }
    }
}