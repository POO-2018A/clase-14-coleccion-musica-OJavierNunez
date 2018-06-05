package coleccionmusica;

import java.util.Date;
import java.util.GregorianCalendar;

public class ClaseArtista {
    
    private String nombre;
    public Date fechaNacimiento;
    private String pais;
    private ClaseAlbum [] albums;
    
    public ClaseArtista (String nombre, int año, int mes, int dia, String pais){
        this.nombre=nombre;
        GregorianCalendar calendario = new GregorianCalendar (año, mes-1, dia);
        fechaNacimiento= calendario.getTime();
        this.pais=pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento(){
        return ""+fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ClaseAlbum[] getAlbums() {
        return albums;
    }

    public void setAlbums(ClaseAlbum[] albums) {
        this.albums = albums;
    }

    @Override                         
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClaseArtista other = (ClaseArtista) obj;           
        if (!this.nombre.equals(other.nombre)
                || !this.pais.equals(other.pais) || !this.fechaNacimiento.equals(other.fechaNacimiento)) {
            
            return false;
        }
        return true;
    }
    
    @Override
    public String toString (){
        return this.nombre;     // Ojo con todos los datos
    }
    
    
    
}
