/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6PE;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class RetirementGoal {
     public void ex() {
        Scanner sc = new Scanner(System.in);
        int anio;
        double ahorro;
      
        do {
            System.out.print("Anios antes de su retiro: ");
            anio = sc.nextInt();
      
            System.out.print("Ahorro anual estimado: ");
            ahorro = sc.nextDouble();
         
            if (anio < 1 || ahorro <= 0){
                System.out.println();
                System.out.println("ERROR: Ingresa los datos de nuevo.");
                System.out.println();
            }
        }while (anio < 1 || ahorro <= 0);
      
        System.out.println("\nTienes que ahorrar $"+(anio * ahorro));
    }
}
