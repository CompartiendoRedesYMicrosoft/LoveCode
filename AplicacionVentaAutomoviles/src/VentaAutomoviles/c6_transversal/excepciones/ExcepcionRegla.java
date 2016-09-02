/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c6_transversal.excepciones;

/**
 *
 * @author Hernan
 */
public class ExcepcionRegla extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionRegla</code> without detail
     * message.
     */
    public ExcepcionRegla() {
    }

    /**
     * Constructs an instance of <code>ExcepcionRegla</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionRegla(String msg) {
        super(msg);
    }
}
