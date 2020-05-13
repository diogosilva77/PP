/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_fp04;

/**
 *
 * @author dmanu
 */

public class PPFP04 {
    
     /**
     * @param args the command line arguments
     */
    
    static User user1, user2;
    public static void main(String[] args) {
        User user1 = null;
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[] {'B', 'r', 'u', 'n', 'o'};
        user1.email = new char[] {'b', 'm', 'o', '@', 'e', 's', 't', 'g', 'f', '.',
            'i', 'p', 'p', '.', 'p', 't'};


        System.out.println("--------USER 1--------");
        System.out.println("ID: ");
        System.out.println(user1.id);
        System.out.println("Name: ");
        System.out.println(user1.name);
        System.out.println("Email: ");
        System.out.println(user1.email);

        user2.id[0] = '3';
        user2.id[1] = '3';
        user2.id[2] = '2';
        user2.name = new char[] {'D', 'i', 'o', 'g', 'o'};
        user2.email = new char[] {'d', 's', '@', 'e', 's', 't', 'g', 'f', '.',
            'i', 'p', 'p', '.', 'p', 't'};

        System.out.println("--------USER 2--------");
        System.out.println("ID: ");
        System.out.println(user2.id);
        System.out.println("Name: ");
        System.out.println(user2.name);
        System.out.println("Email: ");
        System.out.println(user2.email);

        //2.2

        Expenses.carValues[0] = 20.0;
        Expenses.carValues[1] = 40.0;
        Expenses.carValues[2] = 60.0;
        Expenses.number1 = 3;

        Expenses.foodValues[0] = 10;
        Expenses.foodValues[1] = 25;
        Expenses.foodValues[2] = 38;
        Expenses.number2 = 3;

        System.out.println(Expenses.descriptionCar);
        System.out.println(User.expenses.descriptionCar);

        //2.3

        double totalCar = 0, totalFood = 0;
        for (int i = 0; i < 31; i++){
            if (User.expenses.carValues[i] > 0){
            System.out.println("Dia: " + i + " Valor: " + User.expenses.carValues[i] + "€");

            totalCar += User.expenses.carValues[i];
            User.expenses.number1++;
            }

            if (User.expenses.foodValues[i] > 0){
                System.out.println("Dia: " + i + " Valor: " + User.expenses.foodValues[i] + "€");
                
                totalFood += User.expenses.foodValues[i];
                User.expenses.number2++;
            }

        }
    }
}