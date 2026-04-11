package c_herencia_3.src;
public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 1500000.0, "Tecnologia");
        Desarrollador dev = new Desarrollador("Jose", 350000.0, "Java");

        gerente.mostrarInformacion();
        gerente.mostrarArea();
        System.out.println("-----");
        dev.mostrarInformacion();
        dev.mostrarLenguaje();
    }

}
