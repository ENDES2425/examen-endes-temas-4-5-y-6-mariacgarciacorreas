package mariacgarciacorreas.animales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author María C García Correas
 */
public class Pajaro {
    //Aquí se almacena la información del pájaro
    String nombre_especie;
    double envergadura;
    double peso;

    /**
     * Constructor vacío
     */
    public Pajaro() {
    }

    /**
     * Constructor
     * @param nombre_especie
     * @param envergadura
     * @param peso 
     */
    public Pajaro(String nombre_especie, double envergadura, double peso) {
        this.nombre_especie = nombre_especie;
        this.envergadura = envergadura;
        this.peso = peso;
    }
    
    /**
     * Get
     * @return nombre_especie
     */
    public String getNombre_especie() {
        return nombre_especie;
    }

    /**
     * Set
     * @param nombre_especie 
     */
    public void setNombre_especie(String nombre_especie) {
        this.nombre_especie = nombre_especie;
    }

    /**
     * Get
     * @return envergadura
     */
    public double getEnvergadura() {
        return envergadura;
    }

    /**
     * Set
     * @param envergadura 
     */
    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    /**
     * Get
     * @return peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Set
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
     
    /**
     * Método para imprimir datos por pantalla
     */
    public void imprimir () {
        System.out.println("ZOOLÓGICO DE CUENCA – SECCIÓN DE AVES"); System.out.println("Registro Sanitario No 48/38751");
        System.out.println("Para consultar el nombre del animal revise la etiqueta");
        System.out.println("Peso: "+this.peso);
        System.out.println("Envergadura: " + this.envergadura);
        System.out.println("Nombre de la especie: " + this.nombre_especie);
    }

}
