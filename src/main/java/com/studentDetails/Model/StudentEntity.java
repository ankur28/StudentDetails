package com.studentDetails.Model;

import java.util.ArrayList;
import java.util.List;

public class StudentEntity {
    public Data data;
    public List<Data> st_data =  null;

    public StudentEntity(){
        this.st_data = new ArrayList<Data>();

        Data d1= new Data();
        d1.name = "Clay Jensen";
        d1.age = "10";
        d1.class_name = 4;
        d1.Eng = "80";
        d1.Hindi = "78";
        d1.Math = "76";
        d1.Evs="78";
        d1.Physics="67";
        d1.Chemistry="54";
        d1.Biology="90";
        d1.Olympiad_eng="67";
        d1.Olympiad_Math="69";
        st_data.add(d1);

        Data d2= new Data();
        d2.name = "Justin Foley";
        d2.age = "6";
        d2.class_name = 10;
        d2.Eng = "80";
        d2.Hindi = "78";
        d2.Math = "76";
        d2.Evs="78";
        d2.Physics="67";
        d2.Chemistry="54";
        d2.Biology="90";
        d2.Olympiad_eng="67";
        d2.Olympiad_Math="69";
        st_data.add(d2);

        Data d3= new Data();
        d3.name = "Hannah Baker";
        d3.age = "13";
        d3.class_name = 8;
        d3.Eng = "80";
        d3.Hindi = "78";
        d3.Math = "76";
        d3.Evs="78";
        d3.Physics="67";
        d3.Chemistry="54";
        d3.Biology="90";
        d3.Olympiad_eng="67";
        d3.Olympiad_Math="69";
        st_data.add(d3);

        Data d4= new Data();
        d4.name = "Jessica Davis";
        d4.age = "7";
        d4.class_name = 5;
        d4.Eng = "80";
        d4.Hindi = "78";
        d4.Math = "76";
        d4.Evs="78";
        d4.Physics="67";
        d4.Chemistry="54";
        d4.Biology="90";
        d4.Olympiad_eng="67";
        d4.Olympiad_Math="69";
        st_data.add(d4);

        Data d5= new Data();
        d5.name = "Bryce Walker";
        d5.age = "11";
        d5.class_name = 7;
        d5.Eng = "80";
        d5.Hindi = "78";
        d5.Math = "76";
        d5.Evs="78";
        d5.Physics="67";
        d5.Chemistry="54";
        d5.Biology="90";
        d5.Olympiad_eng="67";
        d5.Olympiad_Math="69";
        st_data.add(d5);

        Data d6= new Data();
        d6.name = "Alex Standall";
        d6.age = "10";
        d6.class_name = 4;
        d6.Eng = "80";
        d6.Hindi = "78";
        d6.Math = "76";
        d6.Evs="78";
        d6.Physics="67";
        d6.Chemistry="54";
        d6.Biology="90";
        d6.Olympiad_eng="67";
        d6.Olympiad_Math="69";
        st_data.add(d6);
    }
    public List<Data> getNames() {
        return this.st_data;
    }
}
