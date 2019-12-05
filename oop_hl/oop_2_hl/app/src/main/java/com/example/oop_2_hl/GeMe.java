package com.example.oop_2_hl;

public class GeneralMember extends MemberControl {
    public void write(){
        super.strWrite="false";
        super.write();
    }
    public void delete(){
        super.strDelete="false";
        super.delete();
    }
    public void control(){
        super.strControl="false";
        super.control();
    }
}
