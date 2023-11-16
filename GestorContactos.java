import java.util.ArrayList;
import java.util.Scanner;

class Contacto {
    String nombre;
    String telefono;
    String correo;

    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono + ", Correo: " + correo;
    }
}

public class GestorContactos {
    public static void main(String[] args) {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar contactos");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer un entero

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número de teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el correo electrónico: ");
                    String correo = scanner.nextLine();

                    Contacto nuevoContacto = new Contacto(nombre, telefono, correo);
                    listaContactos.add(nuevoContacto);

                    System.out.println("Contacto agregado.\n");
                    break;

                case 2:
                    System.out.println("Lista de contactos:");
                    for (Contacto contacto : listaContactos) {
                        System.out.println(contacto);
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Gracias!");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.\n");
                    break;
            }
        }
    }
}
