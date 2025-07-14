
public class Alumnos {
	private String matricula;
	private String nombre;
	private long numCel;
	private String genero;
	
	
	//constructor con todos los parametros
	
	public Alumnos(String matricula, String nombre, long numCel, String genero) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.numCel = numCel;
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Alumnos [matricula=" + matricula + ", nombre=" + nombre + ", numCel=" + numCel + ", genero=" + genero
				+ "]\n";
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public long getNumCel() {
		return numCel;
	}


	public void setNumCel(long numCel) {
		this.numCel = numCel;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
	
	
}
