package coleccionmusica;

import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int opcion;
        int contadorGeneros=0, contadorAlbumes=0;
        ClaseGenero ListaGeneros [] = new ClaseGenero [3];
        ClaseAlbum ListaAlbumes [] = new ClaseAlbum [4];
        
        do{
            System.out.println("*************Administracion musica***************");
            System.out.println("1.- Ingresar artista ");
            System.out.println("2.- Ingresar album ");
            System.out.println("3.- Ingresar genero ");
            System.out.println("4.- Imprimir artistas ");
            System.out.println("5.- Salir ");
            System.out.println("Ingrese la opcion que desea: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del artista: ");
                    sc.nextLine();
                    String nombreArtista = sc.nextLine();
                    
                    System.out.println("Ingrese el pais: ");
                    String pais = sc.nextLine();
                    
                    System.out.println("Seleccione todos los albums que pertenecen al artista: (separado por comas) ");
                    for (int i=0; i< ListaAlbumes.length; i++){
                        if (ListaAlbumes [i] != null){
                            System.out.println((i+1)+ ". "+ ListaAlbumes[i].getNombre());
                        }
                    }
                    String albumesArtistaTmp = sc.nextLine();  
                    String [] idAlbumesArtista = albumesArtistaTmp.split(",");   //estamos separando el String y los vamos a separar cada vez q encuentre la condicion 
                    
                    ClaseAlbum [] albumesArtista = new ClaseAlbum [idAlbumesArtista.length];
                    for(int i=0; i< idAlbumesArtista.length;i++){
                        albumesArtista [i]= ListaAlbumes[Integer.valueOf(idAlbumesArtista[i])];
                    }
                    //ClaseArtista artista = new ClaseArtista ();
                    System.out.println("");
                    
                    break;
                case 2:
                    if (contadorGeneros ==0){
                        System.out.println("No ha ingresado ningun genero. ");
                        System.out.println(" ");
                        break;
                    }
                    System.out.println("Ingrese el nombre del album: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el año de creacion: ");
                    int anio = sc.nextInt();
                    System.out.println("Ingrese numero de canciones: ");
                    int numCanciones = sc.nextInt();
                    for (int i=0; i< ListaGeneros.length; i++){
                        if (ListaGeneros [i]!= null){
                        System.out.println((i+1) + ". " + ListaGeneros[i]);
                        }
                    }
                    System.out.println("Seleccione el genero a que pertenece: ");
                    int opcionGenero =sc.nextInt();
                    ClaseGenero generoSeleccionado = ListaGeneros [opcionGenero-1];
                    
                    ClaseAlbum album = new ClaseAlbum (nombre, generoSeleccionado,anio, numCanciones);
                    
                    System.out.println("Se ha ingresado el siguiente album: ");
                    System.out.println(album);
                    System.out.println("");
                    
                    ListaAlbumes[contadorAlbumes]=album;
                    contadorAlbumes++;
                    break;
                case 3:
                    if (contadorGeneros == 3){
                        System.out.println("La lista de generos esta llena ");
                        break;
                    }
                    System.out.println("Ingrese el nombre del genero ");
                    sc.nextLine();
                    String nombreGenero = sc.nextLine();
                    
                    ClaseGenero genero = new ClaseGenero (nombreGenero);
                    
                    ListaGeneros [contadorGeneros]=genero;
                    contadorGeneros++;
                    
                    /*
                    ListaGeneros = new ClaseGenero [contadorGeneros];
                    
                    for (int i =0; i< ListaGeneros.length; i++){
                        ListaGeneros [contadorGeneros-1]= genero;
                        System.out.println("Genero " + (i+1)+": "+ListaGeneros[i].getNombre());
                    }
                    */
                    break;
                case 4:
                    System.out.println("Esta es la lista de artistas: ");
                    break;
                case 5:
                    System.out.println("Adios ");
                    break;
                default:
                    System.out.println("Opcion no valida ");
                    break;
            } 
            
        }while (opcion != 5);
        
        
        
        /*
        
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

            if (artistas.equals(artistas)){
            System.out.println("*****Artista ya ingresado***");
            }else{
            System.out.println("*****Datos ingresados correctos");
            }

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
        
        
        */
            
    }
                             
}
        
    
        
        
