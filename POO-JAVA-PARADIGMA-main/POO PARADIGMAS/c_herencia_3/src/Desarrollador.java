package c_herencia_3.src;
public class Desarrollador extends Empleado {

    private String Lenguaje;

    public Desarrollador(String Nombre, double Salario, String Lenguaje){
        super(Nombre, Salario);
        this.Lenguaje = Lenguaje;
    }

    public void mostrarLenguaje(){
        System.out.println("El lenguaje es: "+ Lenguaje);
    }
    
}
