public class Direccion {
    private String calle;
    private int numero;
    private String pisoDto;
    private String localidad;

    public Direccion(String calle, int numero, String pisoDto, String localidad) {
        this.calle = calle;
        this.numero = numero;
        this.pisoDto = pisoDto;
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPisoDto() {
        return pisoDto;
    }

    public void setPisoDto(String pisoDto) {
        this.pisoDto = pisoDto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "calle=" + calle + ", numero=" + numero + ", pisoDto=" + pisoDto + ", localidad=" + localidad + '}';
    }
    
    
}
