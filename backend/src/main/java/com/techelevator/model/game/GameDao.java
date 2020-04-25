package com.techelevator.model.game;


import java.util.List;

public interface GameDao {


    public long createGame(long organizer_id, String name, int number_of_players, int length_in_days);
    
    public List<Game> listAllGames();
    

}