/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaldemo;

import java.util.Scanner;

public class RentalDemo {

    private static String ContNum1;
    private static int min1;
    private static String phoneNumber1;
    private static int equipmentType;
    
    public static void main(String[] args){
        Rental[] rentalArray = new Rental[3];
        Scanner sc = new Scanner(System.in);
        samysMotto();
        for(int i=0; i< rentalArray.length; i++) {
        	rentalArray[i] = new Rental();
            System.out.println("\nNumero contrato");
            ContNum1=sc.nextLine();
            System.out.println("Numero de contacto");
            phoneNumber1=sc.nextLine();
            System.out.println("Minutos ");
            min1=sc.nextInt();
            System.out.println("Enter the equipment type: \n"
            		+ "0.-jet ski\n"
            		+ "1.-pontoon boat\n"
            		+ "2.-rowboat\n"
            		+ "3.-canoe\n"
            		+ "4.-kayak\n"
            		+ "5.-beach chair\n"
            		+ "6.-umbrella\n"
            		+ "7.-other\n");
            equipmentType = sc.nextInt();
            rentalArray[i].setMinutes(min1);
            rentalArray[i].setContractNumber(ContNum1);
            rentalArray[i].setEquipmentType(equipmentType);
            rentalArray[i].setPhoneNumber(phoneNumber1);
            rentalArray[i].display(min1);
            sc.nextLine();
        }

        sc.close();
    
}
    public static void compare(Rental x, Rental y){
        if(x.getMinutes()==y.getMinutes()){
            System.out.println("\nLos tiemops de renta son iguales de "+
                    x.getContractNumber()+ " y "+y.getContractNumber()+
                    " y la cantidad de minutos es "+ x.getMinutes());
        }else if(x.getMinutes()>y.getMinutes()){
            System.out.println("El mayor tiempo es"+ x.getContractNumber()+
                    "\n  de duracion "+ x.getMinutes() +
                    " \n horas :"+ x.getMinutes()/60+" \nminutos "+
                    x.getMinutes()%60);
        }else {
            System.out.println("El mayor tiempo es"+ y.getContractNumber()+
                    " \n de duracion "+ y.getMinutes()+ 
                    " \n horas :"+ y.getMinutes()/60+" \nminutos "+y.getMinutes()%60);
        }
    }
    public static void samysMotto() {
            System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
			   "Ss  Sammy's makes it fun in the sun   Ss\n"+
			    "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
	}
}
