package model;


import java.util.ArrayList;
import java.util.Scanner;


public class CrearPersonaje {

    public static ArrayList<Personaje> personajes = new ArrayList<>();

    ColoresLetras color = new ColoresLetras();

    /**
     * En este metodo, imprime por pantalla el menu con los personajes normales y luchadores,
     * para que el usuario ponga el nombre y escoja que personaje quiere.
     */
    public void crearPersonajes() {

        Scanner input = new Scanner(System.in);
        ColoresLetras color = new ColoresLetras();


        boolean longitud = true;
        boolean opcionNoValida = true;
        String nombre;
        int opcion;
        int id = personajes.size();

        do {
            longitud = true;
            System.out.println(color.getANSI_PURPLE() + "Escrive el nombre(máximo 7 caracteres" + color.getAnsiReset());
            nombre = input.next();
            if (nombre.length() > 7) {
                System.out.println(color.getANSI_RED() + "Error, demaciados caracteres" + color.getAnsiReset());
                longitud = false;
            } else {
                do {
                    System.out.println(color.getANSI_YELLOW() + "Selecciona tipos de personaje");
                    System.out.println("-----------------------------" + color.getAnsiReset());
                    System.out.println(color.getAnsiBlue() + "****Personajes Normales****" + color.getAnsiReset());
                    System.out.println(color.getANSI_CYAN() + "1." + "Orca" + color.getAnsiReset());
                    System.out.println(color.getANSI_CYAN() + "2." + "Balena" + color.getAnsiReset());
                    System.out.println(color.getANSI_CYAN() + "3." + "Leon Marino" + color.getAnsiReset());
                    System.out.println(color.getAnsiBlue() + "****Personajes Luchadores****" + color.getAnsiReset());
                    System.out.println(color.getANSI_CYAN() + "4." + "Oso Polar" + color.getAnsiReset());
                    System.out.println(color.getANSI_CYAN() + "5." + "Foca" + color.getAnsiReset());
                    System.out.println(color.getANSI_CYAN() + "6." + "Pinguino" + color.getAnsiReset());
                    opcionNoValida = input.hasNextInt();
                    if (opcionNoValida) {
                        opcion = input.nextInt();
                        switch (opcion) {
                            case 1:
                                Normales orca = new Normales();
                                orca.Orca(nombre, id);
                                personajes.add(orca);

                                break;
                            case 2:

                                Normales balena = new Normales();
                                balena.Balena(nombre, id);
                                personajes.add(balena);

                                break;
                            case 3:
                                Normales leonMarino = new Normales();
                                leonMarino.LeonMarino(nombre, id);
                                personajes.add(leonMarino);
                                break;
                            case 4:
                                Luchadores osoPolar = new Luchadores();
                                osoPolar.OsoPolar(nombre,id);
                                personajes.add(osoPolar);

                                break;
                            case 5:
                                Luchadores foca = new Luchadores();
                                foca.Foca(nombre,id);
                                personajes.add(foca);

                                break;
                            case 6:
                                Luchadores pinguino = new Luchadores();
                                pinguino.Pinguino(nombre,id);
                                personajes.add(pinguino);

                                break;
                            default:
                                System.out.println(color.getANSI_RED() + "Error, opcion no encontrada" + color.getAnsiReset());
                                opcionNoValida = false;
                        }
                    } else {
                        System.out.println(color.getANSI_RED() + "Error, opcion no valida" + color.getAnsiReset());
                        input.nextLine();
                    }

                } while (!opcionNoValida);
            }
        } while (!longitud || nombre.isEmpty());


    }

    /**
     * Imprime por pantalla, los personajes con sus datos sobrescribiendo el metodo Display().
     */
   public void imprimir() {

        if (personajes.isEmpty()) {
            System.out.println(color.getANSI_RED() + "No hay personajes" + color.getAnsiReset());
        } else {
            for (int i = 0; i < personajes.size(); i++) {
                System.out.println(personajes.get(i).display());

            }
        }
    }
}








