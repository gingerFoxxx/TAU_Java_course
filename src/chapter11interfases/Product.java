package chapter11interfases;

public interface Product {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode(){
        return "no barcode";
    }
}
/**
 * Interfaces cannot be instantiated.
 *
 * Interfaces are implemented, not extended.
 *
 * Any class that implements an interface must implement all of its methods or it must declare itself abstract.
 *
 * Methods in an interface must be default or abstract (there's no explicit declaration needed for abstract methods)
 *
 * Also notice that we didn't put an access modifier on the methods in an interface, either.
 * That's because by default they're all public.
 */
