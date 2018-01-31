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
public class Livre {
    private String Titre;
    private String Genre;
    private int AnneeSortie;
    private Auteur Auteur;

    public Livre(String Titre, String Genre, int AnneeSortie, Auteur Auteur) {
        this.Titre = Titre;
        this.Genre = Genre;
        this.AnneeSortie = AnneeSortie;
        this.Auteur = Auteur;
    }

    public String getTitre() {
        return Titre;
    }

    public String getGenre() {
        return Genre;
    }

    public int getAnneeSortie() {
        return AnneeSortie;
    }

    public Auteur getAuteur() {
        return Auteur;
    }

    @Override
    public String toString() {
        return "Livre{" + "Titre=" + Titre + ", Genre=" + Genre + ", AnneeSortie=" + AnneeSortie + ", Auteur=" + Auteur + '}';
    }
    
}
