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
        Coche car= new Coche ();
 
        double numeroCoches = Double.parseDouble(JOptionPane.showInputDialog("numero de coches no garaxe"));
        if (numeroCoches < 5) {
            System.out.println("PLAZAS DISPOÑIBLES");
            car.setMatricula(JOptionPane.showInputDialog("Matricula"));
            String matricula=car.getMatricula();
            int numHoras = Integer.parseInt(JOptionPane.showInputDialog("Numero de horas"));
            double coste= metodo.precio(numHoras);
            double  pago= Float.parseFloat(JOptionPane.showInputDialog("Pago"));
            double devolucion=metodo.devolucion(coste,pago);
            metodo.factura(numHoras, coste, pago, devolucion, matricula);
        } else {
            System.out.println("COMPLETO");
        }

    }
}
