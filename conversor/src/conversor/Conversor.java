package conversor;
import java.util.Scanner;

public class Conversor {
    //Metodo de conversion de Farenheit a Celsius
    private static double FarenheitToCelsius () {
        Scanner opcion = new Scanner (System.in);
        System.out.println("Introduce los grados Farenheit");
        double F = opcion.nextInt();
        double C= (F - 32) / 1.8;
        return C;
    }
    //Metodo de conversion de Celsius a Farenheit
    private static double CelsiusToFarenheit () {
        Scanner opcion = new Scanner (System.in);
        System.out.println("Introduce los grados Celsius");
        double C = opcion.nextInt();
        double F = (( 1.8 ) / C ) + 32;
        return F;
    }
    public static void main(String[] args) {
        //Declaremos variable de bucle principal
        int x = 1;
        //Iniciamos bucle principal
        while (x==1){
        //Pedimos por pantalla Una opcion
        Scanner opcion = new Scanner (System.in);
        System.out.println("Introduce:\n1 Para convertir Celsius en Farenheit\n2 Para convertir Farenheit en Celsius");
        int select = opcion.nextInt();
        //Bucle switch para segun eleccion realizar un metodo o otro
        switch (select) {
            
            case 1 : 
                double resultado = CelsiusToFarenheit ();
                System.out.println(+resultado);
                break;
            case 2 :
                double resultado2 = FarenheitToCelsius ();
                System.out.println(+resultado2);
                break;
            //En caso de elegir un numero distinto a las opciones salta mensaje de error    
            default : System.out.println("El nuemro es incorrecto");
        }
        //Preguntamos por pantalla si quiere volver a ejecutar el programa
        System.out.println("Quieres volver a ejecutrarlo?\n1 - Si\n2 - No");
        int repetir = opcion.nextInt();
        //Si la eleccion es 1 se le suma 0 al bucle principal por tanto se repite el programa
        if( repetir == 1){
        x+=0;
        }
        //Si la eleccion es 2 se le suma 1 al bucle principal por tanto sale del programa
        else if (repetir == 2){
        x+=1;
        }
        //Con cualquier otro numero indica un mensaje de error
        else {
        System.out.println("Numero erroneo");
        break;}
    }
    }
        
    }
    

