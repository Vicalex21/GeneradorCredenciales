/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopatrones0705;

/**
 *
 * @author lvved
 */
public class ConfiguracionEvento {
    
    private static ConfiguracionEvento instancia;
    private String nombreEvento;

    private ConfiguracionEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public static ConfiguracionEvento getInstance(String nombreEvento) {
        if (instancia == null) {
            instancia = new ConfiguracionEvento(nombreEvento);
        }
        return instancia;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }


}
