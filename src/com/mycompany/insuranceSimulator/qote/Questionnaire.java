package com.mycompany.insuranceSimulator.qote;

import com.mycompany.insuranceSimulator.customer.Customer;

import java.util.Scanner;


public class Questionnaire {
    private Integer type;
    private char response;
    // private char hasChild;
    public Scanner input = new Scanner(System.in);

    public Customer questionCustomer() {

        Customer aCustomer = new Customer();
        System.out.println("Quel est votre nom?");
        aCustomer.setLastName(input.nextLine());

        System.out.println("Quel est votre prénom?");
        aCustomer.setFirstName(input.nextLine());

        System.out.println("Quel est votre date de naissance?");
        aCustomer.setDateOfBirth(input.nextLine());

        while (aCustomer.getMarried() == null) {
            System.out.println("Êtes-vous marié?");
            response = input.next().charAt(0);
            if (response == 'o') {
                aCustomer.setMarried(true);
            } else if (response == 'n') {
                aCustomer.setMarried(false);
            }
        }
        while (aCustomer.getHasChildren() == null) {
            System.out.println("Avez-vous des enfants?");
            response = input.next().charAt(0);
            if (response == 'o') {
                aCustomer.setHasChildren(true);
            } else if (response == 'n') {
                aCustomer.setHasChildren(false);
            }
        }
            while (aCustomer.getContractType() == null) {
                System.out.println("""
                        A quel type de contrat voulez-vous souscrire:
                        1: habitation
                        2: voiture
                        3: moto
                        """);
                aCustomer.setContractType(input.nextInt());
            }

        return aCustomer;
    }


}
