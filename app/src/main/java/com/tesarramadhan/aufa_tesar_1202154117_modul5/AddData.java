package com.tesarramadhan.aufa_tesar_1202154117_modul5;

/**
 * Created by Tesarramadhan on 3/25/2018.
 */

public class AddData {
    //deklarasi variable
    String todo, desc, prior;

    public AddData(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.prior=prior;
    }//konstruktor

    public String getTodo() {
        return todo;
    }
    //method setter dan getter untuk to do , description dan priority


    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}
