/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c1_Presentacion;

import VentaAutomoviles.c1_Presentacion.Mantenedores.FormGestionarAutomovil;

/**
 *
 * @author MyOS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormGestionarAutomovil formGestionarAutomovil= new FormGestionarAutomovil(null, true);
        formGestionarAutomovil.setVisible(true);
    }
    
}
