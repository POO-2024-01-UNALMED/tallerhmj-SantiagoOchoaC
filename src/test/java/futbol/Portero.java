package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;

	// CONSTRUCTOR
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.dorsal = dorsal;
		this.golesRecibidos = golesRecibidos;
	}
	
	@Override
	public String toString() {
		String salida =  "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
		return salida;
	}
	
	// METODO QUE IMPONE LA INTERFAZ
	@Override
	public int compareTo(Object o) {
		Portero casteo = (Portero)o;
		int diferencia = Math.abs(this.golesRecibidos-casteo.golesRecibidos);
		return diferencia;
	}
	
	// METODO QUE IMPONE LA CLASE ABSTRACTA
	@Override
	public boolean jugarConLasManos() {
		return true;
	}
}
