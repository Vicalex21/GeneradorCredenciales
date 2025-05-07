/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopatrones0705;

import java.util.ArrayList;

/**
 *
 * @author lvved
 */
public class GestorCredenciales {
    
   private ArrayList<CredencialEvento> credenciales = new ArrayList<>();

    public void agregarCredencial(CredencialEvento credencial) {
        credenciales.add(credencial.clone());
    }

    public void mostrarCredenciales() {
        System.out.println("\033[1;34m\nLista de Credenciales:\033[0m"); // Azul
        System.out.println("===========================================");
        if (credenciales.isEmpty()) {
            System.out.println("\033[1;31mNo hay credenciales registradas aún.\033[0m"); // Rojo
        } else {
            for (CredencialEvento c : credenciales) {
                System.out.println(c);
            }
        }
        System.out.println("===========================================\n");
    }
  
}
