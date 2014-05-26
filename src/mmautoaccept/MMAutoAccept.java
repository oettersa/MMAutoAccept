/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mmautoaccept;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TODO:    1. System tray icon and functionality. (low priority)
 * 
 * changelog:   1.0 basic functionality
 *              1.1 added global hotkeys
 *              1.2 added minimize and close animations, disabled start if program isn't running, displays resolution on top bar, can't run multiple instances (4/25/14)
 *              1.2.1 fixed dota2.exe changed to dota.exe so that the start is not greyed out (5/25/14)
 * 
 * @version 1.2.1 May 25, 2014 (added Global HotKeys)
 * @author Simon Oetter
 */
public class MMAutoAccept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MMAutoAcceptGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MMAutoAcceptGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MMAutoAcceptGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MMAutoAcceptGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MMAutoAcceptGUI m;
                try {
                    m = new MMAutoAcceptGUI();
                    
                    m.setVisible(true);
                    m.setLocationRelativeTo(null);
                } catch (IOException ex) {
                    Logger.getLogger(MMAutoAccept.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }  
}
