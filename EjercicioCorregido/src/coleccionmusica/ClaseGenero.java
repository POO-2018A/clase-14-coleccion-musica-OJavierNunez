package coleccionmusica;

public class ClaseGenero {
    private String nombre;

    public ClaseGenero(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public String toString (){
        return this.nombre;
    }
    
    
} 
