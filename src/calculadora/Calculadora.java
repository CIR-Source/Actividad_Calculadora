/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 * Programa que permite realizar cuatro
 * operaciones basicas de una calculadora
 * @author William J. Chi Rico
 */
public class Calculadora {
    
    /**
     * Proceso que activa la clase suma y pide
     * al usuario introducir dos cifras a sumar
     */
    public static void suma(){
        Scanner pNum = new Scanner(System.in);
        Suma calc = new Suma();
        
        System.out.println("Introduzca el primer numero a sumar");
        calc.setResultado(pNum.nextDouble());
        
        System.out.println("Introduzca el siguiente numero a sumar");
        Scanner sNum = new Scanner(System.in);
        double sN = sNum.nextDouble();
        
        System.out.println("El resultado de la suma es: " + calc.suma(sN));
        }
    
    /**
     * Proceso que activa la clase resta y pide
     * al usuario introducir dos cifras a restar
     */
    public static void resta(){
        Scanner pNum = new Scanner(System.in);
        Resta calc = new Resta();
        
        System.out.println("Introduzca el primer numero a restar");
        calc.setResultado(pNum.nextDouble());
        
        System.out.println("Introduzca el siguiente numero a restar");
        Scanner sNum = new Scanner(System.in);
        double sN = sNum.nextDouble();
        
        System.out.println("El resultado de la resta es: " + calc.resta(sN));
        }
    
    /**
     * Proceso que activa la clase multiplicacion y pide
     * al usuario introducir dos cifras a multiplicar
     */
    public static void multiplicacion(){
        Scanner pNum = new Scanner(System.in);
        Multiplicacion calc = new Multiplicacion();
        
        System.out.println("Introduzca el primer numero a multiplicar");
        calc.setResultado(pNum.nextDouble());
        
        System.out.println("Introduzca el siguiente numero a multiplicar");
        Scanner sNum = new Scanner(System.in);
        double sN = sNum.nextDouble();
        
        System.out.println("El resultado de la multiplicación es: " + calc.multiplicacion(sN));
        }
    
    /**
     * Proceso que activa la clase division y pide
     * al usuario introducir dos cifras a multiplicar
     */
    public static void division(){
        Scanner pNum = new Scanner(System.in);
        Division calc = new Division();
        
        System.out.println("Introduzca el numero a dividir");
        calc.setResultado(pNum.nextDouble());
        
        System.out.println("Introduzca el numero que divide");
        Scanner sNum = new Scanner(System.in);
        double sN = sNum.nextDouble();
        
        if (sN == 0) {
            System.out.println("No se puede divir entre cero");
        } else {
            System.out.println("El resultado de la división es: " + calc.multiplicacion(sN));
        }
        }
    
    /**
     * Proceso que le pide al usuario escoger
     * una de las cuatro distintas operaciones que
     * la calculadora puede realizar y activa los
     * procesos de dichas operaciones
     */
    public static void opcion(){
        Scanner option = new Scanner (System.in);
        
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("");
        System.out.println("Suma [1]");
        System.out.println("Resta [2]");
        System.out.println("Multiplicación [3]");
        System.out.println("División [4]");
        System.out.println("");
        int opcion = option.nextInt();
        
        switch (opcion){
            case 1 -> suma();
            case 2 -> resta();
            case 3 -> multiplicacion();
            case 4 -> division();
            default -> System.out.println("Esa opcioón no esta disponible");
        }
        }
    
    /**
     *
     * @param args Cuerpo principal del programa
     */
    public static void main(String[] args) {
        // TODO code application logic here
        opcion();
    }
}