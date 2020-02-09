import java.util.Arrays;

public class Pelicula {
	
	private String titulo;
	private String director;
	private int duracion;
	private Actor []actores = new Actor [15];
	private int numeroActores;
	
	public Pelicula(){
		this.titulo = "";
		this.director = "";
		this.duracion = 0;
		this.actores= new Actor[15];
		this.numeroActores = actores.length;
	}
	
	public Pelicula(String titulo, String director, int duracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.actores = new Actor [15];
		this.numeroActores = actores.length;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", actores="
				+ Arrays.toString(actores) + ", numeroActores=" + numeroActores + "]";
	}
	
	
	

}
