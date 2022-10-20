import java.util.ArrayList;

/*
    Na classe Conta são armazenados os seguintes dados:
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
public class Conta {
    private int numero;
    private String nome;
    private int saldoAtual;
    private ArrayList<Transacao> t = new ArrayList<>();
    protected Conta(int numero, String nome, int saldoAtual) {
        this.numero = numero;
        this.nome = nome;
        this.saldoAtual = saldoAtual;
    }
    public Conta() {
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
    public ArrayList<Transacao> getT() {
        return t;
    }
    public void setT(ArrayList<Transacao> t) {
        this.t = t;
    }
    public void deposito(int valor){
        saldoAtual += valor;
        t.add(new Transacao(valor, 1));
        System.out.println("Deposito realizado com sucesso.");
    }
    public void deposito(int valor, int key){
        saldoAtual += valor;
        t.add(new Transacao(valor, 3));
        System.out.println("Transferencia recebida realizado com sucesso.");
    }
    public void saque(int valor) throws SaldoException{
        if(valor>saldoAtual){
            throw new SaldoException("Saldo insuficiente.");
        }else{
            saldoAtual -= valor;
            t.add(new Transacao(valor, 2));
            System.out.println("Saque realizado com sucesso.");
        }
    }
    public void saque(int valor, int key) throws SaldoException{
        if(valor>saldoAtual){
            throw new SaldoException("Saldo insuficiente.");
        }else{
            saldoAtual -= valor;
            t.add(new Transacao(valor, 3));
            System.out.println("Transferencia recebida com sucesso.");
        }
    }
    protected void imprimir(){
        System.out.println("Dados da conta: ");
        System.out.println("Nome: "+getNome());
        System.out.println("Numero: "+getNumero());
        System.out.println("Saldo: "+getSaldoAtual());
        System.out.println("Transações: ");
        for(int i=0; i<t.size(); i++){
            System.out.print("Valor: "+t.get(i).getValor());
            System.out.println("-Tipo da transação: "+t.get(i).getTipo());
        }
    }
}