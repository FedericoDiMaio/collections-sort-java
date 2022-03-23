package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
Creare una lista di 3 libri contenente: titolo, autore e anno di pubblicazione.
Stampare a video titolo e anno di pubblicazione ordinati per anno.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("lista libri");
        Scanner tastiera = new Scanner(System.in);
        ArrayList<Libro> biblioteca = new ArrayList<Libro>();
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("inserisci titolo: ");
                String titolo = tastiera.nextLine();

                System.out.println("inserisci autore: ");
                String autore = tastiera.nextLine();

                System.out.println("inserisci anno");
                int anno = Integer.parseInt(tastiera.nextLine());

                Libro obj = new Libro(titolo, autore, anno);
                biblioteca.add(obj);
            }
            System.out.println("la lista dei libri presenti in biblioteca é:");
            for (Libro uno : biblioteca) {
                System.out.println(uno.toString());
            }
            System.out.println("la lista dei libri presenti in  bibilioteca in ordine crescente per anno è:");
            Collections.sort(biblioteca, new Libro.annoComparator());
            for (Libro uno : biblioteca) {
                System.out.println(uno.toString());
            }
        } catch (NumberFormatException message) {
            System.err.println("errore durante inserimento dati.....programma terminato!");
            message.printStackTrace();
        }
        tastiera.close();

    }
}


