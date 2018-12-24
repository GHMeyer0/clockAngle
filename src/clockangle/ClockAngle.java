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
        //variaveis
        int hora, minuto, opc;
        long angulo;
        Calendar gc = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        Date date = new Date();
        
        // Menu de decisão
        System.out.println("/======================================================\\");
        System.out.println("| Calcular o angulo da hora atual ou informar uma hora?|");
        System.out.println("|         1 - Hora atual | 2 - Informar Hora           |");
        System.out.println("\\======================================================/");
        opc = in.nextInt();

        // Setar hora atual
        if(opc == 1){
            gc.set(gc.HOUR, date.getHours());
            gc.set(gc.MINUTE, date.getMinutes());
        }

        // Setar hora definida pelo usuario
        else if( opc == 2){
            System.out.println("| Informe a Hora e os minutos com espaço. ex: 22 59 |");
            hora = in.nextInt();
            minuto = in.nextInt();
            gc.set(gc.HOUR,hora);
            gc.set(gc.MINUTE,minuto);
        }
        else{
            System.out.println("Opção Invalida");
            System.exit(opc);
        }
        //chama o metodo que calcula o algulo entre o ponteiro de minutos e horas
        angulo = retornaAnguloRelogio(gc);
        System.out.println("O Angulo entre os ponteiros é de: "+ angulo); 
    }

    //Metodo para calcular o algulo
    static public long retornaAnguloRelogio(Calendar horario)
    {
        //Calcula posição do ponteiro de hora
        int angHora = horario.get(horario.HOUR)*30; 
        //calcula possição do ponteiro de minuto
        int angMinuto = horario.get(horario.MINUTE)*6;
        long ang;
        //calcula angulo
        if (angHora >= angMinuto){
            ang = angHora-angMinuto;    
        }
        else{
            ang = angMinuto - angHora;
        }
        return ang;
    };    
    
}
