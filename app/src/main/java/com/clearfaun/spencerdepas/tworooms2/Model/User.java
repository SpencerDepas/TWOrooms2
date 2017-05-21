package com.clearfaun.spencerdepas.tworooms2.Model;

import java.util.UUID;

/**
 * Created by SpencerDepas on 5/21/17.
 */

public class User {

    String UID ;
    String room;
    String team;
    boolean isMaster;

    public User(){
        UID = UUID.randomUUID().toString();
    }


    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public boolean isMaster() {
        return isMaster;
    }

    public void setMaster(boolean master) {
        isMaster = master;
    }
}
