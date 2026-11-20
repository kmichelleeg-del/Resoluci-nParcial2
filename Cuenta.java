public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (!Double.isFinite(monto) || monto <= 0 || monto > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}