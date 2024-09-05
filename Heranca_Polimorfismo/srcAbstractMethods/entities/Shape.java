package Heranca_Polimorfismo.srcAbstractMethods.entities;
import Heranca_Polimorfismo.srcAbstractMethods.entities_enum.Color;

public abstract class Shape {
    
    private Color color;

    public Shape(){}
    public Shape(Color color){this.color = color;}

    public Color getColor(){return color;}
    public void setColor(Color color){this.color = color;}

    public abstract double area();

}
