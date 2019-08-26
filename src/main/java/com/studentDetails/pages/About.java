package com.studentDetails.pages;

import com.studentDetails.Model.Data;
import com.studentDetails.Model.StudentEntity;
import org.apache.tapestry5.annotations.Property;

import java.util.ArrayList;
import java.util.List;

public class About
{
    @Property
    private Data item;

    @Property
    private List<Data> filteredResult;

    public void onActivate(String name){
        StudentEntity std_info = new StudentEntity();
        List<Data> result = std_info.getNames();

        filteredResult = new ArrayList<>();
        for(Data singleResult : result){
            if(singleResult.name.equals(name)){
                filteredResult.add(singleResult);
            }
        }


    }


    public boolean isCheckClass(){
        return filteredResult.get(0).class_name > 6;
    }
}
