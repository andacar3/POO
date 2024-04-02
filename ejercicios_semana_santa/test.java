package ejercicios_semana_santa;

import java.util.Scanner;

public class test {
    
    public static Scanner tec = new Scanner(System.in);
    
    public static int validar(int dia) {
        while (dia < 1 || dia > 31) {
            System.out.println("Día inválido. Por favor, ingrese un día entre 1 y 31:");
            dia = tec.nextInt();
        }
        return dia;
    }
    
    public static boolean verificar(int codigoProducto) {
        return (codigoProducto >= 1000 && codigoProducto <= 9999) && ((codigoProducto / 1000) % 2 != 0);
    }
    
    public static float descuentoPromo(int codigoProducto, float valor, int dia) {
        int ultimosDosDigitos = codigoProducto % 100;
        if (ultimosDosDigitos == dia) {
            return valor * 0.9f; 
        }
        return valor; 
    }
    
    public static float leerProductos(int cantidadProductos, int dia) {
        float total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese el código del producto:");
            int codigo = tec.nextInt();
            while (!verificar(codigo)) {
                System.out.println("Código inválido. Ingrese un código de 4 dígitos que comience con un número impar:");
                codigo = tec.nextInt();
            }
            System.out.println("Ingrese el valor del producto:");
            float valor = tec.nextFloat();
            total += descuentoPromo(codigo, valor, dia);
        }
        return total;
    }
    
    public static int cedulaGanadora(int numeroDocumento, int dia) {
        int suma = 0;
        while (numeroDocumento > 0) {
            suma += numeroDocumento % 10;
            numeroDocumento /= 10;
        }
        return suma == dia ? 1 : 0;
    }
    
    public static void main(String[] args) {
        System.out.println("Ingrese el día del mes:");
        int dia = tec.nextInt();
        dia = validar(dia);
        
        float totalRecaudado = 0;
        float mayorCompra = 0;
        String clienteMayorCompra = "";
        
        while (true) {
            System.out.println("Ingrese el número de documento del cliente (0 para terminar):");
            int documento = tec.nextInt();
            if (documento == 0) break;
            
            System.out.println("Ingrese el primer nombre del cliente:");
            String nombre = tec.next();
            
            System.out.println("Ingrese la cantidad de productos:");
            int cantidadProductos = tec.nextInt();
            
            float totalCliente = leerProductos(cantidadProductos, dia);
            
            if (cedulaGanadora(documento, dia) == 1) {
                System.out.println("¡Felicidades! Ha recibido un descuento del 100%.");
                totalCliente = 0;
            }
            
            System.out.println("El total a pagar es: " + totalCliente);
            
            if (totalCliente > mayorCompra) {
                mayorCompra = totalCliente;
                clienteMayorCompra = nombre;
            }
            
            totalRecaudado += totalCliente;
        }
        
        System.out.println("Total recaudado por ventas: " + totalRecaudado);
        System.out.println("El cliente con mayor valor de compra fue: " + clienteMayorCompra + " con un total de: " + mayorCompra);
    }
}