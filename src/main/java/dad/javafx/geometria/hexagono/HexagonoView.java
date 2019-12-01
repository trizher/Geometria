package dad.javafx.geometria.hexagono;

import dad.javafx.geometria.shapes.Hexagon;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HexagonoView extends Tab {
	
	private Hexagon hexagono;
	private Label resultadoAreaLabel, resultadoPerimetroLabel;
	private TextField ladoText;
	
	public HexagonoView() {
		super("Hexágono");
		
		ladoText = new TextField();
		
		resultadoAreaLabel = new Label();
		
		resultadoPerimetroLabel = new Label();
		
		hexagono = new Hexagon();
		hexagono.setFill(Color.PURPLE);
		hexagono.setStrokeWidth(2); 
		hexagono.setStroke(Color.BLACK);
		
		VBox vistaVbox = new VBox();
		vistaVbox.setAlignment(Pos.CENTER);
		vistaVbox.setSpacing(10);
		HBox ladoHbox = new HBox();
		ladoHbox.setAlignment(Pos.CENTER);
		
		ladoHbox.getChildren().addAll(new Label("Lado: "), ladoText);
		vistaVbox.getChildren().addAll(ladoHbox, hexagono, resultadoAreaLabel, resultadoPerimetroLabel);
		
		setContent(vistaVbox);
		
	}

	public Hexagon getHexagono() {
		return hexagono;
	}

	public void setHexagono(Hexagon hexagono) {
		this.hexagono = hexagono;
	}

	public Label getResultadoAreaLabel() {
		return resultadoAreaLabel;
	}

	public void setResultadoAreaLabel(Label resultadoAreaLabel) {
		this.resultadoAreaLabel = resultadoAreaLabel;
	}

	public Label getResultadoPerimetroLabel() {
		return resultadoPerimetroLabel;
	}

	public void setResultadoPerimetroLabel(Label resultadoPerimetroLabel) {
		this.resultadoPerimetroLabel = resultadoPerimetroLabel;
	}

	public TextField getLadoText() {
		return ladoText;
	}

	public void setLadoText(TextField ladoText) {
		this.ladoText = ladoText;
	}



	
	
}
