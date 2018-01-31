/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author k-tremen
 */
public class Auteur {
    private String Nom;
    private String Prenom;
    private int AnneeNaissance;
    private int AnneeDeces;

    public Auteur(String Nom, String Prenom, int AnneeNaissance, int AnneeDeces) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.AnneeNaissance = AnneeNaissance;
        this.AnneeDeces = AnneeDeces;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getAnneeNaissance() {
        return AnneeNaissance;
    }

    public int getAnneeDeces() {
        return AnneeDeces;
    }
    
    //public Auteur getInstance(String nom, String prenom, int naissance, int deces) {
        
    //}

    @Override
    public String toString() {
        return Nom + " " + Prenom + " " + AnneeNaissance + "-" + AnneeDeces;
    }
    
}
