/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banegas_Bryan_Prueba_1;
import java.util.Scanner;

/**
 *
 * @author adalb
 */
public class Banegas_Bryan_Prueba_1 {
    public static void main(String[] args){
        //AQUI ESTA EL SCANNER
     Scanner lea=new Scanner(System.in);
     //aqui estas todas la variables definidas o inicializadas
     int a,b,ciclo=1,contar=0,letraA=0,letraE=0,letraI=0,letraO=0,letraU=0,cantidad,numeracion=0,votos,votos1,totalvotos,error=1;
     int numero,numeromayor=0,numeromenor=0,cantidadvotos,votorojo=0,votoazul=0,votonegro=0,votoamarillo=0,votonulo=0;
     double fallido;
     String opcion,palabra,voto;
     char letra;
     
     //Este es el ciclo para todo
     while(ciclo==1){
     System.out.println("===Menu===");
     System.out.println("1. Palabra Alreves");
     System.out.println("2. Palindroma & Vocal");
     System.out.println("3. Mayor y Menor Ingresados");
     System.out.println("4. Votaciones");
     System.out.println("5. Salir");
     System.out.print("Elija una opcion: ");
     opcion=lea.next();
     switch(opcion){
         case "1":
            System.out.print("Ingrese una Palabra: ");
            palabra=lea.next();
            //para que escriba la palabra al revez
            for(int cuenta=palabra.length()-1;cuenta>=0;cuenta--){ 
                System.out.print(palabra.charAt(cuenta));
            }
            System.out.println(" ");
            break;
            
         case "2":
            System.out.print("Ingrese una Palabra: ");
            palabra=lea.next().toUpperCase();
            a=0;
            b=palabra.length()-1;
            //para saber si una palabra es palindroma o no
            if(palabra.charAt(a)==palabra.charAt(b)){
            System.out.println("Si es Palindroma");
            
            }else{
            System.out.println("No es Palindroma");

            }
            contar=0;
            letraA=0;
            letraE=0; 
            letraI=0; 
            letraO=0;
            letraU=0; 
            //para saber cuantas vocales tiene la palabra
            do{
            letra=palabra.charAt(contar); 
            switch(letra){ 
                case 'A':
                     letraA++;  
                    break;
                case 'E':
                     letraE++;
                    break;
                case 'I':
                     letraI++;
                    break;
                case 'O':
                     letraO++;
                    break;
                case 'U':
                     letraU++;
                    break;     
            }
            contar++; 
            }while(contar<palabra.length());
            
            System.out.println("A: "+letraA);
            System.out.println("E: "+letraE);
            System.out.println("I: "+letraI);
            System.out.println("O: "+letraO);
            System.out.println("U: "+letraU);
                
             
            break;
          
        case "3":
            error=1;
            while(error==1){
                System.out.print("Ingrese la cantidad de numeros: ");
                cantidad=lea.nextInt();
            if(cantidad<=0){
                System.out.println("Lo ingresado es incorrecto");
            }else{
                numeracion=0;
            for(int contar1=0;contar1<cantidad;contar1++){
                numeracion++;  
                System.out.print(numeracion+"# Numero: ");
                numero=lea.nextInt(); 
                if(numeracion==1){
                  numeromayor=numero;
                }
                if(numeracion==1){
                  numeromenor=numero;
                }
                if(numeromenor>numero){
                  numeromenor=numero;
                }
                if(numero>numeromayor){
                  numeromayor=numero;
                }
            }
             error=2;
            }
            }
            System.out.println("Numero mayor: "+numeromayor);
            System.out.println("Numero menor: "+numeromenor);
            
             
            break;
            
        case "4":
            error=1;
            while(error==1){
            System.out.print("Ingrese la cantidad de personas que van a votar: ");
            cantidadvotos=lea.nextInt();
            if(cantidadvotos<=0){
                System.out.println("Lo ingresado es incorrecto");
            }else{
            votoazul=0;
            votonegro=0;
            votorojo=0;
            votoamarillo=0;
            //para poder escojer la plantilla de votos
            for(int contar2=0;contar2<cantidadvotos;contar2++){
                System.out.println("AZUL");
                System.out.println("ROJO");
                System.out.println("NEGRO");
                System.out.println("AMARILLO");
                voto=lea.next().toUpperCase();
                if(voto.equals("AZUL")){
                    votoazul++;
                    
                }else if(voto.equals("ROJO")){
                    votorojo++;
                    
                }else if(voto.equals("NEGRO")){
                    votonegro++;
                    
                }else if(voto.equals("AMARILLO")){
                    System.out.println("Voto nulo");
                    
                }else{
                    votonulo++;
                    
                }   
            }
            //Esto es para saber si la votacion es fallida o no
            votos=votoazul+votorojo;
            votos1=votonegro+votoamarillo;
            totalvotos=votos+votos1;
            fallido=cantidadvotos*0.60;
            if(fallido>totalvotos){
                System.out.println("VOTACION FALLIDA");
                
            }else if(totalvotos>=fallido){
                error=2;
                if(votoazul>votorojo && votoazul>votonegro && votoazul>votoamarillo){
                System.out.println("GANO LA PLANTILLA AZUL");

            }else if(votorojo>votoazul && votorojo>votonegro && votorojo>votoamarillo){
                System.out.println("GANO LA PLANTILLA ROJO");

            }else if(votonegro>votoazul && votonegro>votorojo && votonegro>votoamarillo){
                System.out.println("GANO LA PLANTILLA NEGRO");

            }else if(votoamarillo>votoazul && votoamarillo>votonegro && votoamarillo>votorojo){
                System.out.println("GANO LA PLANTILLA AMARILLO");

            }   
            }
            }
            }
            
            
            break;   
        
        case "5":
            //Para salir y terminar el programa
            ciclo=2;
             
            break;     
     }
           
         
     } 
         
    
        
    } 
}
