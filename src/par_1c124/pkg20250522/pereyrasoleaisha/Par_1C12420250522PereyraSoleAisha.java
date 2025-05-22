/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_1c124.pkg20250522.pereyrasoleaisha;

import java.util.Scanner;

/**
 *
 * @author Aisha
 */
public class Par_1C12420250522PereyraSoleAisha {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
     Scanner input = new Scanner(System.in);
        
        SistemaGestionExpedicionesEspaciales sistema = new SistemaGestionExpedicionesEspaciales();
      

        int opcion = 0;
        while(opcion != 7) {
            System.out.println("===== MENÚ DE GESTIÓN DE EXPEDICIONES ESPACIALES=====");
            System.out.println("1. Agregar nave. ");            
            System.out.println("2. Mostrar todas las naves. ");            
            System.out.println("3. Iniciar exploración");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas por año de lanzamiento");
            System.out.println("6. Mostrar naves ordenadas por tripulación");
            System.out.println("7. Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    sistema.agregarNave();
                    break;
                case 2:
                    sistema.mostrarNaves();
                    break;
                case 3:
                   sistema.iniciarExploracion();
                    break;
                case 4:
                    System.out.println("Sin resolver :)");
                case 5:
                    System.out.println("Sin resolver :)");
                case 6:
                    System.out.println("Sin resolver :)");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción incorrecta. ");
                    break;
            }
        }
        input.close();
    }   
}

