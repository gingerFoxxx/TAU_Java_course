package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        /**
         * Rectangle 1
         */

        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();//Call the constructor. Create an object 'Rectangle'
        room1.setWidth(25); // '.' access an object's accessible methods
        room1.setLength(50);
        // Created a new object 'room1' and set width and length values
        double areaOfRoom = room1.calculateArea();


        /**
         * Rectangle 2 Constructor
         */
        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom + areaOfRoom2;
        System.out.println("Area of both rooms: " + totalArea);

    }
}
