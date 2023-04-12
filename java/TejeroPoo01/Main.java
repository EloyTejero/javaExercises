
import java.util.Scanner;

public class Main {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String [] args){
        
        int cantUsers;
        System.out.print("Ingrese la cantidad de usuarios: ");
        cantUsers = in.nextInt();
        in.nextLine();
        
        Persona usuarios[] = new Persona[cantUsers];
        
        cargarDatos(usuarios);
        
        listarMayoresEdad(usuarios);
        
        listarJubilados(usuarios);
        
        listarVivenCaba(usuarios);
        
    }
    
    public static void cargarDatos(Persona p[]){
        for (int i = 0; i < p.length; i++) {
            String nombre, calle, pisoDto, localidad;
            int edad, dni, altura;
            Direccion d;
            
            System.out.print("Ingrse nombre: ");
            nombre = in.nextLine();
            System.out.print("Ingrese edad: ");
            edad = in.nextInt();
            in.nextLine();
            System.out.print("Ingrese dni: ");
            dni = in.nextInt();
            in.nextLine();
            System.out.print("Ingrese localidad: ");
            localidad = in.nextLine();
            System.out.print("Ingrese calle: ");
            calle = in.nextLine();
            System.out.print("Ingrese altura: ");
            altura = in.nextInt();
            in.nextLine();
            System.out.print("Ingrese el piso: ");
            pisoDto = in.nextLine();
            
            d = new Direccion(calle, altura, pisoDto, localidad);
            
            p[i] = new Persona(nombre, edad, dni, d);
        }
    }
    
    
    public static void listarMayoresEdad(Persona p[]){
        System.out.println("Los mayores de edad: ");
        for(Persona i:p){
            if(i.mayorEdad()){
                System.out.println(i.getNombre());
            }
        }
    }
    
    public static void listarJubilados(Persona p[]){
        System.out.println("Las personas en edad jubilatoria: ");
        for(Persona i:p){
            if(i.edadJubilatoria()){
                System.out.println(i.getNombre());
            }
        }
    }
    
    public static void listarVivenCaba(Persona p[]){
        System.out.println("Las personas que viven en caba: ");
        for(Persona i:p){
            if(i.vivenCaba()){
                System.out.println(i.getNombre()+" DNI:"+i.getDni());
            }
        }
    }
}
