package taller3.televisores;

public class Control {
	TV tv;
	public void enlazar(TV tel) {
		tv=tel;
		tv.setControl(this);
		
	}
    public TV getTv() {
        return tv;
    }
    public void setTv(TV tev) {
        tv = tev;
    }
    public void turnOn() {
        tv.turnOn();
    }
    public void turnOff() {
        tv.turnOff();
    }
    public void canalUp() {
        tv.canalUp();
    }
    public void canalDown() {
        tv.canalDown();
    }  
    public void volumenUp() {
        tv.volumenUp();
    } 
    public void volumenDown() {
        tv.volumenDown();
    }
    public void setCanal(int newCanal) {
        tv.setCanal(newCanal);
    }
    
}
