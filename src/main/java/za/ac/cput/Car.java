package za.ac.cput;
/*
 author marco mulonday
 219049505
 */
import java.util.Collection;
import java.util.HashSet;

public class Car {

    private String name;
    private String model;
    private String colour;
    private String mark;
    private int year;

    public Car() {

    }
    public Car(String name, String model, String colour, String mark, int year) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.mark = mark;
        this.year = year;
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "name=" + name +"\t"+
                " model=" + model + "\n";



    }




}
