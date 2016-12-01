/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg12;

/**
 *
 * @author acomesanavila
 */
public class Garaxe {
   private int numeroCoches;
   private String matricula;

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Garaxe(int numeroCoches, String matricula) {
        this.numeroCoches = numeroCoches;
        this.matricula = matricula;
    }
   
   public void numeroPlazas(){
    if (numeroCoches<5)    
            System.out.println("PLAZAS DISPOÑIBLES");
    else
            System.out.println("COMPLETO");
    }
    public void factura (){
        
    }
}
