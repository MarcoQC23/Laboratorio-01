
package Persona;

/**
 *
 * @author mco_a
 */
public class MostrarPersona {
    
    public static void main(String[] args){
    
        Persona per1=new Persona();
        System.out.println("Su nombre y apellido es "+per1.getNombres()+" "+
        per1.getApellidos()+" tiene "+per1.getEdad()+", "
        + "identificado con #dni "+per1.getDNI()+ " vive en "
        +per1.getDireccion());
    }
}
