
import java.util.Random;
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
public class Usuario {
    int id;
    String nombre;
    TreeMap<Integer,Baraja> barajas = new TreeMap<>();
    
    //Metodos

    /**
     * Constructor por defecto
     */
    public Usuario() {
    }
    
    /**
     * Constructor con id y nombre
     * @param id id del usuario
     * @param nombre nombre del usuario
     */
    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    /**
     * Metodo para generar un id en caso de que el usuario no este creado.
     */
    public void generarId(){
         Random rnd = new Random();
         id=rnd.nextInt(1000);
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    //Setter de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo toString
     * @return devuelve un String con todos los atributos del usuario
     */
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", barajas=" + barajas + '}';
    }
    
    
    
}
