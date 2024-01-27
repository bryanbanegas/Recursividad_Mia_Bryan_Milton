/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banegas_Bryan_Lab1;

/**
 *
 * @author adalb
 */
public class info {
    /*
    Tipos de Datos con Funciones de Scanner
    int - nextInt()
    String - nextLine() o next()
    double - nextDouble()
    boolean - nextBoolean()
    char - String or Funcion.charAt(int index)
    */
     
    /*
    1- While()
    2- do{ }while()
    3- for(Idvariable de inicio;condicion;incremento(++)/decremento(--))
    4- foreach(Object idVariable: IdVariable del mismo Object)
    */
    
    /*
    Scanner lea=new Scanner(System.in)
    Void es un espacio vacio y no espera un tipo de datos especifico
    public static void main es una funcion  
    Scanner lea es una clase que nos permite la entrada de datos primitivos
    new Scanner(System.in) tambien es un constructor este se usa para crear espacio en la memoria
    y sirve para inicializar al objeto y establecer sus propiedades y valores predeterminados
    */
    
    /*
    hay que importar un error en especifico y se puede poner mas de un catch en un try
    */
    
    /*
    Arreglos
    1- Unidimensional-> Fila+, Columna 1
    0
    1
    2
    3
    2- Bidimensional-> Fila+, Columna +
    0 1 2 3
    1
    2
    3
    Ambas tiene un Indice
    hay dos tipos de variables: locales y globales
    las funciones set y get funcionan con atributos
    */
    /*
    Las funciones propias no tiene una estructura determinada como el set y el get
    Las funciones especificas se usan para hacer return un valor especifico
    las funciones recursivas no usa loops
    Para la recursividad es necesario un caso base
    EL metodo up tiene un valor encolado pero el metodo down no, aunque los dos siempre tienen un Caso Base
    */
    //Progra 2 JAVA es horientado a objetos
    /*el static sirve para no inicializar en el main
    Herencia tiene estructuras hijas 
    Herencia permite reutilizar una clase, creando una nueva que extiende o especializa la funcionabilidad de una clase existente.
    Al momento de la herencia, la clase hija o subclase hereda todos los:
       -Atributos
       -Funciones
    De la super clase o clase padre
    
    Motivos para desarrollar la herencia:
    -Especializacion
      Auto->AutoDeCarrera
    -Extension
      Phone->SmartPhone
    -Especificacion
      Figura->Circulo
    
    En java la herencia es Simple, es decir que SOLAMENTE se puede heredar de UN PADRE.
    Aunque hay que hacer enfasis que en JAVA, las clases por DEFAULT, heredan de la clase Object.
    
    HERECIA TIPOS: Simple, Multinivel, Jerarquia, Multiple
    
    La clase padre tiene que existir y no ser final
    
    Identificadores:
    -Publicos
    -Privados
    -Protegidos
    -Finales
    
    El identificador de protected lo que hace es cuando usemos nuestra herencia seria publico todos los atributos para este,
    pero privado afuera de la herencia.
    
    en la estructura de la hija hay que poner una variable super y el super es un referenciado directo al padre
    
    podemos comprobar si un objeto es una instancia de un ancestro con un instanceof
    
    UPcating de Clases. esto significa declarar un objeto de la clase PADRE pero instanciarlo con el constructor de una clase HIJA
    
    Maneras de hacer el DOWNcasting
    Indirecta:
    ClasePadre cp=new ClaseHija();
    ClaseHija ch=(ClaseHija)cp;
    ch.llamarAlgoExclusivoDeLaHija();
    ch.uOtraCosaMasDeLaHija();
    Directa:
    ClasePadre cp=new ClaseHija();
    ((ClaseHija)cp).llamarAlgoExclusivoDeLaHija();
    
    una clase abstracta no se puede poner su cuerpo en la clase padre porque el cuerpo se modificara de cuerdo a las necesidades de la hija
    a esta funcion abstracta se le puede poner parametros pero esos mismo parametros se le deberian poner a cada clase hija
    abstract es una estructura mas clara para poder trabajar
    
    CUANDO LLEVES ESTRUCTURA DE DATORS APROVECHA A MEJORAR
    */
}
