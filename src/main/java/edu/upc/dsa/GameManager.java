package edu.upc.dsa;

import edu.upc.dsa.models.Game;
import edu.upc.dsa.models.User;

import java.util.List;

public interface GameManager {
    public void Get_Actual_Level (String User_id);
    public int Get_Actual_Punctuation(String  User_id);
    public void Iniciar_Partida(String Game_id, String User_id);
    public void Creacion_Juego(String Game_id, String description, int levels);
    public void Pasar_Nivel(String User_id, int puntos_a_sumar, String date);
    public void Finalizar_Partida(String User_id);
    public List<User> ConsultaUsuariosParticipado (String Game_id);
    public String Actividad(String User_Id, String Game_Id);

    //funcions auxiliars
    public User GetUserById(String User_id);
    public Game GetPartidaByUserId(String Partida_id);



}


