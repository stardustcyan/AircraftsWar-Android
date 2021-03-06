package edu.hitsz.dao;

import android.content.Context;

import java.util.List;

public interface PlayerDAO {
    List<Player> getPlayerList();
    void addPlayer(String playerName, int score);
    void deletePlayer(int playerIndex);

    void printPlayerList();
    void savePlayerList();

    void readPlayerList();
}
