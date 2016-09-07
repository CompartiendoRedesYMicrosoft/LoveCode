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
public class ExcepcionSQL extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionSQL</code> without detail
     * message.
     */
    public ExcepcionSQL() {
    }

    /**
     * Constructs an instance of <code>ExcepcionSQL</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionSQL(String msg) {
        super(msg);
    }
}
