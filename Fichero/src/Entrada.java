import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) throws IOException {
        // FILE -> fichero logico -> fisico
        // fichero logico
        // File ficheroSinPuntero = new File("/Users/borja/Documents/GitHub/ClaseAD-UNIR/T1/Fichero/src/resources/directorio/ejemplo_fichero.md");
        File ficheroSinPuntero = new File("src/resources/directorio");
        System.out.println(ficheroSinPuntero.getName());
        System.out.println(ficheroSinPuntero.getParent());
        System.out.println(ficheroSinPuntero.length());
        System.out.println(ficheroSinPuntero.exists());
        System.out.println(ficheroSinPuntero.isDirectory());
        // File[] -> todos los FICHEROS que estan dentro del directorio
        ficheroSinPuntero.listFiles();
        // String[] -> todas las rutas de los FICHEROS que estan dentro del directorio
        ficheroSinPuntero.list();

        // 1 -> Obtener todos los nombre de los ficheros del directorio llamado directorio

        System.out.println("Nombre de los ficheros:");
        File[] ficheros = ficheroSinPuntero.listFiles();
        for (File fichero : ficheros) {
            System.out.println(fichero.getName());
        }

        // 2 -> Crear una subcarpeta en el directorio llamado directorio y crear en ella un fichero
        File subcarpeta = new File("src/resources/directorio/subcarpeta");
        if(!subcarpeta.exists()) {
            subcarpeta.mkdir();
            System.out.println("La carpeta ha sido creada");
        } else {
                System.out.println("La carpeta ya existe");
            }

        File fichero = new File("src/resources/directorio/subcarpeta/fichero");

        if(!fichero.exists()){
            fichero.createNewFile();
            System.out.println("El fichero ha sido creado");
        }else {
            System.out.println("El fichero ya existe");
        }

        //   -> Obtener todos los nombre de los ficheros del directorio llamado directorio y el subdirectorio creado
        File[] ficheros2 = subcarpeta.listFiles();
        for (File fichero2 : ficheros2){
            System.out.println(fichero2.getName());
        }
        // 3 -> Listar el nombre de todos los ficheros del SISTEMA ( C:/User o /Users )
        System.out.println("Los ficheros del sistema son:");
        File ficheroC = new File("C:\\Users");
        File[] ficheros3 = ficheroC.listFiles();
        for (File fichero3 : ficheros3 ){
            System.out.println(fichero3.getName());
        }

        // RECURSIVIDAD


        /*if (!ficheroSinPuntero.exists()) {
            try {
                ficheroSinPuntero.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo en la creacion del fichero");
            }
        }*/
    }
    }

