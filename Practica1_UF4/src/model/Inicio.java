package model;

import java.util.Scanner;

/**
 * Esta classe muestra por pantalla el menu de opciones y llama al metodo de cada seleccion.
 */
public class Inicio extends ColoresLetras{
    public void Inicio() {

        Scanner input = new Scanner(System.in);
        ColoresLetras color = new ColoresLetras();
        boolean entero;
        int opcion;
        do {
            System.out.println(color.getANSI_GREEN() + "Menu del juego" + color.getAnsiReset());
            System.out.println(color.getANSI_CYAN() + "¿Que quieres hacer? " + color.getAnsiReset());
            System.out.println(color.getAnsiBlue() + "1.Crear personajes");
            System.out.println("2.Mostrar personajes");
            System.out.println("3.Luchar");
            System.out.println("4. Salir" + color.getAnsiReset());

            entero = input.hasNextInt();
            if (entero) {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        CrearPersonaje crear = new CrearPersonaje();
                        crear.crearPersonajes();
                        break;
                    case 2:
                        CrearPersonaje impresion = new CrearPersonaje();
                        impresion.imprimir();
                        break;
                    case 3:
                        Lucha luchar = new Lucha();
                        luchar.SeleccionPersonajes();
                        break;
                    case 4:
                        System.out.println(color.getANSI_GREEN() + "¡Regresa pronto!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println(color.getANSI_RED() + "Opcion no valida." + "\u001B[0m");
                        System.out.println();
                        entero = false;
                        break;
                }
            } else {
                System.out.println(color.getANSI_RED() + "Error, vuelve a intentarlo...." + color.getAnsiReset());
            }
            input.nextLine();
        } while (!entero);
        Inicio();
    }


}


