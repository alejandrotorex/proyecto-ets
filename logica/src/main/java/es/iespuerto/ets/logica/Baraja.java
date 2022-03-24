
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian Cantelar Rodriguez
 */
public class Baraja {
    int id;
    String nombre;
    TreeMap<Integer, Carta> cartas = new TreeMap<>();
    
    
    /**
     * Metodo para agregar una carta al TreeMap
     * @param id id de la carta a agregar
     * @param carta la carta a agregar
     */
    public void agregarCarta(Integer id, Carta carta){
        cartas.put(id, carta);
    }
    
    /**
     * Metodo para eliminar una carta del TreeMap
     * @param id id de la carta a eliminar
     */
    public void eliminarCarta(Integer id){
        cartas.remove(id);
    }

    //Setter de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que devuelve un String con los atributos de la baraja
     * @return un String con todos los atributos de la baraja
     */
    @Override
    public String toString() {
        return "Baraja{" + "id=" + id + ", nombre=" + nombre + ", cartas=" + cartas + '}';
    }
    
    
}
