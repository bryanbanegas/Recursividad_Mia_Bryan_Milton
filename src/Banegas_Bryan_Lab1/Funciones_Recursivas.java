/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banegas_Bryan_Lab1;

/**
 *
 * @author adalb
 */
public class Funciones_Recursivas {
    
    public static int sumaUP(int num){
        if(num>=1){
            return sumaUP(num-1)+num;
        }else{
            return 0;
        }
    }
    
    private static int sumaDOWN(int num,int total){
        if(num>=1){
            return sumaDOWN(num-1,total+num);
        }else{
            return total;
        }
    }
    
    public static int sumaDOWN(int num){
        return sumaDOWN(num,0);
    }
    
    private static boolean esPalindromo(String palabra,int posInicio,int posFin){
        if(posFin>posInicio){
            if(palabra.charAt(posInicio)==palabra.charAt(posFin)){
                return esPalindromo(palabra,posInicio+1,posFin-1);
            }else{
                return false;
            }
        }
        return true;
    }
    
    public static boolean esPalindromo(String palabra){
        return esPalindromo(palabra,0,palabra.length()-1);
    }
                                      
    private static void piramide(int base,int fila,int col){
        if(fila<=base){
            if(fila>=1){
                if(col>=fila){
                    System.out.print("*");
                    piramide(base,fila,col+1);
                }else{
                    System.out.println("");       
                    piramide(base,fila+1,1);
                }
            }
        }
    }
    
    public static void piramide(int base){
        piramide(base,1,1);
    }
}
