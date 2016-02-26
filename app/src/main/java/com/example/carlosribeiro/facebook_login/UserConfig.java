package com.example.carlosribeiro.facebook_login;


import java.util.ArrayList;
import java.util.List;

public class UserConfig {
        public List<String> users = new ArrayList<String>();
        public List<String> password = new ArrayList<String>();

    public void initialize(){
        users.add(0, "milho");
        password.add(0, "cozido");
        //users.add(1, "b");
        //password.add(1, "b");
    }


}

