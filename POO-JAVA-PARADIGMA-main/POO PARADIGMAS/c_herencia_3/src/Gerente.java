package c_herencia_3.src;
public class Gerente extends Empleado {

    private String Area;

    public Gerente(String Nombre, double Salario, String Area) {
        super(Nombre, Salario);
        this.Area = Area;
    }

    public void mostrarArea() {
        System.out.println("El area es: " + Area);

    }

}
