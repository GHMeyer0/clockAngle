/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockangle;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author suporteti.01
 */
public class ClockAngle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora, minuto = 0, angulo;
        GregorianCalendar gc = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a hora e os minutos com espaço, ou deixe em branco para utilizar a hora atual: ");
        hora = in.nextIn
        minuto = in.nextInt();
        if (hora >= 0 && hora <=24){
            System.out.println("Hello");
        } else {
        }
        
        
        
        
        
        
        angulo = retornaAnguloRelogio(gc);
        System.out.println(hora + ":" + minuto); 


    }
    static public int retornaAnguloRelogio(GregorianCalendar time){
        
        int hora = time.get(Calendar.HOUR_OF_DAY);
        int minuto = time.get(Calendar.MINUTE);
        int angHora = hora*30;
        int angMinuto = minuto*6;
        
        int ang = angHora-angMinuto;
        
        for(int i = 0; i < 10; i++){

        }
        return ang;
    };    
    
}
