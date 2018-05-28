package coleccionmusica;

import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("********* Ejercicio Colección de Musica *************\n");
        int opcion =1;
        do{
            System.out.println("************* Informacion Artista ***************");
            Scanner escaner= new Scanner(System.in);
            System.out.println(" Nombre: ");
            String nombre = escaner.nextLine();
            System.out.println(" Pais de origen: ");
            String pais = escaner.nextLine();
            System.out.println(" Fecha de nacimiento:\n \tAño: ");
            int año = sc.nextInt();
            System.out.println("\tMes: ");
            int mes = sc.nextInt();
            System.out.println("\tDia: ");
            int dia = sc.nextInt(); 
            ClaseArtista artistas = new ClaseArtista(nombre,año, mes, dia, pais);
/*
            if (artistas.equals(artistas)){
            System.out.println("*****Artista ya ingresado***");
            }else{
            System.out.println("*****Datos ingresados correctos");
            }
*/
            System.out.print("Cuantos Albumes tiene el artista: ");
            int numAlbum = sc.nextInt();
            ClaseAlbum [] albumes = new ClaseAlbum [numAlbum];
            for (int i=0; i< albumes.length; i++){
                System.out.println("\n######### Album "+(i+1)+" #########");
                Scanner entrada= new Scanner(System.in);
                System.out.println(" Nombre del Album: ");
                String nomb = entrada.nextLine();
                System.out.println(" Genero: ");
                String genero = entrada.nextLine();
                System.out.println(" Año de lanzamiento: ");
                int añoLan = sc.nextInt();
                System.out.println(" Numero de canciones: ");
                int num = sc.nextInt();
                albumes [i] = new ClaseAlbum (nomb, genero, añoLan, num); 
                String [] canciones = new String [num];
                    for (int j=0; j < num; j++){
                        canciones [j] = sc.nextLine();
                        System.out.println(" Canción Nº"+(j)+" :");
                    }   
            }
                System.out.println("\nSeleccione una opcion: \n                1.- Nuevo Artista      2.- Ver Informacion Ingresada  ");
                opcion = sc.nextInt();
                if (opcion== 2){
                    System.out.println("********** Artista '"+artistas+"' **********");
                    System.out.println(" Fecha de nacimiento: "+artistas.getFechaNacimiento());
                    System.out.println(" Pais de origen: "+artistas.getPais());
                    for (int i=0; i< albumes.length; i++){
                        System.out.println("********** Album  '"+albumes[i]+"' **********");
                        System.out.println("Genero: "+albumes[i].getGenero());
                        System.out.println("Numero de canciones: "+albumes[i].getNumCanciones()); 
                    }
                System.out.println("\n Presiona:     1.- Continuar (Nuevo Artista)    2.- Salir "); 
                opcion = sc.nextInt();
                }
     
        }while (opcion == 1);
            
    }
                             
}
        
    
        
        
