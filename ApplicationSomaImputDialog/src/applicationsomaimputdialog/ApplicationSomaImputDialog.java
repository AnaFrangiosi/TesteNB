
package applicationsomaimputdialog;

import javax.swing.JOptionPane;

/**
 *
 * @author ana.jfteixeira
 */
public class ApplicationSomaImputDialog {

    public static void main(String[] args) {
       String num1 = JOptionPane.showInputDialog(null,
               "Digite um número inteiro",
       "Adição", 3);
        String num2 = JOptionPane.showInputDialog(null,
               "Digite um número inteiro",
       "Adição", 3);
        int iN1 = Integer.parseInt(num1);
        int iN2 = Integer.parseInt(num2);
        int total = iN1 + iN2;
    }
    
}
