import java.util.Scanner;

public class notas {

    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);
        int item;
int num1,num2;
int mul,suma,ed,mult;
String nom;
int v = 10000;
int b,a,e;
        System.out.println(  "bienvenido");
        System.out.println("que desea realizar obcion 1 , 2 , 3");
item = entrada.nextInt();

switch (item){
    case 1:
        System.out.println("porfavor escriba un numero");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        mul = num1 * num2;
        suma = num1 + num2;
        System.out.println("resultado de la multiplicacion es" + mul);
        System.out.println("resultado de la suma" + suma);

        break;
    case 2:
        System.out.println("porfavor ingrese su nombre");
        nom =   entrada.nextLine();
        System.out.println("porfavor ingrese su edad");
        ed = entrada.nextInt();
        if (ed >= 18 ) {
            mult = ed * v;
            System.out.println("señor usuario el valor a pagar es" + mult);
        }
        else {

            System.out.println("señor usuario no es necesario que pague");
        }
        break;    case 3:
        System.out.println("porfavor ingrese la base del triangulo");
        b = entrada.nextInt();
        System.out.println("porfavor ingrese la altura del triangulo");
        a = entrada.nextInt();

            e = b * a /2;
        System.out.println("el area del triangulo es" + e);

    default:
        System.out.println("ese item no existe");



        }
}



    }
