package dad.javafx.geometria.circulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CirculoController {

	CirculoView view = new CirculoView();
	CirculoModel model = new CirculoModel();
	
	public CirculoController() {
		view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
		view.getResultadoAreaLabel().textProperty().bind(Bindings.concat("Área: ", Bindings.format("%,.2f", model.areaProperty())));
		view.getResultadoPerimetroLabel().textProperty().bind(Bindings.concat("Perímetro: ", Bindings.format("%,.2f", model.perimetroProperty())));
		view.getCirculo().radiusProperty().bind(model.radioProperty());
		
		
	
	}

	public CirculoView getView() {
		return view;
	}

}
