/*
    A classe Compromisso é composta do assunto, horário de
    início e duração.
    • Para facilitar, use tanto o horário quando a duração com
    valores inteiros.
    • Os métodos de Compromisso são:
    public Compromisso(String assunto, int horario,
    int duracao);
    public String getAssunto();
    public int getHorario();
    public int getDuracao();
*/
public class Compromisso {
    private String assunto;
    private int horarioIn;
    private int duracao;
    public Compromisso(String assunto, int horarioIn, int duracao) {
        this.assunto = assunto;
        this.horarioIn = horarioIn;
        this.duracao = duracao;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public int getHorarioIn() {
        return horarioIn;
    }
    public void setHorarioIn(int horarioIn) {
        this.horarioIn = horarioIn;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
}