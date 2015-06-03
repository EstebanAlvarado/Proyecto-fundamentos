/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofundamentosdeprogramacion;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ProyectoFundamentosDeProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clave;
        String claveAlmacenada = "";
        int rut;
        int rutAlmacenado = 0;
        String contraseña;
        int opcion;
        int dinero;
        int rutDestinatario;
        int saldo = 10000;
        int deposito;
        String recomendacion;

        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Menú Principal ESTAFABANK");
            System.out.println("Elija qué desea realizar");
            System.out.println(" 1. Ingresar");
            System.out.println(" 2. Crear un usuario");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:

                    System.out.print("Ingrese el R.U.T: ");
                    rut = entrada.nextInt();
                    entrada.nextLine();

                    if (rut == rutAlmacenado) {
                        System.out.print("Ingrese clave: ");
                        clave = entrada.nextLine();
                        if (clave.equals(claveAlmacenada)) {
                            while (opcion != 5) {
                                System.out.println("Bienvenido, ¿qué es lo que desea realizar?");
                                System.out.println("1. Retirar dinero");
                                System.out.println("2. Depositar dinero");
                                System.out.println("3. Consultar saldo");
                                System.out.println("4. Enviar una recomendación a nuestro banco");
                                System.out.println("5. Salir al Menú Principal");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        System.out.println("¿Cuánto desea retirar?: ");
                                        dinero = entrada.nextInt();
                                        if (dinero > 0) {
                                            if (dinero <= saldo) {
                                                System.out.println("Muchas gracias por preferirnos");
                                                System.out.println("Puede retirar su dinero");
                                                saldo = saldo - dinero;

                                            } else {
                                                System.out.println("Usted no dispone del saldo suficiente");
                                            }
                                        } else {
                                            System.out.println("El monto ingresado no es válido");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Ingrese R.U.T destinatario");
                                        rutDestinatario = entrada.nextInt();
                                        if (rutDestinatario < 99999999 && rutDestinatario > 1111111) {

                                            if (rutDestinatario == rut) {

                                                System.out.print("Ingrese monto a depositar: ");
                                                deposito = entrada.nextInt();
                                                if (deposito > 0) {
                                                    System.out.println("Muchas gracias por preferirnos");
                                                    saldo = saldo + deposito;
                                                } else {
                                                    System.out.println("El monto ingresado no es válido");
                                                }
                                            } else {
                                                System.out.print("Ingrese monto a depositar: ");
                                                saldo = entrada.nextInt();
                                                if (saldo > 0) {
                                                    System.out.println("Monto transferido a la cuenta ingresada, que tenga un buen día");
                                                } else {
                                                    System.out.println("Monto ingresado no válido");
                                                }
                                            }
                                        } else {
                                            System.out.println("El R.U:T ingresado no es válido");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Usted dispone de un total de $" + saldo);
                                        break;
                                    case 4:
                                        System.out.println("¿Qué desea recomendarnos para mejorar nuestros servicios?");
                                        entrada.nextLine();
                                        recomendacion = entrada.nextLine();
                                        System.out.println("Muchas gracias, sus comentarios son muy importantes para nosotros");
                                        break;
                                    case 5:
                                        System.out.println("Que tenga un buen día");
                                        break;
                                }
                            }
                        } else {
                            System.out.println("Contraseña incorrecta");
                        }
                    } else {
                        System.out.println("R.U.T inválido");
                    }

                    break;
                case 2:
                    System.out.print("Ingrese R.U.T(sin guión ni tampoco codigo verificador: ");
                    rutAlmacenado = entrada.nextInt();
                    entrada.nextLine();

                    if (rutAlmacenado < 99999999 && rutAlmacenado > 1111111) {
                        System.out.print("Cree una contraseña: ");
                        claveAlmacenada = entrada.nextLine();

                        System.out.print("Ingrese la contraseña otra vez: ");
                        contraseña = entrada.next();

                        if (contraseña.equals(claveAlmacenada)) {

                            System.out.println("Gracias por crear una cuenta en banco ESTAFABANK");
                        } else {
                            System.out.println("Las contraseñas no son iguales");
                        }
                    } else {
                        System.out.println("R.U.T no válido");
                    }
                    break;
            }
        }

    }
}
    
    
    

