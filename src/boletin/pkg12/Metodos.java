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
public class Metodos {
        public double precio(int numHoras) {
        double horasExtra = 0;
        if (numHoras <= 3) {
            double coste = 1.5;
        } else {
            horasExtra = numHoras - 3;
        }
        double coste = 1.5 + horasExtra * 0.20;
        return coste;
    }

    public double devolucion(double coste,double pago) {

       double devolucion = pago - coste;
        return devolucion;   
    }
     public void factura(int Horas,double coste,double pago,double devolucion,String matricula) {
     System.out.println("factura: \n Matricula coche " + matricula + "\n tempo " + Horas + " h" + "\n precio " + coste + " €" + "\n cartos recibidos " + pago + " €" + " \n cartos devoltos " + devolucion + " €");
    }
}
