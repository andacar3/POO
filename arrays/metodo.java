package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class metodo {
    long cedula = 0;
    String nombre;
    String email;
    public metodo(long cedula, String nombre, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        
    }

    @Override
    public String toString(){
        return "cedula: "+cedula+" nombre: "+nombre+" email: "+email;

    }
} 




