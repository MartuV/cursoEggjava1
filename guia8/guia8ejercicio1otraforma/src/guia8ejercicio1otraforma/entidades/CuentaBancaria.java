package guia8ejercicio1otraforma.entidades;
/**
 *
 * @author MartuV
 */
public class CuentaBancaria {
    
    int numeroCuenta;
    long dniCliente;
   private double saldo;
    public CuentaBancaria() {
    }
    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
       this.dniCliente = dniCliente;
        this.saldo = saldo;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public long getDniCliente() {
        return dniCliente;
    }
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldo=" + saldo + '}';
    }


}
