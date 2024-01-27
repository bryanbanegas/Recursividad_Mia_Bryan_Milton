

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author adalb
 */
public class hgjjbjbjb {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar Producto: ");
        String producto=leer.next();
        System.out.println("Ingresar Cantidad: ");
        int cantidad=leer.nextInt();
        System.out.println("Precio Unitario: L.");
        double precio=leer.nextDouble();
        double subtotal=cantidad*precio;
        System.out.println("Producto: "+producto);
        
        System.out.println("Subtotal: L."+subtotal);
    }
}
