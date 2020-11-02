package model;

import java.util.ArrayList;

public class Luchadores extends Personaje {

    /**
     * Constructor classe Luchadores.
     *
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
    public Luchadores(String nombre, String raza, int id, int fuerza, int agilidad, int resistencia, int inteligencia, int espiritu, int ganadas, int perdidas, int vidas) {
        super(nombre, raza, id, fuerza, agilidad, resistencia, inteligencia, espiritu, ganadas, perdidas, vidas);
    }

    /**
     * Constructor vacio.
     */
    public Luchadores() {
    }

    /**
     * Constructor de Objeto osoPolar, recibe dos parametros.
     *
     * @param nombre
     * @param id
     * @return raza
     */
    public String OsoPolar(String nombre, int id) {
        super.nombre = nombre;
        super.id = id;
        super.raza = "Oso Polar";
        super.fuerza = 24;
        super.agilidad = 18;
        super.resistencia = 23;
        super.inteligencia=17;
        super.espiritu = 20;
        super.ganadas = 0;
        super.perdidas = 0;
        super.vidas = vidas;
        return raza;
    }

    /**
     * Constructor de Objeto Foca, recibe dos parametros.
     *
     * @param nombre
     * @param id
     * @return raza
     */
    public String Foca(String nombre, int id) {
        super.nombre = nombre;
        super.id = id;
        super.raza = "Foca";
        super.fuerza = 19;
        super.agilidad = 13;
        super.resistencia = 22;
        super.inteligencia = 21;
        super.espiritu = 15;
        super.ganadas = 0;
        super.perdidas = 0;
        super.vidas = vidas;
        return raza;
    }

    /**
     * Constructor de Objeto Pinguino, recibe dos parametros.
     *
     * @param nombre
     * @param id
     * @return raza
     */
    public String Pinguino(String nombre, int id) {
        super.nombre = nombre;
        super.id = id;
        super.raza = "Pinguino";
        super.fuerza = 20;
        super.agilidad = 16;
        super.resistencia = 21;
        super.inteligencia = 17;
        super.espiritu = 18;
        super.ganadas = 0;
        super.perdidas = 0;
        super.vidas = vidas;
        return raza;
    }

    /**
     * Sobrescritura del metodo Display para personajes Luchadores.
     *
     * @return nombre,id,raza,fuerza,agilidad,resistencia,inteligencia,espiritu,ganadas,perdidas,vidas.
     */
    @Override


    public String display() {
        return super.display()
                + ", ganadas=" + ganadas +
                ", perdidas=" + perdidas +
                '}';

    }

}

