package com.example.oop_2_hl;

public interface SetUpListner {
    public void onWrite(String write);
    public void onRead(String read);
    public void onDelete(String delete);
    public void onControl(String control);
}
