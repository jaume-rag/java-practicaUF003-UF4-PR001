package model;


public class Normales extends Personaje {

    public Normales(String nombre, String raza, int id, int fuerza, int agilidad, int resistencia, int inteligencia, int espiritu, int vidas) {
        super(nombre, raza, id, fuerza, agilidad, resistencia, inteligencia, espiritu, vidas);
    }

    public Normales() {
    }

    /**
     * Constructor de Objeto Orca, recibe dos parametros.
     * @param nombre
     * @param id
     * @return raza
     */
    public String Orca(String nombre, int id) {
        super.nombre = nombre;
        super.id = id;
        super.raza = "Orca";
        super.fuerza = 23;
        super.agilidad = 15;
        super.resistencia = 22;
        super.inteligencia = 20;
        super.espiritu = 19;
        super.vidas=vidas;

        return raza;
    }

    /**
     * Constructor de Objeto Balena, recibe dos parametros.
     * @param nombre
     * @param id
     * @return raza
     */
    public String Balena(String nombre, int id) {
        super.nombre = nombre;
        super.id = id;
        super.raza = "Balena";
        super.fuerza = 24;
        super.agilidad = 19;
        super.resistencia = 21;
        super.inteligencia = 17;
        super.espiritu = 22;
        super.vidas = vidas;
        return raza;
    }

    /**
     * Constructor de Objeto LeonMarino, recibe dos parametros.
     * @param nombre
     * @param id
     * @return raza
     */
    public String LeonMarino(String nombre, int id) {
        super.nombre = nombre;
        super.id = id;
        super.raza = "Leon Marino";
        super.fuerza = 20;
        super.agilidad = 18;
        super.resistencia = 25;
        super.inteligencia = 15;
        super.espiritu = 16;
        super.vidas = vidas;
        return raza;
    }

    /**
     * Sobrescritura del metodo Display para personajes Luchadores.
     *
     * @return nombre,id,raza,fuerza,agilidad,resistencia,inteligencia,espiritu,vidas.
     */
    @Override
    public String display() {
        return super.display();
    }


}