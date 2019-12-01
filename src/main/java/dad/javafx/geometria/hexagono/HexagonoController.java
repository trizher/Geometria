package dad.javafx.geometria.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonoController {

	HexagonoView view = new HexagonoView();
	HexagonoModel model = new HexagonoModel();
	
	public HexagonoController() {
		view.getLadoText().textProperty().bindBidirectional(model.ladoProperty(), new NumberStringConverter());
		view.getResultadoAreaLabel().textProperty().bind(Bindings.concat("Área: ", Bindings.format("%,.2f", model.areaProperty())));
		view.getResultadoPerimetroLabel().textProperty().bind(Bindings.concat("Perímetro: ", Bindings.format("%,.2f", model.perimetroProperty())));
		view.getHexagono().radiusProperty().bind(model.apotemaProperty());
	}

	public HexagonoView getView() {
		return view;
	}

}
