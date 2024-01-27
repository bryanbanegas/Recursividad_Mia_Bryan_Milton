/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adalb
 */
public class Ticket {
    private String nombreP;
    private double pagoT;

    public Ticket(String nombreP, double pagoT) {
        this.nombreP = nombreP;
        this.pagoT = pagoT;
    }

    public String getNombreP() {
        return nombreP;
    }

    public double getPagoT() {
        return pagoT;
    }
   
    public void Print(){
        System.out.print("Nombre de pasajero: "+this.getNombreP()+"\n"+
                "Total pagado por el ticket: "+this.getPagoT()+"\n");
    }
    /*
    public void print(){
        for(int indice=0;indice<transito.multa.length;indice++){
            if(transito.multa[indice]==null){
                
            }else{
                JOptionPane.showMessageDialog(null,"Codigo del multado: "+transito.multa[indice].getCodigo());
                JOptionPane.showMessageDialog(null,"Nombre del multado: "+transito.multa[indice].getNombre());
                String mensaje=(pago=false)?"Multa pendiente":"Pagada por un monto de: Lps."+transito.multa[indice].getMonto();
                JOptionPane.showMessageDialog(null,mensaje);
            }
        }
    }
    */
}
