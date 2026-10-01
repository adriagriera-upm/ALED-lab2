package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;


public class Segment {
	
	private double length;
	private double angle;
	private List<Segment> children;
	
	// Constructor para la clase Segment, con argumentos para establecer los atributos de la longitud y el ángulo
	public Segment(double length, double angle) {
		this.length=length;
		this.angle=angle;
		this.children=new ArrayList<>();
		
	}
	
	//Devuelve la longitud de este segmento
	public double getLength() {
		return length;
	}
	
	//Devuelve el ángulo de este segmento
	public double getAngle() {
		return angle;
	}
	
	//Modifica el ángulo del segmento
	public void setAngle(double angle) {
		this.angle=angle;
	}
	
	//Devuelve la lista de los segmentos hijos
	public List<Segment> getChildren(){
		return children;
	}
	
	//Añade un segmento hijo en la lista de la familia segmentos
	public void addChild(Segment child) {
		if(!children.contains(child)) {
			children.add(child);
		}		
	}
	
	
}