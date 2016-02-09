package com.capella.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on : 2/8/16
 *
 * @author Ramesh Rajendran
 */
public class Section {
    private String sectionName;
    private HashMap<String,String> data = new HashMap<String, String>();

    public Map<String, String> getData() {
        return data;
    }

    public void setData(HashMap<String, String> data) {
        this.data = data;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public String toString() {
        return "Section{" +
                "data=" + data +
                ", sectionName='" + sectionName + '\'' +
                '}';
    }
}
