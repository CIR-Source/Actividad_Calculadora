/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
* El programa multiplicacion le permite al usuario
* introducir dos numero a multiplicar y al final
* devuelve el resultado de dicha multiplicacion
*/
public class Multiplicacion {
    private double resultado;

    /**
     *
     */
    public Multiplicacion() {
    }

    /**
     *
     * @param resultado
     */
    public Multiplicacion(double resultado) {
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
        this.resultado = resultado * valor;
        return resultado;
    }
            
    @Override
    public String toString() {
        return "Multiplicacion{" + "resultado=" + resultado + '}';
    }
}
