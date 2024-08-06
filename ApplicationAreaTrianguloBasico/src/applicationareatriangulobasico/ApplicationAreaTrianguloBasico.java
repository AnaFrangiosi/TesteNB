package applicationareatriangulobasico;
import java.util.Locale;
import java.util.Scanner;
public class ApplicationAreaTrianguloBasico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Comando para alterar a apresenta��o de dados conforme regi�o escolhida.
        double xBase, xAltura, yBase, yAltura;
        System.out.println("Inserir base do tri�ngulo X: ");
        xBase = ler.nextDouble();
        System.out.println("Inserir Altura do tri�ngulo X: ");
        xAltura = ler.nextDouble();
        System.out.println("Inserir base do tri�ngulo Y: ");
        yBase = ler.nextDouble();
        System.out.println("Inserir Altura do tri�ngulo Y: ");
        yAltura = ler.nextDouble();
        
        double areaX = (xBase * xAltura) / 2.00;
        double areaY = (yBase * yAltura) / 2.00;
        System.out.printf("�rea do tri�ngulo X: %.2f%n", areaX);
        System.out.printf("�rea do tri�ngulo Y: %.2f%n", areaY);
        if (areaX > areaY){
            System.out.println("Maior �rea tri�ngulo X");
        }
        else{
            System.out.println("Maior �rea tri�ngulo Y");
        }
        ler.close();
    }
    
}
