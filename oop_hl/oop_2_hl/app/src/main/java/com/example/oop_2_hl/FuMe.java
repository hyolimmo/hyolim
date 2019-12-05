package com.example.oop_2_hl;

public class FullMember extends MemberControl {
    public void control(){
        super.strControl="false";
        super.control();
    }
}
