package ejercicioprepruebamartelli;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class EjercicioPrePruebaMartelli {
    
    public static void cargarDatos(String nombres[], String localidades[], int edades[]){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<(nombres.length);i++){
            System.out.print("Ingrese el nombre del alumno "+(i+1)+": ");
            nombres[i]=in.nextLine();
            System.out.print("Ingrese la localidad del alumno "+(i+1)+": ");
            localidades[i]=in.nextLine();
            System.out.print("Ingrese la edad del alumno "+(i+1)+": ");
            edades[i]=in.nextInt();
            in.nextLine();
        }
    }
    
    public static int mayoresEdad(int arrayEdad[]){
        int mayores=0;
        for(int i:arrayEdad){
            if(i>18){
                mayores++;
            }
        }
        return mayores;
    }
    
    public static String[] vivenCaba(String nombres[], String localidades[]){
        String nombresCaba[];
        int contador=0;
        for(String i:localidades){
            if(i.equals("caba")){
                contador++;
            }
        }
        
        nombresCaba = new String [contador];
        
        for(int i=0;i<nombresCaba.length;i++){
            if(localidades[i].equals("caba")){
                nombresCaba[i]=nombres[i];
            }
        }
        
        return nombresCaba;
    }
    
    public static String listaStrToStr(String lista[]){
        String str ="";
        String delimiter = "";
        
        for(String i:lista){
            str+= delimiter+i;
            delimiter = ",";
        }
        return str;
    }
    
    public static void main(String[] args) {
        String nombres[] = new String [2];
        String localidades[] = new String [2];
        int edades[] = new int[2];
        
        cargarDatos(nombres, localidades, edades);
        System.out.println("El numero de mayores es: "+mayoresEdad(edades));
        System.out.println("Las personas que viven en caba son: "+listaStrToStr(vivenCaba(nombres, localidades)));
    }
    
}
