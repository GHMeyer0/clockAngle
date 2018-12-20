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
        GregorianCalendar gc = new GregorianCalendar();
        /* gc.set(GregorianCalendar.YEAR, 2015);
        gc.set(GregorianCalendar.HOUR_OF_DAY, 5);
        gc.set(GregorianCalendar.MINUTE, 25);*/
        double angulo;
        angulo = retornaAnguloRelogio(gc);
        System.out.println(angulo); 
        System.out.println(gc); 
        System.out.println(gc.getTime());     
        System.out.println(gc.MINUTE);    
        int hora = gc.get(Calendar.HOUR_OF_DAY);
        System.out.println(hora); 


    }
    static public double retornaAnguloRelogio(GregorianCalendar time){
        
        int hora = time.get(Calendar.HOUR_OF_DAY);
        int minuto = time.get(Calendar.MINU);
        double angHora = hora*30;
        double angMinuto = minuto*4.5;
        
        for(int i = 0; i < 10; i++){

        }
        int ang = minuto;
        return angHora;
    };    
    
}
