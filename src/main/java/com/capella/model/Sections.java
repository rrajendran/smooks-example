package com.capella.model;

import java.util.List;

/**
 * Created on : 2/8/16
 *
 * @author Ramesh Rajendran
 */
public class Sections {
    private List<Section> sections;

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Sections{" +
                "sections=" + sections +
                '}';
    }
}
