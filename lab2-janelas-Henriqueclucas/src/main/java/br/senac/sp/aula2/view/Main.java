/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula2.view;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author fernando.fernandes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        UIManager.setLookAndFeel(new WindowsLookAndFeel ());
        JFrameCustomizadoView telaInicial = new JFrameCustomizadoView();
        telaInicial.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        telaInicial.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger (Main.class.getName()).log ( Level.SEVERE, null, ex);}
        
    }
    
}
