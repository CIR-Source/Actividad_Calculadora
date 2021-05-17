/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
* El programa resta le permite al usuario
* introducir dos numeros para restar y al final
* devuelve el resultado de dicha resta
*/
public class Resta {
    private double resultado;

    /**
     *
     */
    public Resta() {
    }

    /**
     *
     * @param resultado
     */
    public Resta(double resultado) {
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
    public double resta(double valor){
        this.resultado = resultado - valor;
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Resta{" + "resultado=" + resultado + '}';
    }
    
    
}
