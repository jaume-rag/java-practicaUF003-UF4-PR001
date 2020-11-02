package model;


import java.util.ListIterator;
import java.util.Scanner;


public class Lucha extends CrearPersonaje {


    Inicio inicio = new Inicio();
    private int idLuchadorUsuario = 0;
    private int idOponenteUsuario = 0;
    private int comparacion;
    private boolean numero = true;
    private int vueltas = 0;
    private int vuelta = 0;


    /**
     * Comprueva que hay personajes luchadores y normales.
     * llama el metodo ImprimirPersonajes.
     * Llama al metodo de comparacion.
     * Llama al metodo de fight.
     */
    public void SeleccionPersonajes() {


        do {
            if (personajes.isEmpty()) {

                System.out.println(color.getANSI_RED() + "No hay personajes" + color.getAnsiReset());
                System.out.println();

            } else {
                ImprimirPersonajes("*** Luchador/ es ***", "Oso Polar", "Foca", "Pinguino");
                vuelta++;
                ImprimirPersonajes("*** Oponente/ s ***", "Orca", "Balena", "Leon Marino");


            }
            compareHabilidades(personajes.get(idLuchadorUsuario), personajes.get(idOponenteUsuario));
            fight();
        } while (!numero);

    }

    /**
     * Imprime el array, seleccionando los personajes que recibe  a traves de los distintos personajes.
     * Pide la seleccion del id que quiere el usuario.
     * Comprueva que id introducido exista.
     *
     * @param titulo
     * @param personaje1
     * @param personaje2
     * @param personaje3
     */

    private void ImprimirPersonajes(String titulo, String personaje1, String personaje2, String personaje3) {


        Scanner input = new Scanner(System.in);
        boolean comparador = true;
        int contador = 0;


        do {
            numero = true;
            System.out.println(color.getANSI_WHITE() + titulo + color.getAnsiReset());

            for (int i = 0; i < personajes.size(); i++) {

                if (personajes.get(i).getRaza().contains(personaje1) || personajes.get(i).getRaza().contains(personaje2) || personajes.get(i).getRaza().contains(personaje3)) {
                    System.out.println(color.getANSI_GREEN() + personajes.get(i).display() + color.getAnsiReset());

                    contador++;
                }

            }

            if (contador == 0) {

                System.out.println(color.getANSI_RED() +"No hay ningun " + titulo + color.getAnsiReset());
                Inicio inicio = new Inicio();
                inicio.Inicio();
            } else {

                do {
                    contador = 0;
                    comparador = true;
                    System.out.println(color.getAnsiBlue() + "Selecciona el id del " + titulo + color.getAnsiReset());
                    numero = input.hasNextInt();
                        if (numero) {
                            if (vuelta == 0) {
                                idLuchadorUsuario = input.nextInt();
                                if (idLuchadorUsuario < personajes.size()) {
                                    int idrecogido = personajes.get(idLuchadorUsuario).getId();
                                    for (int i = 0; i < personajes.size(); i++) {

                                        if (personajes.get(i).getRaza().contains(personaje1) || personajes.get(i).getRaza().contains(personaje2) || personajes.get(i).getRaza().contains(personaje3)) {
                                            int print = personajes.get(i).getId();
                                            if (print == idrecogido) {
                                                vueltas = 1;
                                            }

                                        }

                                    }
                                    if (vueltas == 1) {
                                        vueltas = 0;
                                        break;
                                    } else {
                                        System.out.println(color.getANSI_RED()+"Error, id no existe."+color.getAnsiReset());
                                        comparador = false;
                                    }
                                } else {
                                    System.out.println(color.getANSI_RED()+"Error, el id no existe."+color.getAnsiReset());
                                    comparador = false;
                                }


                            } else {
                                idOponenteUsuario = input.nextInt();
                                if (idOponenteUsuario < personajes.size()) {
                                    int idrecogido = personajes.get(idOponenteUsuario).getId();
                                    for (int i = 0; i < personajes.size(); i++) {

                                        if (personajes.get(i).getRaza().contains(personaje1) || personajes.get(i).getRaza().contains(personaje2) || personajes.get(i).getRaza().contains(personaje3)) {
                                            int print = personajes.get(i).getId();
                                            if (print == idrecogido) {
                                                vueltas = 1;
                                            }

                                        }

                                    }
                                    if (vueltas == 1) {
                                        break;
                                    } else {
                                        System.out.println(color.getANSI_RED()+"Error, id no existe."+color.getAnsiReset());
                                        comparador = false;
                                    }
                                } else {
                                    System.out.println(color.getANSI_RED()+"Error, el id no existe."+color.getAnsiReset());
                                    comparador = false;
                                }

                            }

                        } else {
                            System.out.println(color.getANSI_RED()+"El valor introducido, tiene que ser un número"+color.getAnsiReset());
                        }

                } while (!comparador);

            }
        } while (!numero);
    }



    /**
     * Hace la comparacion de los valores de los atributos, de los dos Objetos que recibe.;
     *
     * @param s1
     * @param s2
     */
    public int compareHabilidades(Personaje s1, Personaje s2) {


        if (personajes.get(idLuchadorUsuario).getRaza().contains("Oso Polar")) {
            comparacion = personajes.get(idLuchadorUsuario).getResistencia() - personajes.get(idOponenteUsuario).getResistencia();

        }

        if (personajes.get(idLuchadorUsuario).getRaza().contains("Foca")) {
            comparacion = personajes.get(idLuchadorUsuario).getFuerza() - personajes.get(idOponenteUsuario).getFuerza();

        }

        if (personajes.get(idLuchadorUsuario).getRaza().contains("Pinguino")) {
            comparacion = personajes.get(idLuchadorUsuario).getAgilidad() - personajes.get(idOponenteUsuario).getAgilidad();

        }

        return comparacion;
    }

    /**
     * Filtra el resultado del metodo compareHabilidades.
     */
    public void fight() {
        Luchadores luchadores = new Luchadores();

        if (comparacion < 0) {
            System.out.println(personajes.get(idLuchadorUsuario).getNombre() + " Pierde contra " + personajes.get(idOponenteUsuario).getNombre());
            lose();
        }
        if (comparacion == 0) {
            System.out.println(personajes.get(idLuchadorUsuario).getNombre() + " Gana contra " + personajes.get(idOponenteUsuario).getNombre());
            win();
        }
        if (comparacion > 0) {
            System.out.println(personajes.get(idLuchadorUsuario).getNombre() + " Gana contra " + personajes.get(idOponenteUsuario).getNombre());
            win();
        }
    }

    /**
     * Si gana Luchador suma uno en ganados y le resta una vida al perdedor.
     */
    public void win() {

        Luchadores luchadores = new Luchadores();
        Normales normales = new Normales();
        personajes.get(idLuchadorUsuario).setGanadas(luchadores.getGanadas() + 1);
        personajes.get(idOponenteUsuario).setVidas(normales.getVidas() - 1);

    }

    /**
     * Si pierde Luchador suma uno en perdidos y le resta una vida .
     */
    public void lose() {
        Luchadores luchadores = new Luchadores();
        personajes.get(idLuchadorUsuario).setPerdidas(luchadores.getPerdidas() + 1);
        personajes.get(idLuchadorUsuario).setVidas(luchadores.getVidas() - 1);

    }

}





