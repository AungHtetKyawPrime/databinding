package com.example.aspire.databinding;

import java.util.ArrayList;

public class User {
    String name;
    String email;

    public User(model model) {
        this.name = model.name;
        this.email = model.email;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<User> getArrayListData(){
        ArrayList<User> data=new ArrayList<>();
        User dataviewmodel1 =new User(new model("Man United Transfer ","Kulibali transfer Completed"));
        User dataviewmodel2 =new User(new model("Man United Transfer ","Dybala transfer Completed"));
        User dataviewmodel3 =new User(new model("Man United Transfer ","Anderwireld transfer Completed"));
        User dataviewmodel4 =new User(new model("Man United Transfer ","HerryKane transfer Completed"));
        User dataviewmodel5 =new User(new model("Man United Transfer ","Ana Tovic transfer Completed"));
        User dataviewmodel6 =new User(new model("Man United Transfer ","Ronaldo transfer Completed"));
        User dataviewmodel7 =new User(new model("Man United Transfer ","Sancho transfer Completed"));
        User dataviewmodel8 =new User(new model("Man United Transfer ","MBappe transfer Completed"));
        data.add(dataviewmodel1);
        data.add(dataviewmodel2);
        data.add(dataviewmodel3);
        data.add(dataviewmodel4);
        data.add(dataviewmodel5);
        data.add(dataviewmodel6);
        data.add(dataviewmodel7);
        data.add(dataviewmodel8);
        return data;
    }
}
