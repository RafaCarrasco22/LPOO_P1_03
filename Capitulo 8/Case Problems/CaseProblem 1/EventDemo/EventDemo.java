/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventdemo;

import java.util.Scanner;

public class EventDemo {

    private static String NEvent;
    private static int numberOfGuest;
    private static String phoneNum1;
    private static int eventType;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Motto();
        Event eventArray[] = new Event[3];
        for(int i =0; i<eventArray.length; i++) {
            boolean condi = false;
            System.out.println("\nNumero de evento");
            NEvent=sc.nextLine();
            
            do{
            if(condi){
                System.out.println("Los invitados deben ser >5 y <100");
            }
            System.out.println("Numero invitados (>5 & <100)");
            numberOfGuest=sc.nextInt();
            condi = true;
        }while(numberOfGuest <5 || numberOfGuest > 100);
            sc.nextLine();
            System.out.println("Enter the event type\n"
            		+ "0.- wedding\n"
            		+ "1.- baptism\n"
            		+ "2.- birthday\n"
            		+ "3.- corporate\n"
            		+ "4.-other");
            
            eventType = sc.nextInt();
            sc.nextLine();
            System.out.println("Numero de telefono de contacto para evento1:");
            phoneNum1=sc.nextLine();
            eventArray[i] = new Event(NEvent, numberOfGuest);
            eventArray[i].setPhoneNumber(phoneNum1);
            eventArray[i].setEventType(eventType);
            eventArray[i].display(numberOfGuest);
        }
        sc.close();
        
   
    }
    
    
    public static void compare(Event evento1, Event evento2){
         
        if(evento1.getGuest()==evento2.getGuest()){
            System.out.println("The events are same "+ evento1.getEventNumber()+ " and "+evento2.getEventNumber()+" and the number of guests are "+evento1.getGuest());
        }else if(evento1.getGuest()>evento2.getGuest()){
            System.out.println("The Larger event is"+ evento1.getEventNumber()+  " and the number of guests are "+ evento1.getGuest());
        }else {
            System.out.println("The Larger event is "+ evento2.getEventNumber()+ " and the number of guests are "+ evento2.getGuest());
        }
    }
    public static void Motto() {
        System.out.println("************************************************");
        System.out.println("* Carly's makes the food that makes it a party *");
        System.out.println("************************************************");		
    } 
}
