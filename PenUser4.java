import PenPen.Pen4;

/**
 * PenUser4
 */
public class PenUser4 {
public static void main(String[] args) {
    System.out.println("Hello Pen!");

    Pen4 mypen1 = new Pen4();
    mypen1.write();
    mypen1.write(2000);
    mypen1.write(1000, "red");

    Pen4 mypen2 = new Pen4("우리집");
    mypen2.write();
    mypen2.write(23423234);
    mypen2.write(1000, "Black");

    Pen4 mypen3 = new Pen4();
    mypen3.write();

    mypen3.write(2000);
    mypen3.write(1000, "SMU4");
    
    mypen3.write(1000, "SMU", "G");
}

}