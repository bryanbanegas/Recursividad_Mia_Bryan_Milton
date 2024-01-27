
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adalb
 */
public class PalindromoAir{
    
    private Ticket[] asientos = new Ticket[30];
    private double total=0.0;
    private String listado="";
    
   //1.X
    private int firstAvailable(int pos){
        if(pos<=29){
            if(asientos[pos]==null){               
                return pos;
            }else{
                return firstAvailable(pos+1);
            }    
        }else{
            return -1;
        }
    }
    public int firstAvailable(){
        return firstAvailable(0);
    }
    
    //2.X
    private int searchPassenger(String nombre, int pos){
        if(pos<=29){
            if(asientos[pos]==null){
                
            }else{
                if(asientos[pos].getNombreP().equals(nombre)){
                return pos;
            }
            }
            return searchPassenger(nombre, pos+1);
        }
        return -1;
    }
    public int searchPassenger(String nombre){
        return searchPassenger(nombre,0);
    }
    
    //3.X
    private static boolean isPalindromo(String palabra,int posInicial, int posFinal){
        if(posFinal>=posInicial){
            if(palabra.charAt(posInicial)==palabra.charAt(posFinal))
                return isPalindromo(palabra,posInicial+1,posFinal-1);
            
            return false;
        }
        return true;
    }
    
    public static boolean isPalindromo(String palabra){
        return isPalindromo(palabra,0,palabra.length()-1);
    }
    
    //4.
    public void printPassengers(int pos){
        if(pos<=29){
            if(asientos[pos]!= null){
            listado = "Pasajero: "+asientos[pos].getNombreP()+" Precio pagado: $"+asientos[pos].getPagoT()+"\n";
            printPassengers(pos+1);
            JOptionPane.showMessageDialog(null, listado);
            }
        }
    }
    public void printPassengers(){
        printPassengers(0);
    }
    
    //5.X
    private double Income(int pos){
        if(pos<=29){
            if(asientos[pos]!=null){
                total += asientos[pos].getPagoT();
            }
            return Income(pos+1);
        }
        return total;
    }
    public double Income(){
        return Income(0);
    }
    
    //6.X
    public void reset(int pos){
        if(pos<=29){
            asientos[pos]=null;
            printPassengers(pos+1);
        }
    }
    public void reset(){
        reset(0);
    }
    
    //7.X
    public void sellTicket(String name){
        double precio=800;
        double descuento=0.20*precio;
        double precioFinal;
        
        if(isPalindromo(name,0,name.length()-1)){
            precioFinal=precio-descuento;
        }else{
            precioFinal=precio;
        }
        
        for(int indice=0;indice<=29;indice++){
            if(asientos[indice]==null){
                asientos[indice]=new Ticket(name,precioFinal);
                indice=30;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Monto a pagar de "+name+" :$"+precioFinal);
    }
    
    //8.X
    public boolean cancelTicket(String nombre){
        for (int pos = 0; pos < 30; pos++) {
            if(asientos[pos].getNombreP().equals(nombre)){
                asientos[pos]=null;
                return true;
            }
        }
        return false;
    }
    
    //9.X
    public void dispatch(){
        String lista = "";
        for (int pos = 0; pos < 30; pos++) {
            if(asientos[pos] != null){
                lista += String.valueOf(pos)+" ";
            }
        }
        JOptionPane.showMessageDialog(null,"Ingresos conseguidos: $ "+Income()+"\n"+
                "Asientos vendidos: "+lista+"\n");
        
        reset();
    }
}
