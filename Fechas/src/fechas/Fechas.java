package fechas;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fechas {

    private static int Bisiesto(int x) {
        int c = 0;
        if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0)) {
            c += 1;
        } else {
            c += 0;
        }

        return c;
    }
    
    private static int Conversor (int x1, int x2, int x3 ){
        int resultado = 0;
        int x = 0;
        int dias_mes = 0;
        double dias_any = 0;
        
        dias_any = 365.25 * (x1 - 1);
        int z = (int)dias_any;
        
        if( Bisiesto(x1) == 1 && x2>=3){
        x+= 1;
        }

        
        switch (x2){
            case 1: dias_mes = 0; //Enero
            break;
            case 2: dias_mes = 31; //Febrero
            break;
            case 3: dias_mes = 59; //Marzo
            break;
            case 4: dias_mes = 90; //Abril
            break;
            case 5: dias_mes = 120; //Mayo
            break;
            case 6: dias_mes = 151; //Junio
            break;
            case 7: dias_mes = 181; //Julio
            break;
            case 8: dias_mes = 212; //Agosto
            break;
            case 9: dias_mes = 243; //Septiembre
            break;
            case 10: dias_mes = 273; //Octubre
            break;
            case 11: dias_mes = 304; //Noviembre
            break;
            case 12: dias_mes = 334; //Diciembre
            break;
        }
        resultado = z + dias_mes + x3 + x;
        return resultado;
    }

    public static void main(String[] args) {
        GregorianCalendar data = new GregorianCalendar();
        int dia = (data.get(GregorianCalendar.DATE));
        int mes = (data.get(GregorianCalendar.MONTH) + 1);
        int any = (data.get(GregorianCalendar.YEAR));
        Scanner valor = new Scanner(System.in);

        System.out.println("Fecha de hoy: " + dia + "/" + mes + "/" + any);
        System.out.println(data.getTime());

        System.out.println("Intruduce un dia:  ");
        int dia2 = valor.nextInt();

        System.out.println("Intruduce un mes:  ");
        int mes2 = valor.nextInt();

        System.out.println("Intruduce un año:  ");
        int any2 = valor.nextInt();

        System.out.println("Fecha introducida: " + dia2 + "/" + mes2 + "/" + any2);

        switch (Bisiesto(any2)) {

            case 1:
                System.out.println("El año es bisiesto");
                break;
            case 0:
                System.out.println("Este año no es bisiesto");
                break;
        }
        
        
        int dias_actual = Conversor (any,mes,dia );
        int dias_puesta = Conversor (any2,mes2,dia2 );
        
        System.out.println("Dias acutales: "+dias_actual);
        System.out.println("Dias introducidos: "+dias_puesta);
        
        if (dias_actual == dias_puesta){
        System.out.println("La fecha es la misma");
        } else if (dias_actual>dias_puesta){
          int diferencia = dias_actual - dias_puesta;
          System.out.println("Faltan "+diferencia+" dias para llegar a la fecha actual");
        } else {
          int diferencia = dias_puesta - dias_actual;
          System.out.println("Pasan "+diferencia+" dia de la fecha actual");
        }
    }

}
