package a_Encapsulacion_1.src;
public class cuentaBancaria {

    private String titular;
    private double saldo;

    public cuentaBancaria(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public String gettitular() {
        return titular;

    }

    public double getsaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("El valor no puede ser cero o negativo");
        } else {
            saldo += valor;
        }
    }

    public void retirar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else if (valor <= 0) {
            System.out.println("El valor no puede ser cero o negativo");
        } else {
            saldo -= valor;
        }
    }

}
