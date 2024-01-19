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
}
