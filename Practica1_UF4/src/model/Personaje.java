package model;

import java.util.ArrayList;

/**
 * Esta classe tiene todos los atributos de los personajes
 */
public  class Personaje {


    protected String nombre;
    protected   String raza;
    protected int id;
    protected int fuerza;
    protected int agilidad;
    protected int resistencia;
    protected int inteligencia;
    protected int espiritu;
    protected int ganadas;
    protected int perdidas;
    protected int vidas=3 ;

    /**
     * Constructor vacio de la classe Personaje;
     */
    public Personaje() {
    }

    /**
     * Constructor para crear los personajes Luchadores.
     * @param nombre
     * @param raza
     * @param id
     * @param fuerza
     * @param agilidad
     * @param resistencia
     * @param inteligencia
     * @param espiritu
     * @param ganadas
     * @param perdidas
     * @param vidas
     */
    public Personaje(String nombre, String raza, int id, int fuerza, int agilidad, int resistencia, int inteligencia, int espiritu, int ganadas, int perdidas, int vidas) {
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;
        this.espiritu = espiritu;
        this.ganadas = ganadas;
        this.perdidas = perdidas;
        this.vidas = vidas;
    }

    /**
     * Constructor para crear los personajes Normales.
     * @param nombre
     * @param raza
     * @param id
     * @param fuerza
     * @param agilidad
     * @param resistencia
     * @param inteligencia
     * @param espiritu
     * @param vidas
     */
    public Personaje(String nombre, String raza, int id, int fuerza, int agilidad, int resistencia, int inteligencia, int espiritu, int vidas) {
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;
        this.espiritu = espiritu;
        this.vidas = vidas;
    }
    /**
     * Metodo getter del atributo id.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo getter del atributo raza.
     * @return raza
     */
    public String getRaza() { return raza; }


    /**
     * Metodo getter del atributo fuerza.
     * @return fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * Metodo getter del atributo agilidad.
     * @return agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * Metodo getter del atributo resistencia.
     * @return resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * Metodo getter del atributo nombre.
     * @return nombre
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo getter del atributo ganadas.
     * @return ganadas
     */
    public int getGanadas() {return ganadas; }

    /**
     * Metodo getter del atributo vidas.
     * @return vidas
     */
    public int getVidas() {return vidas; }
    /**
     * Metodo getter del atributo perdidas.
     * @return perdidas
     */
    public int getPerdidas() {
        return perdidas;
    }


    /**
     * Metodo setter del atributo vidas.
     * @param vidas
     */
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    /**
     * Metodo setter del atributo ganadas.
     * @param ganadas
     */
    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    /**
     * Metodo setter del atributo perdidas.
     * @param perdidas
     */

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    /**
     * Metodo Display para imprimir por pantalla.
     * @return nombre,id,raza,fuerza,agilidad,resistencia,inteligencia,espiritu,vidas.
     */
    public String display() {

        return this.raza + " " + '{' +
                "id='" + id + '\'' +
                ", vidas='" + vidas + '\'' +
                ", nombre=" + nombre +
                ", fuerza=" + fuerza +
                ", agilidad=" + agilidad +
                ", resistencia=" + resistencia +
                ", inteligencia=" +inteligencia +
                ", espiritu=" + espiritu + '}'
                ;
    }


}

