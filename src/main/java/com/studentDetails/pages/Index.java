package com.studentDetails.pages;

import java.util.Date;
import java.util.List;

import com.studentDetails.Model.Data;
import com.studentDetails.Model.StudentEntity;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.annotations.*;
import org.apache.tapestry5.corelib.components.*;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.alerts.AlertManager;

/**
 * Start page of application studentDetails.
 */
public class Index
{
    @Property
    private Data item;


    @Property
    private List<Data> student_data;
    
    public List<Data> getStudentName(){
        StudentEntity std_info = new StudentEntity();
        List<Data> result =  std_info.getNames();
        return result;
    }
}
