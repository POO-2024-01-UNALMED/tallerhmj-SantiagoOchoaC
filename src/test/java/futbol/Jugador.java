package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	// CONSTRUCTOR
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.dorsal = dorsal;
		this.golesMarcados = golesMarcados;
	}
	
	public Jugador() {
		super();
		this.dorsal = 7;
		this.golesMarcados = 289;
	}
	
	// METODO QUE IMPONE LA INTERFAZ
	@Override
	public int compareTo(Object o) {
		Futbolista casteo = (Futbolista)o;
		int diferencia = Math.abs(super.getEdad()-casteo.getEdad());
		return diferencia;
	}
	
	// METODO QUE IMPONE LA CLASE ABSTRACTA
	@Override
	public boolean jugarConLasManos() {
		boolean variable = false; 
        if (super.getPosicion().equals("Portero")){
            variable = true;
        }
        return variable;
	}
	
	@Override
	public String toString() {
		String salida =  "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
		return salida;
	}
	
}
