package PenPen;

/*  */
/**
 * pen4
 */
public class Pen4 {
    String vender;
    String color;
    int prise;
    
    public Pen4() {
        
    }

    public Pen4(String name) {
        vender = name;
    }

    public Pen4(int value) {
        prise = value;
    }

    public Pen4(String name, String col, int pp) {
        vender = name;
        color = col;
        prise = pp;
    }

    public void write(){
        System.out.println("Pen : write()");
        System.out.println("Pen vender : "+vender);
        System.out.println("Pen Color : "+color);
        System.out.println("Pen Price : "+prise);
    }
    public void write(int x){
        System.out.println("Pen : write(int x)");
        System.out.println("Pen vender : "+vender);
        System.out.println("Pen Color : "+color);
        System.out.println("Pen Price : "+x);
    }public void write(int x, String y){
        System.out.println("Pen : write()");
        System.out.println("Pen vender : "+y);
        System.out.println("Pen Color : "+color);
        System.out.println("Pen Price : "+x);
    }public void write(int x, String y, String z){
        System.out.println("Pen : write()");
        System.out.println("Pen vender : "+y);
        System.out.println("Pen Color : "+z);
        System.out.println("Pen Price : "+x);
    }
    public void erase(){
        System.out.println("Pen : erase()");
    }
}