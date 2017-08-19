/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author Lopez Avila
 */
public class Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Setup st = new Setup(15, 30, 1);
        System.out.println("Hora Normal: " + st.getHour() + ":" + st.getMinute() + ":" + st.getSecond());
        st.setHour(20);
        st.setMinute(22);
        st.setSecond(45);
        System.out.println("Hora Nuevos Valores: " + st.getHour() + ":" + st.getMinute() + ":" + st.getSecond());
        st.backUp();
        System.out.println("Hora retrocedio 1 segundo: " + st.getHour() + ":" + st.getMinute() + ":" + st.getSecond());
        st.next();
        System.out.println("Hora Aumento 1 segundo: " + st.getHour() + ":" + st.getMinute() + ":" + st.getSecond());
        
        
    }
    
}
