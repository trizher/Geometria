package dad.javafx.geometria.triangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TrianguloController {

	TrianguloView view = new TrianguloView();
	TrianguloModel model = new TrianguloModel();
	
	public TrianguloController() {
		
		view.getBaseText().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getAlturaText().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());
		
		view.getResultadoAreaLabel().textProperty().bind(Bindings.concat("Área: ", Bindings.format("%,.2f", model.areaProperty())));
		view.getResultadoPerimetroLabel().textProperty().bind(Bindings.concat("Perímetro: ", Bindings.format("%,.2f", model.perimetroProperty())));
		
		view.getTriangle().baseProperty().bind(model.baseProperty());
		view.getTriangle().heightProperty().bind(model.alturaProperty());
	
	}

	public TrianguloView getView() {
		return view;
	}

}
