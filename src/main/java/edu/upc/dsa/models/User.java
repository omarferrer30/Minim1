package edu.upc.dsa.models;

import java.util.List;

public class User {
    String id;
    int partidas_jugadas;
    List<Partida> PartidasJugadas = null;
    boolean partida_en_curso;
    String id_partida_en_curso;

    public User(){}

    public String GetId(){return id;}
    public int GetNumPartidasJugadas(){return partidas_jugadas;}
    public List<Partida> GetListaPartidas(){return PartidasJugadas;}
    public String GetPartidaenCursoId(){return id_partida_en_curso;}
    public boolean GetPartida_en_curso() {
        return partida_en_curso;
    }
}


