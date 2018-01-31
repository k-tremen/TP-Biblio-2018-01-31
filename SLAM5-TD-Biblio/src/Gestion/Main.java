/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author k-tremen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tab[] = new String[4];
        ArrayList<Metier.Auteur> lesAuteurs = new ArrayList<Metier.Auteur>();
        try {
            String csvFile = "/home/k-tremen/NetBeansProjects/TP-Biblio-2018-01-31/SLAM5-TD-Biblio/src/CSV/Auteurs.csv";
            String delimiter = ",";
            String line = null;
            StringTokenizer strToken = null;
            BufferedReader bufferReader;
            int lineID = 0;
            int fieldID = 0;
//Ouvrir le fichier CSV
            bufferReader = new BufferedReader(new FileReader(csvFile));
//parcourir les lignes du fichier CSV
            while ((line = bufferReader.readLine()) != null) {
                lineID++;
                int i = 0;
//Parcourir les champs séparés par delimiter
                strToken = new StringTokenizer(line, delimiter);
                while (strToken.hasMoreTokens()) {
                    fieldID++;

                    tab[i] = strToken.nextToken();
                    i++;
                }
                fieldID = 0;
                lesAuteurs.add(new Metier.Auteur(tab[0], tab[1], tab[2], tab[3]));
            }
            for (int i = 0; i < lesAuteurs.size(); i++) {
                System.out.println(lesAuteurs.get(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
