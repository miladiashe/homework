/*펜을 추상화 */
/**
 * pen2
 */
public class Pen2 {
    String vender;
    String color;
    int prise;
    
    public Pen2() {
        
    }

    public Pen2(String name) {
        vender = name;
    }

    public Pen2(int value) {
        prise = value;
    }

    public Pen2(String name, String col, int pp) {
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
    public void erase(){
        System.out.println("Pen : erase()");
    }
}