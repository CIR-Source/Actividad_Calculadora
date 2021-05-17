/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
* El programa suma le permite al usuario
* introducir dos numeros a sumar y al final
* devuelve el resultado de dicha suma
*/
public class Suma {
    private double resultado;

    /**
     *
     */
    public Suma() {
    }

    /**
     *
     * @param resultado
     */
    public Suma(double resultado) {
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
    public double suma(double valor){
        this.resultado = resultado + valor;
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Suma{" + "resultado=" + resultado + '}';
    }
    
    
}
