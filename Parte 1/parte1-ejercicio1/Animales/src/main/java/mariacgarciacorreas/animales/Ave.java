package mariacgarciacorreas.animales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Ave
 * @author María C García Correas
 */
public class Ave {
    //Aquí se almacena la información del pájaro
    private String especie;
    private double envergadura;
    private double peso;

    /**
     * Constructor vacío
     */
    public Ave() {
    }

    /**
     * Constructor
     * @param nombre_especie
     * @param envergadura
     * @param peso 
     */
    public Ave(String nombre_especie, double envergadura, double peso) {
        this.especie = nombre_especie;
        this.envergadura = envergadura;
        this.peso = peso;
    }
    
    /**
     * Get
     * @return especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Set
     * @param especie 
     */
    public void setEspecie(String especie) {
        this.especie = especie;
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
     * Método para imprimir_cabecera datos por pantalla
     */
    public void imprimir_cabecera () {
        System.out.println("ZOOLÓGICO DE CUENCA – SECCIÓN DE AVES"); System.out.println("Registro Sanitario No 48/38751");
        System.out.println("Para consultar el nombre del animal revise la etiqueta");
        imprimir_detalle();
    }

    private void imprimir_detalle() {
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Envergadura: " + this.getEnvergadura());
        System.out.println("Nombre de la especie: " + this.getEspecie());
    }

}
