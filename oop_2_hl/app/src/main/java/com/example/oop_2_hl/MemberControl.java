package com.example.oop_2_hl;

public class MemberControl {
    private FunctionListner functionListner =null;
    protected String strRead="true";
    protected String strWrite="true";
    protected String strDelete="true";
    protected String strControl="true";

    public void read(){
        functionListner.onRead(strRead);
    }
    public void write(){
        functionListner.onWrite(strWrite);
    }
    public void delete(){
        functionListner.onDelete(strDelete);
    }
    public void control(){
        functionListner.onControl(strControl);
    }
    public void Function(){
        read();
        write();
        delete();
        control();
    }
    public void onSetUpListener(FunctionListner listner){
        this.functionListner =listner;
    }
}
