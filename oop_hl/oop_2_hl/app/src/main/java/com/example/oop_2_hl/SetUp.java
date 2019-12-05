package com.example.oop_2_hl;

import android.content.Context;
import android.widget.Button;

public class SetUp {
    private SetUpListner setUpListner=null;
    protected String strRead="true";
    protected String strWrite="true";
    protected String strDelete="true";
    protected String strControl="true";

    public void read(){
        setUpListner.onRead(strRead);
    }
    public void write(){
        setUpListner.onWrite(strWrite);
    }
    public void delete(){
        setUpListner.onDelete(strDelete);
    }
    public void control(){
        setUpListner.onControl(strControl);
    }

    public void onSetUpListener(SetUpListner listner){
        this.setUpListner=listner;
    }

}
