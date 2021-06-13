
package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }//Default constructor

    public Rectangle(double length, double width){
        this.length = length; //can be set this way (this local length = global length)
        setWidth(width); //or can be set this way. these are only different here to demo alternative options (Call method)
    }

    public double getLength(){
        return length;
    } // Getter

    public void setLength(double length){
        this.length = length;
    } //Setter

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width; // this local width = global width
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}