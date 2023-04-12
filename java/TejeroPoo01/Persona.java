public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private Direccion direccion;

    public Persona(String nombre, int edad, int dni, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
    }
    
    public boolean mayorEdad(){
        return edad>18;
    }
    
    public boolean edadJubilatoria(){
        return edad>=65;
    }
    
    public boolean vivenCaba(){
        return direccion.getLocalidad().equalsIgnoreCase("caba");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", direccion=" + direccion.toString();
    }
    
    
}
