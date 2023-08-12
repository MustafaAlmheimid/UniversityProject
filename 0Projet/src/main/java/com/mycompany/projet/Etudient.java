/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet;

/**
 *
 * @author user
 */
public class Etudient {

    private String etudiantNom;
    private String etudiantPrenom;
    private String etudiantDateBirdth;
    private String etudiantId;
    private String finalNote;

    public Etudient(String etudiantNom, String etudiantPrenom, String etudiantDateBirdth, String etudiantId, String finalNote) {
        this.etudiantNom = etudiantNom;
        this.etudiantPrenom = etudiantPrenom;
        this.etudiantDateBirdth = etudiantDateBirdth;
        this.etudiantId = etudiantId;
        this.finalNote = finalNote;
    }

    Etudient() {

        this.etudiantNom = "";
        this.etudiantPrenom = "";
        this.etudiantDateBirdth = "";
        this.etudiantId = "";
        this.finalNote = "";

    }

    public String getEtudiantNom() {
        return etudiantNom;
    }

    public String getEtudiantPrenom() {
        return etudiantPrenom;
    }

    public String getEtudiantDateBirdth() {
        return etudiantDateBirdth;
    }

    public String getEtudiantId() {
        return etudiantId;
    }

    public String getFinalNote() {
        return finalNote;
    }

    public void setEtudiantNom(String etudiantNom) {
        this.etudiantNom = etudiantNom;
    }

    public void setEtudiantPrenom(String etudiantPrenom) {
        this.etudiantPrenom = etudiantPrenom;
    }

    public void setEtudiantDateBirdth(String etudiantDateBirdth) {
        this.etudiantDateBirdth = etudiantDateBirdth;
    }

    public void setEtudiantId(String etudiantId) {
        this.etudiantId = etudiantId;
    }

    public void setFinalNote(String finalNote) {
        this.finalNote = finalNote;
    }

}
