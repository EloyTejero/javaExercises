/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_02;

/**
 *
 * @author ET36
 */
public class Sueldo {
    private double obraSocial;
    private double jubilacion;
    private double presentismo;
    private AsignacionFamiliar asignacionFamiliar;
    private String cargo;
    private char genero;

    public Sueldo(AsignacionFamiliar asignacionFamiliar, String cargo, char genero) {
        this.obraSocial = obraSocial; // poner valores
        this.jubilacion = jubilacion; // poner valores
        this.presentismo = presentismo; // poner valores
        this.asignacionFamiliar = asignacionFamiliar;
        this.cargo = cargo;
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return "Sueldo{" + "obraSocial=" + obraSocial + ", jubilacion=" + jubilacion + ", presentismo=" + presentismo + ", asignacionFamiliar=" + asignacionFamiliar.valorAsignacion()+ ", cargo=" + cargo + ", genero=" + genero + '}';
    }
    
    public double calcularSueldoNeto(){
        return 0; // completar
    }
    
    public double sueldoBasico(){
        switch(cargo.toLowerCase()){
            case "panadero": return 98000; 
            case "repostero": return 110000;
            case "vendedor": return 70000;
            default: return 0;
        }
    }
    
    
}
