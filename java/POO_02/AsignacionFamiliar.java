/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_02;

/**
 *
 * @author ET36
 */
class AsignacionFamiliar {
    private int cantHijos;
    private double valorHijos;

    public AsignacionFamiliar(int cantHijos, double valorHijos) {
        this.cantHijos = cantHijos;
        this.valorHijos = valorHijos;
    }
    
    public double valorAsignacion(){
        return cantHijos * valorHijos;
    }
}
