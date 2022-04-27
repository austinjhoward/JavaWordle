package Wordle.model;

import java.io.*;

public class Streak {

    private Integer streak;
    private Integer maxStreak;
    private Integer totalGamesPlayed;
    private String fileName;
    //#Streak
    //15
    //#Max Streak
    //3
    //#Jugadas
    //50
    public Streak(String fileName){
        this.fileName = fileName;
        this.readStreak();
    }

    public Integer getStreak() {
        return streak;
    }

    public Integer getMaxStreak() {
        return maxStreak;
    }

    public Integer getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public void incStreak(){
        this.streak++;
        this.refreshMaxStreak();
        this.incTotalGamesPlayed();
        this.writeStreak();
    }

    public void resetStreak(){
        this.streak = 0;
        this.incTotalGamesPlayed();
        this.writeStreak();
    }

    private void refreshMaxStreak(){
        if(this.streak > this.maxStreak) {
            this.maxStreak = this.streak;
        }
    }

    public void incTotalGamesPlayed(){
        this.totalGamesPlayed++;
    }
    private void readStreak() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.fileName));
            br.readLine();
            this.streak = Integer.parseInt(br.readLine());
            br.readLine();
            this.maxStreak = Integer.parseInt(br.readLine());
            br.readLine();
            this.totalGamesPlayed = Integer.parseInt(br.readLine());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeStreak(){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(this.fileName));
            pw.println("#Streak");
            pw.println(String.valueOf(this.streak));
            pw.println("#Max streak");
            pw.println(String.valueOf(this.maxStreak));
            pw.println("#Total games played");
            pw.println(String.valueOf(this.totalGamesPlayed));
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
