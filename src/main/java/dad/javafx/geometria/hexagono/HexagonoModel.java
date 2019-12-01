package dad.javafx.geometria.hexagono;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class HexagonoModel {

	private DoubleProperty lado = new SimpleDoubleProperty();
	private DoubleProperty apotema = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	
	public HexagonoModel() {
		perimetro.bind(lado.multiply(6));
		apotema.bind(Bindings.createDoubleBinding(() -> Math.sqrt(Math.pow(getLado(), 2) - Math.pow(getLado()/2, 2)), lado));
		area.bind(perimetro.multiply(apotema).divide(2));
	}

	public final DoubleProperty ladoProperty() {
		return this.lado;
	}
	

	public final double getLado() {
		return this.ladoProperty().get();
	}
	

	public final void setLado(final double lado) {
		this.ladoProperty().set(lado);
	}
	

	public final DoubleProperty apotemaProperty() {
		return this.apotema;
	}
	

	public final double getApotema() {
		return this.apotemaProperty().get();
	}
	

	public final void setApotema(final double apotema) {
		this.apotemaProperty().set(apotema);
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
