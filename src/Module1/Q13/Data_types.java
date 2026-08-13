// Primitive datatypes

public class Data_types {

    // Instance variables get default values

    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    public static void main(String[] args) {

        Data_types obj = new Data_types();

        System.out.println("byte: " + obj.byteValue);
        System.out.println("short: " + obj.shortValue);
        System.out.println("int: " + obj.intValue);
        System.out.println("long: " + obj.longValue);
        System.out.println("float: " + obj.floatValue);
        System.out.println("double: " + obj.doubleValue);

        System.out.println("char: " + obj.charValue);
        System.out.println("boolean: " + obj.booleanValue);
    }
}