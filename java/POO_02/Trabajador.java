/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_02;

/**
 *
 * @author ET36
 */
public class Trabajador {
    private String nombre;
    private int cuit;
    private char genero;
    private String direccion;
    private int telefono;
    private int cantHijos;
    private Sueldo sueldo;

    public Trabajador(String nombre, int cuit, char genero, String direccion, int telefono, int cantHijos, Sueldo sueldo) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantHijos = cantHijos;
        this.sueldo = sueldo;
    }
    
    
}
