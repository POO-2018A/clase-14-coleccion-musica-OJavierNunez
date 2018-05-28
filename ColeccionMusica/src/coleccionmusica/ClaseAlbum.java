package coleccionmusica;


public class ClaseAlbum {
    private String nombre;
    private String genero;
    private int añoLanzamiento;
    private int numCanciones;
    
    public ClaseAlbum(String nombre, String genero, int año, int num){
        this.nombre=nombre;
        this.genero=genero;
        añoLanzamiento=año;
        numCanciones=num; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    
    public String toString (){
        return this.nombre;
    }
    
}