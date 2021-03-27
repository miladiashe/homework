/**
 * PenUser3
 */
public class PenUser3 {
public static void main(String[] args) {
    System.out.println("Hello Pen!");

    Pen3 mypen1 = new Pen3();
    mypen1.write();
    mypen1.write(2000);
    mypen1.write(1000, "red");

    Pen3 mypen2 = new Pen3("우리집");
    mypen2.write();
    mypen2.write(23423234);
    mypen2.write(1000, "Black");

    Pen3 mypen3 = new Pen3();
    mypen3.write();
    mypen3.write(2000);
    mypen3.write(1000, "SMU4");
    
    mypen3.write(1000, "SMU", "G");
}

}