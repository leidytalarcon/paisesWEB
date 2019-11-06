package clases;


public class Herencia {
    
    private String nombre;
    private String gentilicio;
    private String moneda;
    private int cant;
    private String idioma;
    private String capital;

    public Herencia() {
    }

    public Herencia(String nombre, String gentilicio, String moneda, int cant, String idioma, String capital) {
        this.nombre = nombre;
        this.gentilicio = gentilicio;
        this.moneda = moneda;
        this.cant=cant;
        this.idioma = idioma;
        this.capital = capital;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getCapital() {
        return capital;
    }
    
    public String toString(){
        return("Nombre: "+nombre+" Gentilico: "+gentilicio+" Moneda: "+moneda+" Cantidad: "+cant+" Idioma: "+idioma+" Capital: "+capital);
    }
}
