
package applicationoptiondialog;

import javax.swing.JOptionPane;

/**
 *
 * @author ana.jfteixeira
 */
public class ApplicationOptionDialog {

    public static void main(String[] args) {
        Object[] cursos = {"ADM","MMD","TI","IOT"};
       JOptionPane.showOptionDialog(null,
               "Escolha um curso",
               "Cursos",
               1,
               3,
               null,
               cursos,
               null);
    }
    
}
