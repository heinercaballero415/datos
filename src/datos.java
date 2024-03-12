import javax.swing.*;
import java.util.Scanner;

public class datos {
    public static void main(String[] agrs) {
   Scanner entrada = new Scanner(System.in);
int item;
int suma,resta,mult;
int n1,n2,n3,n4,n5;


System.out.println("bienvenido ");
System.out.println("porfavor ingrese los datos");
System.out.println("dato numero 1");
 n1 = entrada.nextInt();
System.out.println("dato numero 2");
 n2 = entrada.nextInt();
System.out.println("dato numero 3");
 n3 = entrada.nextInt();
 System.out.println("dato numero 4");
 n4 = entrada.nextInt();
 System.out.println("dato numero 5");
 n5 = entrada.nextInt();

      item =JOptionPane.showConfirmDialog(null, "porfavor ingrese "+ "\n" + "1. sumar" + "\n" + "2. restar" + "\n" + "3. multiplicar" + "\n" + "4. salir del programa");

while (item != 5){
switch (item){
        case 1:
            JOptionPane.showMessageDialog(null, "a escogido la obcion de sumar ");
            suma = (n1 + n2 + n3 + n4 + n5);
        JOptionPane.showMessageDialog(null,"el resultado de su suma" + suma);
   break;
            case 2:
                JOptionPane.showMessageDialog(null,"a escogido la obcion de restar");
                resta = (n1 - n2 );
                JOptionPane.showMessageDialog(null,"el resultado de su resta es " + resta);
                break;

    case 3:
        JOptionPane.showMessageDialog(null, "a escogido la obcion de multiplicar");
        mult = (n1 * n2 * n3 * n4);
        JOptionPane.showMessageDialog(null, "el resultado de su multiplicacion" + mult);

    break;
    case 4:
        JOptionPane.showMessageDialog(null, "sus datos son " + "\n" +
                "dato 1" + n1 + "\n" + "dato 2" + n2 + "\n" + "dato 3" + n3 + "\n" +
                "dato 4" + n4 + "\n" + "dato 5 " + n5);

    break;
    case 5:
        JOptionPane.showMessageDialog(null,"a salido del programa");
        default:
            JOptionPane.showMessageDialog(null,"ese item no existe");




            }






    }
}
}
