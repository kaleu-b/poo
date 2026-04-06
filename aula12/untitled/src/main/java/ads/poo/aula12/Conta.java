package ads.poo.aula12;

public
class Conta {
    private
    final String NOME;
    private
    final String NUM_CON;
    private
    double saldo;

    public
    Conta(String NOME, String NUM_CON, double saldo) {
        this.NOME = NOME;
        this.NUM_CON = NUM_CON;
        this.saldo = (saldo < 0) ? 0 : saldo;
    }

    public
    String getNOME() { return NOME; }

    public
    String getNUM_CON() { return NUM_CON; }

    public
    double getSaldo() { return saldo; }

    public
    void depositar(double valor) { this.saldo += (valor < 0) ? 0 : valor; }

    public
    void sacar(double valor) { this.saldo -= (valor > saldo) ? 0 : valor; }

    @Override public String toString() {
        return String.format("Saldo: R$ %.2f\nNúmero da conta: %s\nNome do titular: %s", saldo, NUM_CON, NOME);
    }
}
