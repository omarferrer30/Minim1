package edu.upc.dsa.models;

public class Partida {
    String user_id;
    String id;
    String game_id;
    String date;
    boolean partida_en_curso;
    int actual_level;
    int points;


    public Partida(String game_id, String user_id){
        this.actual_level = 1;
        this.points = 50;
    }

    public Partida() {

    }

    public String GetId(){ return id;}
    public String GetUserId(){ return user_id;}
    public String GetGameId(){ return game_id;}
    public String GetDate(){ return date;}
    public boolean GetPartidaenCurso(){return partida_en_curso;}
    public int GetActualLevel(){return actual_level;}
    public int GetPoints(){return points;}

}