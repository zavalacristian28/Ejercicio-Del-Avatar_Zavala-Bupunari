package org.example;
import java.io.*;
import java.util.*;
public class ArchivoPersonajes {
    public static void guardarPersonajesEnArchivoTXT(ArrayList<Personaje> personajes){
        try{
            File archivo= new File("Personajes.txt");
            //esto era para encontrar la ruta del archivo
            //System.out.println(archivo.getAbsolutePath());
            FileWriter fw= new FileWriter(archivo);
            for(Personaje p: personajes){
                fw.write(p.guardar()+"\n");
            }
            fw.close();
            System.out.println("Guardado");
        }catch(IOException e){
            System.out.println("Error al guardar el personaje");

        }
    }

    public static void cargarArchivo(ArrayList<Personaje>personajes){
        try{
            BufferedReader bf= new BufferedReader(new FileReader("Personajes.txt"));
            String linea;
            while((linea=bf.readLine())!=null){
                String[] datosArchivo=linea.split(",");
                String tipo = datosArchivo[0];

            switch(tipo){

                case "GUERRERO":

                    Guerrero g = new Guerrero(
                            datosArchivo[1],
                            datosArchivo[2],
                            datosArchivo[3],
                            Integer.parseInt(datosArchivo[4]),
                            Boolean.parseBoolean(datosArchivo[5]),
                            Integer.parseInt(datosArchivo[6]),
                            Integer.parseInt(datosArchivo[7]),
                            datosArchivo[8]
                    );

                    personajes.add(g);
                     System.out.println("Personaje cargado: "+ g);
                    break;

                case "MAESTRO_FUEGO":

                    MaestroFuego mf =
                            new MaestroFuego(
                                    datosArchivo[1],
                            datosArchivo[2],
                            datosArchivo[3],
                            Integer.parseInt(datosArchivo[4]),
                            Boolean.parseBoolean(datosArchivo[5]),
                            Integer.parseInt(datosArchivo[6]),
                            Integer.parseInt(datosArchivo[7]),
                            Integer.parseInt(datosArchivo[8])
                            );

                    personajes.add(mf);
                     System.out.println("Personaje cargado: "+ mf);
                    break;

                    case "MAESTRO_AGUA":

                    MaestroAgua ma =
                            new MaestroAgua(
                                    datosArchivo[1],
                            datosArchivo[2],
                            datosArchivo[3],
                            Integer.parseInt(datosArchivo[4]),
                            Boolean.parseBoolean(datosArchivo[5]),
                            Integer.parseInt(datosArchivo[6]),
                            Integer.parseInt(datosArchivo[7]),
                            Integer.parseInt(datosArchivo[8])
                            );

                    personajes.add(ma);
                     System.out.println("Personaje cargado: "+ ma);
                    break;

                    case "MAESTRO_AIRE":

                    MaestroAire mair =
                            new MaestroAire(
                                    datosArchivo[1],
                            datosArchivo[2],
                            datosArchivo[3],
                            Integer.parseInt(datosArchivo[4]),
                            Boolean.parseBoolean(datosArchivo[5]),
                            Integer.parseInt(datosArchivo[6]),
                            Integer.parseInt(datosArchivo[7]),
                            Integer.parseInt(datosArchivo[8])
                            );

                    personajes.add(mair);
                     System.out.println("Personaje cargado: "+ mair);
                    break;

                    case "MAESTRO_TIERRA":

                    MaestroTierra mt =
                            new MaestroTierra(
                                    datosArchivo[1],
                            datosArchivo[2],
                            datosArchivo[3],
                            Integer.parseInt(datosArchivo[4]),
                            Boolean.parseBoolean(datosArchivo[5]),
                            Integer.parseInt(datosArchivo[6]),
                            Integer.parseInt(datosArchivo[7]),
                            Integer.parseInt(datosArchivo[8])
                            );

                    personajes.add(mt);
                    System.out.println("Personaje cargado: "+ mt);

                    break;
            }

        }
            
        bf.close();
    }catch(IOException e){
        System.out.println("Error al cargar el archivo");
    }
}
}
