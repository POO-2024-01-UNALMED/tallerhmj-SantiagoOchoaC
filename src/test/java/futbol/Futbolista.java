package futbol;
import java.lang.Comparable;

public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	// CONSTRUCTOR
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	// CONSTRUCTOR SIN PARAMETROS
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	@Override
	public String toString() {
		String salida =  "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
		return salida;
	}
	
	public boolean equals(Futbolista f) {
		boolean variable = false;
		if (f != null ) {
			if (f == this) {
				variable = true;
				}
		}
		return variable;
	}
	
	// METODO ABSTRACTO 
	
	public abstract boolean jugarConLasManos();
	
	// METODOS GET Y SET 
	
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

}
