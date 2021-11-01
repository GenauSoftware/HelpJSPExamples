
package software.genau.jspexamples;

import java.io.Serializable;

public class Beverage implements Serializable {
    private String name;
    private int millilitersRemaining;
    private String color;

    public Beverage() {
        this.name = "";
        this.millilitersRemaining = 0;
        this.color = "";
    }

    public Beverage(String name, int millilitersRemaining, String color) {
        this.name = name;
        this.millilitersRemaining = millilitersRemaining;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMillilitersRemaining() {
        return millilitersRemaining;
    }

    public void setMillilitersRemaining(int millilitersRemaining) {
        this.millilitersRemaining = millilitersRemaining;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
