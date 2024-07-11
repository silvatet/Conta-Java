public abstract class conta {
    private double saldo;
    private int numeroConta;

    public conta(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(conta destino, double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public int getNumeroConta() {
        return numeroConta;