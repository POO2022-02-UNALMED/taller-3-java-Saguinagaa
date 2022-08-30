package taller3.televisores;

public class TV {
	Marca marca;
	int canal=1	;
	int precio=500;
	int volumen=1;
	boolean estado;
	Control control;
	public static int numTV=0;
	public TV(Marca mar, boolean estad) {
		marca=mar;
		estado= estad;
		numTV++;
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public void setMarca(Marca marc) {
		marca=marc;
	}
	public void setPrecio(int prec) {
		precio=prec;
	}
	public void setControl(Control cont) {
		control=cont;
	}
	public void setVolumen(int vol) {
		volumen=vol;
	}
	public void setCanal(int can) {
		canal=can;
	}
	static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
        if (1<=canal && canal<120 && estado==true) {
            canal += 1;
        }
    }

    public void canalDown() {
    	if (1<canal && canal<=120 && estado==true) {
            canal -= 1;
        }
    }
        
    public void volumenUp(){
        if (volumen<7 && 0<volumen && estado) {
            volumen += 1;
        }
    }

    public void volumenDown(){
        if (volumen<=7 && 1<volumen && estado) {
            volumen -= 1;
        }
    }

}


