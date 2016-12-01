/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg12;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Garaxe {

    private static int numeroCoches;
    public Garaxe() {
    }
    public Garaxe(int numeroCoches) {
        this.numeroCoches = numeroCoches;

    }
    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }
}
