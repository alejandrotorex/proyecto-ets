/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian Cantelar Rodriguez
 */
public class Tipo4 extends Carta {
    String debilidades;
    String fortalezas;

    public String getDebilidades() {
        return debilidades;
    }

    public String getFortalezas() {
        return fortalezas;
    }

    /**
     * Metodo que devuelve los atributos de la carta (padre) y los atributos de 
     * la clase
     * @return todos los atributos tanto de la clase carta (padre) y la clase
     * tipo (hijo)
     */
    @Override
    public String toString() {
        return super.toString() + " debilidades: " + debilidades + " fortalezas: "
                + fortalezas;
    }
    
    
}
