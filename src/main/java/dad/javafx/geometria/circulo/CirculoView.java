package dad.javafx.geometria.circulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends Tab {
	
	private Circle circulo;
	private Label resultadoAreaLabel, resultadoPerimetroLabel;
	private TextField radioText;
	
	public CirculoView() {
		super("Círculo");
		
		radioText = new TextField();
		
		resultadoAreaLabel = new Label();
		
		resultadoPerimetroLabel = new Label();
		
		circulo = new Circle();
		circulo.setFill(Color.RED);
		circulo.setStrokeWidth(2); 
		circulo.setStroke(Color.BLACK);
		
		VBox vistaVbox = new VBox();
		vistaVbox.setAlignment(Pos.CENTER);
		vistaVbox.setSpacing(10);
		HBox radioHbox = new HBox();
		radioHbox.setAlignment(Pos.CENTER);
		radioHbox.getChildren().addAll(new Label("Radio: "), radioText);
		
		vistaVbox.getChildren().addAll(radioHbox, circulo, resultadoAreaLabel, resultadoPerimetroLabel);
		
		setContent(vistaVbox);
		
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

	public Circle getCirculo() {
		return circulo;
	}

	public void setCirculo(Circle circulo) {
		this.circulo = circulo;
	}

	public TextField getRadioText() {
		return radioText;
	}

	public void setRadioText(TextField radioText) {
		this.radioText = radioText;
	}


	
	
}
