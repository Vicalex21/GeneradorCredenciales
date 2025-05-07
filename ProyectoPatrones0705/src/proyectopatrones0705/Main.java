/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopatrones0705;

import java.util.Scanner;

/**
 *
 * @author lvved
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorCredenciales gestor = new GestorCredenciales();

        System.out.println("\033[1;32m\nBienvenido al Gestor de Credenciales\033[0m"); // Verde
        System.out.println("===========================================");
        System.out.print("Ingrese el nombre del evento: ");
        String nombreEvento = scanner.nextLine();
        ConfiguracionEvento config = ConfiguracionEvento.getInstance(nombreEvento);
        System.out.println("\033[1;33mEvento registrado: " + config.getNombreEvento() + "\033[0m\n"); // Amarillo

        while (true) {
            System.out.println("===========================================");
            System.out.println("\033[1;36mMENU PRINCIPAL\033[0m"); // Cyan
            System.out.println("-------------------------------------------");
            System.out.println("1. Agregar Credencial");
            System.out.println("2. Ver Credenciales");
            System.out.println("3. Salir");
            System.out.println("-------------------------------------------");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n\033[1;35mAgregar nueva credencial:\033[0m"); // Magenta
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("RUT: ");
                    String rut = scanner.nextLine();

                    CredencialEvento credencial = new CredencialEvento(nombre, cargo, rut);
                    gestor.agregarCredencial(credencial);
                    System.out.println("\033[1;32mCredencial agregada exitosamente.\033[0m\n"); // Verde
                    break;

                case 2:
                    gestor.mostrarCredenciales();
                    break;

                case 3:
                    System.out.println("\n\033[1;31mSaliendo del programa. Hasta luego!\033[0m\n"); // Rojo
                    return;

                default:
                    System.out.println("\n\033[1;31mOpcion invalida. Intente nuevamente.\033[0m\n"); // Rojo
            }
        }
    }
}
