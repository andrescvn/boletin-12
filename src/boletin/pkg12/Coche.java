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
public class Coche extends Garaxe {

    private String matricula;

    public Coche() {
        numeroCoches++;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String pedirMatricula() {
        return JOptionPane.showInputDialog("Matricula");
    }

}
