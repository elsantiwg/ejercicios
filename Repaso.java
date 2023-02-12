package repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Repaso {

    public static void main(String[] args) {
        int opcion;
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1. Ejercicio 1 \n 2. Ejercicio 2 \n 3. Ejercicio 3 \n 4. Ejercicio 4 \n 5. Ejercicio 5 \n 6. Ejercicio 6 \n 7. Ejercicio 7 \n 8. Ejercicio 8 \n 0. Salir \n"));
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                default:
                case 0:
                    JOptionPane.showMessageDialog(null, "chao");
                    break;
            }
        } while (opcion != 0);
    }

    private static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los dos números es: " + suma);
    }

    private static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Ingrese el número final: ");
        int fin = sc.nextInt();
        System.out.print("Ingrese el valor de incremento: ");
        int incremento = sc.nextInt();

        while (inicio <= fin) {
            inicio += incremento;
            System.out.println("Serie" + inicio);
        }
    }

    private static void ejercicio3() {
        int num = 1;
        while (num <= 100) {
            System.out.println(num);
            num++;
        }

    }

    private static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = sc.nextInt();
        for (int i = 0; i <= valor; i++) {
            System.out.println(i);
        }
    }

    private static void ejercicio5() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = entrada.nextInt();

        // Proceso
        for (int i = 0; i <= valor; i += 3) {
            System.out.println(i);
        }
    }

    private static void ejercicio6() {
        String serVivo = JOptionPane.showInputDialog(null, "Ingrese un ser vivo:");
        if (serVivo.equalsIgnoreCase("humano")) {
            JOptionPane.showMessageDialog(null, "Reino: Animal");
        } else if (serVivo.equalsIgnoreCase("árbol")) {
            JOptionPane.showMessageDialog(null, "Reino: vegetal");
        } else if (serVivo.equalsIgnoreCase("perro")) {
            JOptionPane.showMessageDialog(null, "Reino: Animal");
        } else if (serVivo.equalsIgnoreCase("gato")) {
            JOptionPane.showMessageDialog(null, "Reino: Animal");
        } else if (serVivo.equalsIgnoreCase("pájaro")) {
            JOptionPane.showMessageDialog(null, "Reino: Animal");
        } else {
            JOptionPane.showMessageDialog(null, "Ser vivo no reconocido");
        }
    }

    private static void ejercicio7() {
        int num;
        do {
            String input = JOptionPane.showInputDialog(null, "Ingrese un número entre 1 y 7 o 0 para salir:");
            num = Integer.parseInt(input);
            switch (num) {
                case 1:
                    JOptionPane.showMessageDialog(null, "la nota musical es Do");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "la nota musical es Re");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "la nota musical es Mi");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "la nota musical es Fa");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "la nota musical es Sol");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "la nota musical es La");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "la nota musical es Si");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "el numero no esta entre las opciones");
                    break;
            }
        } while (num != 0);
    }

    private static void ejercicio8() {
        int CLAVESECRETA = 123;
        int intentos = 3;
        for (int i = 0; i < intentos; i++) {
            int claveIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la clave secreta:"));
            if (claveIngresada == CLAVESECRETA) {
                JOptionPane.showMessageDialog(null, "Acceso permitido");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado");
            }
        }
        if (intentos > 3) {
            JOptionPane.showMessageDialog(null, "Clave bloqueada");
        }
    }
}
