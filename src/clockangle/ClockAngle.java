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

    //variaveis
    int hora = 0, minuto = 0, angulo = 0;
    
    public static void main(String[] args) 
    {
        
        GregorianCalendar gc = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a hora e os minutos com espaço, ou deixe em branco para utilizar a hora atual: ");
        hora = in.nextInt();
        minuto = in.nextInt();

        // Codição para pegar a hora atual caso não seja informado nenhum horario
        if (hora == 0 && minuto == 0)
        {
          gc.getTime();  
        } 
        // caso seja informado o horario, seta o mesmo no gc
        else 
        {
            gc.set(gc.HOUR,hora);
            gc.set(gc.MINUTE,minuto);
        }

        //chama o metodo que calcula o algulo entre o ponteiro de minutos e horas
        angulo = retornaAnguloRelogio(gc);
        System.out.println(hora + ":" + minuto); 
        System.out.println(angulo); 
    }

    //Metodo para calcular o algulo
    static public int retornaAnguloRelogio(GregorianCalendar time)
    {
        //Calcula posição do ponteiro de hora
        int angHora = time.get(Calendar.HOUR)*30; 

        //calcula possição do ponteiro de minuto
        int angMinuto = time.get(Calendar.MINUTE);*6;

        //calcula angulo
        int ang = angHora-angMinuto;
        return ang;
    };    
    
}
