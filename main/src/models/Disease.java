package models;

import interfaces.BasicInterface;
import interfaces.DiseaseInterface;

public class Disease extends BasicData implements BasicInterface, DiseaseInterface {

    public String[] DiseaseData() {
        return new String[]{
                "contagious: " + this.getContagious(),
                "name: " + this.getName(),
                "drug: " + this.getDrug(),
        };
    }
    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }
}