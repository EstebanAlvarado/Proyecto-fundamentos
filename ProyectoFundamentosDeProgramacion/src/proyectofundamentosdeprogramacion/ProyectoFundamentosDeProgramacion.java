/*Integrantes: -Esteban Alvarado 
               -Mauricio Gutierrez
               -Diego Padilla
*/

/*En este programa usted debera crear una cuenta en el cajero automático portátil del banco ESTAFABANK, totalmente innovador
a todo lo que has visto anteriormente, para poder ingresar. Cuando ya este creada su cuenta, se le permitira realizar 4 opciones:

Depositar, retirar y consultar saldo, ademas de poder enviar una recomendación al banco, una opción que es única y totalmente
innovadora, no la vas a poder ver en ningún otro cajero automático.*/
package proyectofundamentosdeprogramacion;

import java.util.Scanner;

//Acontinuación el codigo del programa.
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
        int opcion=0;
        int dinero;
        int rutDestinatario;
        int saldo = 10000;
        int deposito;
        String recomendacion;

        Scanner entrada = new Scanner(System.in);
        //En esta linea de codigo utilizamos while con la condicion de que la opcion escogida sea distinta a la opcion numero 3
        while (opcion !=3) {
            System.out.println("Menú Principal ESTAFABANK");
            System.out.println("Elija qué desea realizar");
            System.out.println(" 1. Ingresar");
            System.out.println(" 2. Crear un usuario");
            System.out.println(" 3. Salir del sistema");
            opcion = entrada.nextInt();
            //Utilizacion de un switch para definir las distintas opciones del menu del cajero.
            switch (opcion) {
                case 1:

                    System.out.print("Ingrese el R.U.T: ");
                    rut = entrada.nextInt();
                    entrada.nextLine();

                    //Utilizacion de if para combrobar que el rut ingresado sea el mismo al momento de crear la cuenta.
                    if (rut == rutAlmacenado) {
                        System.out.print("Ingrese clave: ");
                        clave = entrada.nextLine();
                        //Utilizacion de if para comprobar que la clave ingresada sea la misma al momento de crear la cuenta.
                        if (clave.equals(claveAlmacenada)) {
                            //Utilizacion de while que define que si se ingresa la opcion 5 dara por finalizada la operacion y volvera al menu principal de ESTAFABANK.
                            while (opcion != 5) {
                                System.out.println("Bienvenido, ¿qué es lo que desea realizar?");
                                System.out.println("1. Retirar dinero");
                                System.out.println("2. Depositar dinero");
                                System.out.println("3. Consultar saldo");
                                System.out.println("4. Enviar una recomendación a nuestro banco");
                                System.out.println("5. Salir al Menú Principal");
                                opcion = entrada.nextInt();
                                //Se usa otra vez la estructura swtich para visualizar las opciones que tiene el usuario al ingresar con su usuario.
                                switch (opcion) {
                                    case 1:
                                        System.out.println("¿Cuánto desea retirar?: ");
                                        dinero = entrada.nextInt();
                                        //Verificacion de que el dinero en la cuenta sea mayor a 0.
                                        if (dinero > 0) {
                                            //Verificacion de que el saldo retirado sea igual o mayor al dinero total de la cuenta.
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
                                        //Se define el maximo y minimo de cifras para el rut del destinatario. 
                                        if (rutDestinatario < 99999999 && rutDestinatario > 1111111) {

                                            //Se comprueba si el rut del destinatario sea igual al rut ingresado.
                                            if (rutDestinatario == rut) {

                                                System.out.print("Ingrese monto a depositar: ");
                                                deposito = entrada.nextInt();
                                                //Comprueba que el monto depositado sea mayor a 0.
                                                if (deposito > 0) {
                                                    System.out.println("Muchas gracias por preferirnos");
                                                    saldo = saldo + deposito;
                                                } else {
                                                    System.out.println("El monto ingresado no es válido");
                                                }
                                            //Si el rut ingresado es distinto se le depositara al rut ingresado
                                            } else {
                                                System.out.print("Ingrese monto a depositar: ");
                                                deposito = entrada.nextInt();
                                                //Comprueba que el monto depositado sea  mayor a 0.
                                                if (deposito > 0) {
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

                    //Se define la cantidad maxima y  minima de cifras que permite el programa para registrar el rut.
                    if (rutAlmacenado < 99999999 && rutAlmacenado > 1111111) {
                        System.out.print("Cree una contraseña: ");
                        claveAlmacenada = entrada.nextLine();

                        System.out.print("Ingrese la contraseña otra vez: ");
                        contraseña = entrada.next();

                        //Verifica que la primera contraseña ingresada sea igual a la segunda ingresada.  
                        if (contraseña.equals(claveAlmacenada)) {

                            System.out.println("Gracias por crear una cuenta en banco ESTAFABANK");
                        } else {
                            System.out.println("Las contraseñas no son iguales");
                        }
                    } else {
                        System.out.println("R.U.T no válido");
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego");
            }
        }

    }
}
    
    
    

