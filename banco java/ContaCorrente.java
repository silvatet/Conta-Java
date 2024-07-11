public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, double limiteChequeEspecial) {
        super(numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.getSaldo() + this.limiteChequeEspecial) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}