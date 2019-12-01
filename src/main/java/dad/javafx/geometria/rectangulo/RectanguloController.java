package dad.javafx.geometria.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {

	RectanguloView view = new RectanguloView();
	RectanguloModel model = new RectanguloModel();
	
	public RectanguloController() {
		view.getAnchoText().textProperty().bindBidirectional(model.anchoProperty(), new NumberStringConverter());
		view.getAltoText().textProperty().bindBidirectional(model.altoProperty(), new NumberStringConverter());
		view.getResultadoAreaLabel().textProperty().bind(Bindings.concat("Área: ", model.areaProperty().asString()));
		view.getResultadoPerimetroLabel().textProperty().bind(Bindings.concat("Perímetro: ", model.perimetroProperty().asString()));
		view.getRectangulo().widthProperty().bind(model.anchoProperty());
		view.getRectangulo().heightProperty().bind(model.altoProperty());
	}

	public RectanguloView getView() {
		return view;
	}

}
