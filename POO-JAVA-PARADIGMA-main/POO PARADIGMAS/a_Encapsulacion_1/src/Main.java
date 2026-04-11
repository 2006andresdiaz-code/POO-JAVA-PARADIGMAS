package a_Encapsulacion_1.src;
public class Main {

    public static void main(String[] args) {
        
        cuentaBancaria cuenta = new cuentaBancaria("Laura", 500000.0);
    

    System.out.println("Titular: "+ cuenta.gettitular());
    System.out.println("Saldo: " + cuenta.getsaldo());


    
    cuenta.depositar(120000.0);
    cuenta.retirar(80000.0);


    System.out.println("El saldo es de: $"+ cuenta.getsaldo());


    }
}
