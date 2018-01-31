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
    private String AnneeNaissance;
    private String AnneeDeces;

    public Auteur(String Nom, String Prenom, String AnneeNaissance, String AnneeDeces) {
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

    public String getAnneeNaissance() {
        return AnneeNaissance;
    }

    public String getAnneeDeces() {
        return AnneeDeces;
    }
    
    //public Auteur getInstance(String nom, String prenom, int naissance, int deces) {
        
    //}

    @Override
    public String toString() {
        return "Auteur{" + "Nom=" + Nom + ", Prenom=" + Prenom + ", AnneeNaissance=" + AnneeNaissance + ", AnneeDeces=" + AnneeDeces + '}';
    }
    
}
