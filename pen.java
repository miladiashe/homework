/*펜을 추상화 */
/**
 * pen
 */
public class Pen {
    String color;
    int prise;
    
    public void write(){
        System.out.println("Pen : write()");
    }
    public void erase(){
        System.out.println("Pen : erase()");
    }
}