public class CuentaConComision extends Cuenta {
    public CuentaConComision(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (!Double.isFinite(monto) || monto <= 0 || monto + 5 > getSaldo()) {
            throw new SaldoInsuficienteException();
        }
        super.retirar(monto + 5);
    }
}