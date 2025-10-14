package com.isw;

import com.isw.view.PantallaInscripcion;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class InscripcionTallerISW {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PantallaInscripcion().setVisible(true);
        });
    }
}
