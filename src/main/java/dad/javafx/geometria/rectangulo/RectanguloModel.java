package dad.javafx.geometria.rectangulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class RectanguloModel {

	private DoubleProperty ancho = new SimpleDoubleProperty();
	private DoubleProperty alto = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	
	public RectanguloModel() {
		area.bind(ancho.multiply(alto));
		perimetro.bind((ancho.add(alto)).multiply(2));
	}

	public final DoubleProperty anchoProperty() {
		return this.ancho;
	}
	

	public final double getAncho() {
		return this.anchoProperty().get();
	}
	

	public final void setAncho(final double ancho) {
		this.anchoProperty().set(ancho);
	}
	

	public final DoubleProperty altoProperty() {
		return this.alto;
	}
	

	public final double getAlto() {
		return this.altoProperty().get();
	}
	

	public final void setAlto(final double alto) {
		this.altoProperty().set(alto);
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}
	

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	

	public final double getArea() {
		return this.areaProperty().get();
	}
	
	
	
}
