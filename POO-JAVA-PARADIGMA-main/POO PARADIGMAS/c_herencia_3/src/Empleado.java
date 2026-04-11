package c_herencia_3.src;
public class Empleado {

    protected String Nombre;
    protected double Salario;

    public Empleado(String Nombre, double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;

    }

    public void mostrarInformacion() {

        System.out.println("Empleado: " + Nombre);
        System.out.println("Salario: " + Salario);

    }

}