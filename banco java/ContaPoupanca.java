public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int numeroConta, double taxaJuros) {
        super(numeroConta);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void calcularJuros() {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.taxaJuros));
    }
}