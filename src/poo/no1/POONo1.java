/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.no1;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class POONo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int horas = 0;
        double paga = 0;
        String nombre = null;
        double hora_normal = 0;

        System.out.println(" POR FAVOR INGRESE EL NOMBRE DEL TRABAJADOR: ");
        nombre = ingreso.nextLine();
        System.out.println(" DIGITE LAS HORAS TRABAJADAS: ");
        horas = ingreso.nextInt();
        System.out.println(" DIGITE EL VALOR DE LAS HORAS: ");
        hora_normal = ingreso.nextDouble();
        paga = calcular_paga(horas, hora_normal);

        System.out.println(" EL TOTAL A CANCELAR AL TRABAJADOR " + nombre + " POR " + horas + " HORAS REALIZADAS ES: " + paga);

    }

    public static double calcular_paga(int horas, double hora_normal){
    double totalpaga = 0;
   
    if( horas > 40 )
        {
          if (horas <= 48) {
            totalpaga = ((horas - 40) * hora_normal * 2) + (horas * hora_normal);
        } else {
            totalpaga = ((horas - 48) * hora_normal * 3)+((horas - 40)*hora_normal * 2)+(horas * hora_normal);
        }
            
        } else
            totalpaga  = horas * hora_normal;

    return totalpaga ;

}
}
