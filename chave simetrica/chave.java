import java.util.Scanner;
import javax.swing.text.html.parser.Parser;

public class chave {
    public static void main(String[] args) {

//***************TRABALHO REALIZADO PELOS ALUNOS DANIEL DE CASTRO PERES E LUCAS FREITAS  *******************************

// ESTANCIA DE CLASSES
        MultInversoModular m = new MultInversoModular();
        Scanner scan  = new Scanner(System.in);   

// 1.  dois números primos extensos, p e q;

        System.out.println("Digite o numero Primo P");
        int p = scan.nextInt();
        System.out.println("Digite o numero Primo Q");
        int q = scan.nextInt();
        
// 2.  Calculo n = p x q;
        int n = p * q;
        System.out.println("Resultado de n: " + n);

// 3.  z = (p – 1 ) x ( q –1); 
        int z = (p - 1) * ( q -1);
        System.out.println("Resultado de z: " + z);

// 4.  um número relativamente primo em relação a “z” e chame-o de “e”; 
        int e = 3;

//------------Calculo modular---------------
 m.ModuleInverso(e, 352);





















 
    }

}
