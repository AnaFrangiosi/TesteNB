package applicationareatriangulobasico;
import java.util.Locale;
import java.util.Scanner;
public class ApplicationAreaTrianguloBasico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Comando para alterar a apresentação de dados conforme região escolhida.
        double xBase, xAltura, yBase, yAltura;
        System.out.println("Inserir base do triângulo X: ");
        xBase = ler.nextDouble();
        System.out.println("Inserir Altura do triângulo X: ");
        xAltura = ler.nextDouble();
        System.out.println("Inserir base do triângulo Y: ");
        yBase = ler.nextDouble();
        System.out.println("Inserir Altura do triângulo Y: ");
        yAltura = ler.nextDouble();
        
        double areaX = (xBase * xAltura) / 2.00;
        double areaY = (yBase * yAltura) / 2.00;
        System.out.printf("Área do triângulo X: %.2f%n", areaX);
        System.out.printf("Área do triângulo Y: %.2f%n", areaY);
        if (areaX > areaY){
            System.out.println("Maior área triângulo X");
        }
        else{
            System.out.println("Maior área triângulo Y");
        }
        ler.close();
    }
    
}
