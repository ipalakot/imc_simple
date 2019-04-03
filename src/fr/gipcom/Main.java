package fr.gipcom;
import java.util.Scanner;


public class Main {

    //fonction de depart
    public static void main(String[] args) {
        Scanner affiche = new Scanner(System.in);
        int a, b;
        float inter, resultat;

        System.out.println("Entrez votre poids");

        a = affiche.nextInt();

        System.out.println("Entrer votre taille");

        b = affiche.nextInt();

        inter = (float)b /100;

        resultat = ((float)a)/(inter*inter);

        if(resultat < 16.5)
        {
            System.out.println("votre IMC est de :" + resultat + ", vous etes donc trop maigre");
        }
        else if(resultat >= 16.5 && resultat <18.5)
        {
            System.out.println("votre IMC est de :" + resultat + ", vous etes donc maigre");
        }
        else if(resultat >= 18.5 && resultat <25)
        {
            System.out.println("votre IMC est de :" + resultat + ", vous etes donc normale");
        }
        else if(resultat >= 25 && resultat <30)
        {
            System.out.println("votre IMC est de :" + resultat + ", vous etes donc en surpoids");
        }
        else if(resultat >= 30 && resultat <35)
        {
            System.out.println("votre IMC est de :" + resultat + ", vous etes donc obésité modéré");
        }
        else if(resultat > 35)
        {
            System.out.println("votre IMC est de :" + resultat + "vous etes donc obèse");
        }



    }
}

