public class PenUser2 {
    public static void main(String[] args) {
        System.out.println("Hello Pen!");

        Pen2 mypen1 = new Pen2();
        mypen1.write();
        Pen2 mypen2 = new Pen2("삼");
        mypen2.write();
        Pen2 mypen3 = new Pen2("김", "녹", 1500);
        mypen3.write();
    
        Pen2 mypen4 = new Pen2(1970);
        mypen4.write();
        
    }
}
