/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marcador;

import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class Marcador {

    /**
     * @param args the command line arguments
     */
    String puntos[]={"LOVE","FIFTEEN","THIRTY","FOURTY","ADVANTAGE"};
    int player1=0,player2=0;
    public static void main(String[] args) {
        // TODO code application logic here
        int jugador = Integer.parseInt(JOptionPane.showInputDialog("jugador: "));
    }
    
}
