package com.clearfaun.spencerdepas.tworooms2.Model;

import java.util.ArrayList;

/**
 * Created by SpencerDepas on 5/21/17.
 */

public class Users {

    ArrayList<User> users;

    public Users(){
        users = new ArrayList<User>();
    }

    public ArrayList<User> getUser() {
        return users;
    }

    public void setUser(ArrayList<User> user) {
        this.users = user;
    }

    public void addUser(User user) {
        this.users.add(user);
    }


}
