/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopatrones0705;

/**
 *
 * @author lvved
 */
public class CredencialEvento implements Cloneable{
    private String nombre;
    private String cargo;
    private String rut;

    public CredencialEvento(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    @Override
    public CredencialEvento clone() {
        return new CredencialEvento(this.nombre, this.cargo, this.rut);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cargo: " + cargo + ", RUT: " + rut;
    }
}

