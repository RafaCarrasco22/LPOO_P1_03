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
public class EvenEntryLoop {
    public void ex() {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        while(v!=999){
            System.out.print("Valor Par: ");
            v = sc.nextInt();
            if(v%2==0){
                System.out.println("Good job!");
            }else{
                System.out.println("Fatal Error");
            }
        }
    }
}
