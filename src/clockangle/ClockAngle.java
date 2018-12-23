package clockangle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import com.sun.glass.ui.Pixels.Format;

/**
 *
 * @author ghmeyer0
 */
public class ClockAngle {

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD

    //variaveis
    
    
    public static void main(String[] args) 
    {

        Calendar cal = Calendar.getInstance(); 
        SimpleDateFormat hora = new SimpleDateFormat("hh");
        SimpleDateFormat minuto = new SimpleDateFormat("mm");

        long angulo;
=======
    public static void main(String[] args) 
    {
        int hora = 0, minuto = 0, angulo;
        GregorianCalendar gc = new GregorianCalendar();
>>>>>>> parent of f9571ce... Adicionado comentarios
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a hora e os minutos com espaço, ou deixe em branco para utilizar a hora atual: ");
        hora = in.nextInt();
        minuto = in.nextInt();
        if (hora == 0 && minuto == 0)
        {
            gc.get(gc.HOUR);
            System.out.println(gc.HOUR + "::::" + gc.MINUTE); 

        } 
        else 
        {
            gc.set(gc.HOUR,hora);
            gc.set(gc.MINUTE,minuto);
        }
<<<<<<< HEAD
        System.out.println(hora + ":" + minuto);
        //chama o metodo que calcula o algulo entre o ponteiro de minutos e horas
=======
>>>>>>> parent of f9571ce... Adicionado comentarios
        angulo = retornaAnguloRelogio(gc);
        System.out.println(hora + ":" + minuto); 

<<<<<<< HEAD
    //Metodo para calcular o algulo
    static public long retornaAnguloRelogio(GregorianCalendar time)
    {
        //Calcula posição do ponteiro de hora
        int angHora = time.get(Calendar.HOUR)*30; 

        //calcula possição do ponteiro de minuto
        int angMinuto = time.get(Calendar.MINUTE)*6;

        //calcula angulo
        long ang = angHora-angMinuto;
=======
    }
    static public int retornaAnguloRelogio(GregorianCalendar time)
    {
        int hora = time.get(Calendar.HOUR_OF_DAY);
        int minuto = time.get(Calendar.MINUTE);
        int angHora = hora*30;
        int angMinuto = minuto*6;
        
        int ang = angHora-angMinuto;
>>>>>>> parent of f9571ce... Adicionado comentarios
        return ang;
    };    
    
}
