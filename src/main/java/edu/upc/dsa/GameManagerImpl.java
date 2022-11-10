package edu.upc.dsa;

import edu.upc.dsa.models.Game;
import edu.upc.dsa.models.Partida;
import edu.upc.dsa.models.User;
import org.apache.log4j.Logger;
import java.util.Collections;
import java.util.Comparator;


import java.util.LinkedList;

public class GameManagerImpl implements GameManager {

    LinkedList<User> listaUsuarios = new LinkedList<User>();
    LinkedList<Partida> listaPartidas = new LinkedList<>();

    static final Logger logger = Logger.getLogger(edu.upc.dsa.GameManagerImpl.class.getName());
    private static edu.upc.dsa.GameManagerImpl manager;
        //Singleton
    public static edu.upc.dsa.GameManagerImpl getInstance(){
        if(manager==null){
            manager= new edu.upc.dsa.GameManagerImpl();
        }
        return manager;
    }
    private GameManagerImpl() {}

    @Override
    public void Get_Actual_Level (String User_id){
        User user = GetUserById(User_id);
        Partida partida = new Partida ();
        if (user == null) {
            logger.info("User " + userName + " does not exist");
        }
        if (partida.GetUserId().equals(user.GetId())){
            logger.info("User"+ User_id + "is playing at" +partida.GetActualLevel()+"level and the id of the match is"+ partida.GetId());
        }
        if (!user.GetPartida_en_curso()){
            logger.info("User " + User_id + "is not playing");
        }


    }
    @Override
    public void Iniciar_Partida(String Game_id, String User_id){
        new Partida(Game_id, User_id);
    }
    @Override
    public void Get_Actual_Punctuation (String User_id) {
        User user = GetUserById(User_id);
        Partida partida = new Partida();
        if (user == null) {
            logger.info("User " + userName + " does not exist");
        }
        if (partida.GetUserId().equals(user.GetId())) {
            logger.info("User" + User_id + "is playing at" + partida.GetPoints() + "points");
        }
        if (!user.GetPartida_en_curso()) {
            logger.info("User " + User_id + "is not playing");
        }
    }
    @Override
    public void Creacion_Juego(String Game_id, String description, int levels){
        new Game(Game_id, description, levels);
    }

    @Override
    public void Pasar_Nivel(String User_id, int puntos_a_sumar, String date){
        Partida partida = new Partida();
        int puntos = partida.GetPoints() + puntos_a_sumar;
        int nivel =  partida.GetActualLevel()+1;
        logger.info("El usuario"+User_id+"ha pasado al nivel"+nivel+ "el día"+date+ "y tiene"+ puntos +"puntos");


    }
    @Override
    public void Finalizar_Partida(String User_id){
        User u = new User();
        boolean i = u.GetPartida_en_curso();
        i = false;
    }


        //funcions auxiliars
    public User GetUserById(String id) {
        for (User u: this.listaUsuarios) {
            if(u.GetId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public Game GetGameById(String Game_id){
        for (Game g: this.listaPartidas) {
            if(g.GetId().equals(Game_id))} {
                return g;
            }

    }



    }
