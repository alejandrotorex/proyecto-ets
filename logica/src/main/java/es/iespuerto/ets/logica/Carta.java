/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian Cantelar Rodriguez
 */
public class Carta  {
    int id;
    String nombre;
    String descripcion;
    int vida;
    int ataque;
    int coste;

    /**
     * Constructor por defecto
     */
    public Carta() {
    }

    /**
     * Constructor con id y nombre de la carta
     * @param id de la carta
     * @param nombre nombre de la carta
     */
    public Carta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Constructor con nombre
     * @param nombre nombre de la carta
     */
    public Carta(String nombre) {
        this.nombre = nombre;
    }

    //Getters 
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getCoste() {
        return coste;
    }

    /**
     * toString de la clase Carta
     * @return todos los atributos de la clase Carta en un String
     */
    @Override
    public String toString() {
        return "Carta{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", vida=" + vida + ", ataque=" + ataque + ", coste=" + coste + '}';
    }
    
    
}
