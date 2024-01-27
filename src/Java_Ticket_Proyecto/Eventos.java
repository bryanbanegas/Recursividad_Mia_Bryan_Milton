/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Ticket_Proyecto;

/**
 *
 * @author adalb
 */
public class Eventos {
    
    private int codigo;
    private String titulo;
    private String descripcion;
    private String fecha;
    private double monto;
    
    public Eventos(int codigo,String titulo,String descripcion,String fecha,double monto) {
        this.codigo=codigo;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.monto=monto;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public int setCodigo(int codigo){
        return this.codigo=codigo;
    }
    
    public String setTitulo(String titulo){
        return this.titulo=titulo;
    }
    
    public String setDescripcion(String descripcion){
        return this.descripcion=descripcion;
    }
    
    public String setFecha(String fecha){
        return this.fecha=fecha;
    }
    
    public double setMonto(double monto){
        return this.monto=monto;
    }
}
