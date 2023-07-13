package com.ferragnez.party;

import java.util.Scanner;

public class WhileCheckGuest {
    public static void main(String[] args) {
        // definisco le variabili
        String guestName;
        boolean invite = false;

        // Definisco l'array
        String[] guets = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // definisco lo scanner per chiedere l'input all'utente
        Scanner scan = new Scanner(System.in);

        // chiedo all'utente come si chiama
        System.out.println("Qual è il tuo nome: ");
        guestName = scan.nextLine();

        // per sapere se il nome è incluso nell'array uso un ciclo while (bonus)
        // dichiaro ed inizio un contatore uguale a 0

        int i = 0;

        // ciclo while

       while (i < guets.length) {
           if (guestName.equals(guets[i])) {
               invite = true;
               break;

           }
           i++;
       }
        // se il boolean è true, benvenuto alla festa, altrimenti se ne vada.
        if (invite) {
            System.out.println("Benvenuto alla festa dei Ferragnez!");

        } else {
            System.out.println("Il suo nome non è nella lista, la prego di andarsene!");
        }

        scan.close();

    }

}
