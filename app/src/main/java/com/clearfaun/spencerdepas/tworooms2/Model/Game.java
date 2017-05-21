package com.clearfaun.spencerdepas.tworooms2.Model;

import java.util.UUID;

/**
 * Created by SpencerDepas on 5/21/17.
 */

public class Game {

    String gameID = "";

    public Game(){
        gameID = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 5);

    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }
}
