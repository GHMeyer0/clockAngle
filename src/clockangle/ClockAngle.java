package clockangle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author ghmeyer0
 */
public class ClockAngle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int hora = 0, minuto = 0, angulo;
        GregorianCalendar gc = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a hora e os minutos com espaço, ou deixe em branco para utilizar a hora atual: ");
        hora = in.nextInt();
        minuto = in.nextInt();
        if (hora == 0 && minuto == 0)
        {
          gc.getTime();  
        } 
        else 
        {
            gc.set(gc.HOUR,hora);
            gc.set(gc.MINUTE,minuto);
        }
        angulo = retornaAnguloRelogio(gc);
        System.out.println(hora + ":" + minuto); 

    }
    static public int retornaAnguloRelogio(GregorianCalendar time)
    {
        int hora = time.get(Calendar.HOUR_OF_DAY);
        int minuto = time.get(Calendar.MINUTE);
        int angHora = hora*30;
        int angMinuto = minuto*6;
        
        int ang = angHora-angMinuto;
        return ang;
    };    
    
}
