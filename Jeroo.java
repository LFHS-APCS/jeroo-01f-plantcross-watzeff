/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
        
    }
    // Put any helpermethods here
     public void diagonal(){
  hop();
  turn(RIGHT);
  hop();
  turn(LEFT);
}
    public void setup(){
  diagonal();
  diagonal();
  diagonal();
  diagonal();
  diagonal();
  diagonal();
}
    public void hopplant3() {
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
}

    public void hopplant2() {
  hop();
  plant();
  hop();
  plant();
}

    public void wraparm(){
  turn(LEFT);
  hopplant3();
  turn(RIGHT);
  hopplant2();
  turn(RIGHT);
  hopplant3();
}

    public void plantCross() {
  setup();
  wraparm();
  wraparm();
  wraparm();
  wraparm();
}
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
