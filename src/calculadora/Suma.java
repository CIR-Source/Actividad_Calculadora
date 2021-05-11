/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author PC
 */
public class Suma {
    private double resultado;

    public Suma() {
    }

    public Suma(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double suma(double valor){
        this.resultado = resultado + valor;
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Suma{" + "resultado=" + resultado + '}';
    }
    
    
}
