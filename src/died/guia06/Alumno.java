package died.guia06;

import java.util.List;


public class Alumno implements Comparable<Alumno> {

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;
	
	public Alumno(String nombre, Integer nroLibreta) {
		this.nombre=nombre;
		this.nroLibreta=nroLibreta;
	}
	public int creditosObtenidos() {
		return 1;
	}

	public void aprobar(Curso c) {
		//
	}

	public void inscripcionAceptada(Curso c) {
		//
	}
	
	public boolean equals(Object ob) {
		if(!(ob instanceof Alumno)) {
			return false;
		}
		else {
			Alumno al=(Alumno) ob;
			if(this.nroLibreta==al.nroLibreta) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	@Override
	public int compareTo(Alumno o) {
		if((this.nombre.compareTo(o.nombre))>0) {
			return 1;
		}
		if((this.nombre.compareTo(o.nombre))<0){
			return -1;
		}
		return 0;
	}
	

}
