package com.mycompany.studentregpart1;
//specify package name in course programme, module and student
//copy and paste from netbeans project int repo
//git add ., git commit -m "message", git push -u origin master
//get commit id in jitpack
//paste it into dependencies in pom

import java.util.ArrayList;
import org.joda.time.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neko
 */
public class CourseProgramme {
 private  String CName;
 private DateTime startDate;
 private DateTime endDate;
 private ArrayList<Module> listOfModules = new ArrayList<Module>();
    
  public CourseProgramme(String courseName, DateTime start, DateTime end)
   {
        this.CName = courseName;
        this.startDate = start;
        this.endDate = end;
        
    }   
  
  public void addModule(Module m)
    {
       listOfModules.add(m);
   }
  
  public ArrayList<Module> getModules()
    {
      return listOfModules;
   }

    /**
     * @return the CName
     */
    public String getCName() {
        return CName;
    }

    /**
     * @param CName the CName to set
     */
    public void setCName(String CName) {
        this.CName = CName;
    }

    /**
     * @return the startDate
     */
    public DateTime getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public DateTime getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}