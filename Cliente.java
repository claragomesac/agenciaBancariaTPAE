/**
 * Classe que representa um cliente da agência bancária.
 */
public class Cliente extends Pessoa {
    private int numeroConta;
    private int tempoChegada;
    private int duracaoAtendimento;

    /**
     * Construtor da classe Cliente.
     * @param nome O nome do cliente.
     * @param numeroConta O número da conta do cliente.
     * @param tempoChegada O tempo em que o cliente chegou na agência.
     * @param duracaoAtendimento A duração estimada do atendimento do cliente.
     */
    public Cliente(String nome, int numeroConta, int tempoChegada, int duracaoAtendimento) {
        super(nome);
        this.numeroConta = numeroConta;
        this.tempoChegada = tempoChegada;
        this.duracaoAtendimento = duracaoAtendimento;
    }

    /**
     * Obtém o número da conta do cliente.
     * @return O número da conta do cliente.
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Obtém o tempo em que o cliente chegou na agência.
     * @return O tempo de chegada do cliente.
     */
    public int getTempoChegada() {
        return tempoChegada;
    }

    /**
     * Obtém a duração estimada do atendimento do cliente.
     * @return A duração do atendimento do cliente.
     */
    public int getDuracaoAtendimento() {
        return duracaoAtendimento;
    }
}
