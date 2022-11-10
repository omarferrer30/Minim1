package edu.upc.dsa.models;

import java.util.List;

public class Game {
    String id;
    String description;
    int num_niveles;
    public List<User> Usuarios_that_Played = null;

    public Game(String id, String description, int num_niveles) {
        this.id = id;
        this.description = description;
        this.num_niveles = num_niveles;
    }
    public String GetId(){ return id;}
    public String GetDescription(){ return description;}
    public int GetNiveles(){ return num_niveles;}
}
