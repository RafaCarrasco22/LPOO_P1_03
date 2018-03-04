/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8PE;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class DivideStrings {
    String[] l = new String[20];
    String[] c  =new String[20];
   
    public void ex() {
        Scanner datos  = new Scanner(System.in);
        
        DivideStrings d = new DivideStrings();
        for(int i=0;i<20;i++){
            System.out.println("Ingrese cadena "+(i+1)+": ");
            String cadena = datos.nextLine();
            d.setString(cadena);
        }
        System.out.println("Ingrese: \n1 Palabras cortas\n2 Palabras largas");
        int opc = datos.nextInt();
        d.menu(opc);
        
    }
    
    public void setString(String cadena){
        int i1=0, j1=0;
        if(cadena.length()<=5){
            c[i1]=cadena;
            i1++;
        }
        else{
            l[j1]=cadena;
            j1++;
        }
    }
    
    public void getCor(){
        int i=0;
        if(c[i]==null){
            System.out.println("NOT FOUND");
        }
        else{
            while(i<20){
                if(c[i]!=null){
                    System.out.println(c[i]);
                    i++;
                }else{
                    i=20;
                }
            }
        }        
    }
    
    public void getLar(){
       int i=0;
        if(l[i]==null){
            System.out.println("NOT FOUND");
        }
        else{
            while(i<20){
                if(l[i]!=null){
                    System.out.println(l[i]);
                    i++;
                }else{
                    i=20;
                }
            }
        }   
    }
    
    public void menu(Integer opc){
        switch(opc){
            case 1:
                System.out.println("Cortas:");
                this.getCor();
                break;
            case 2:
                System.out.println("Largas:");
                this.getLar();
                break;
        }
    }
}
