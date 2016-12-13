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
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Garaxe garaxe = new Garaxe();
        Metodos metodo=new Metodos();
        
        String matricula;
        double pago,coste,devolucion;
        float numHoras;
        
        do{
            System.out.println("PLAZAS DISPOÑIBLES");
            
            Coche car= new Coche ();
            matricula=car.pedirMatricula();
            
            numHoras =metodo.pedirDato();
            while(numHoras<0)
            numHoras =metodo.pedirDato();
            
            coste= metodo.precio(numHoras);
            
            pago= metodo.pedirDato();
            while (pago<=1)
            pago=metodo.pedirDato();
            
            devolucion=metodo.devolucion(coste,pago);
            
            metodo.factura(numHoras, coste, pago, devolucion, matricula);
        }
        while (Garaxe.numeroCoches<5);    
            System.out.println("COMPLETO");
        }

    }
