
package Persona;
/**
 *
 * @author mco_a
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private String dni;
    private String direccion;
    
    public Persona(){
      this.nombres="Pedro";
      this.apellidos="Cerquera";
      this.edad=23;
      this.dni="74564804";
      this.direccion="Lima, Calle M";
    }
    public Persona(String nombres, String apellidos, String dni, 
            int edad, String direccion){
  
          this.nombres=nombres;
          this.apellidos=apellidos;
          this.edad=edad;
          this.dni=dni;
          this.direccion=direccion;
    }
    public String getNombres(){
    
        return nombres;
    }
    public String getApellidos(){
    
        return apellidos;
    }
    public int getEdad(){
    
        return edad;
    }
    public String getDNI(){
    
        return dni;
    }
    public String getDireccion(){
    
        return direccion;
    }
                    
}
