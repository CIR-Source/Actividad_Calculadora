/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
* El programa division permite al usuario 
* introducir dos numeros a dividir y al final 
* devuelve el resultado de la division
*/
public class Division {
    private double resultado;

    /**
     *
     */
    public Division() {
    }

    /**
     *
     * @param resultado
     */
    public Division(double resultado) {
        this.resultado = resultado;
    }

    /**
     *
     * @return
     */
    public double getResultado() {
        return resultado;
    }

    /**
     *
     * @param resultado
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    /**
     *
     * @param valor
     * @return
     */
    public double multiplicacion(double valor){
        this.resultado = resultado / valor;
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Division{" + "resultado=" + resultado + '}';
    }
    
    
}
