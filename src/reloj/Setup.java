/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author Bryan Lopez Avila
 */
public class Setup {
    private int hour, minute, second;

    public Setup(int hour, int minute, int second) {
        this.hour = (hour < 0 || hour > 23) ? 0 : hour ;
        this.minute = (minute < 0 || minute > 59) ? 0 : minute;
        this.second = (second < 0 || second > 59) ? 0 : second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void next(){
        if (this.second < 59) {
            this.second++;
        }else{
            this.minute++;
            if (this.minute > 59) {
                this.setMinute(0);
                this.hour++;
            }
            this.setSecond(0);
        }
    }
    
    public void backUp(){
        if (this.second > 0 && this.second <= 60) {
            this.second--;
        }else{
            this.minute--;
            if (this.minute < 0) {
                this.setMinute(59);
                this.hour--;
            }
            this.setSecond(59);
        }
    }
}
