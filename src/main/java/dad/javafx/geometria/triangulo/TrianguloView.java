package dad.javafx.geometria.triangulo;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class TrianguloView extends Tab {
	
	private Triangle triangle;
	private Label resultadoAreaLabel, resultadoPerimetroLabel;
	private TextField baseText, alturaText;
	
	public TrianguloView() {
		super("Triángulo");
		
		baseText = new TextField();
		alturaText = new TextField();
		
		resultadoAreaLabel = new Label();
		
		resultadoPerimetroLabel = new Label();
		
		triangle = new Triangle();
		triangle.setFill(Color.GREEN);
		triangle.setStrokeWidth(2); 
		triangle.setStroke(Color.BLACK);
		
		VBox vistaVbox = new VBox();
		vistaVbox.setAlignment(Pos.CENTER);
		vistaVbox.setSpacing(10);
		HBox baseHbox = new HBox();
		baseHbox.setAlignment(Pos.CENTER);
		baseHbox.getChildren().addAll(new Label("Base: "), baseText);
		HBox alturaHbox = new HBox();
		alturaHbox.setAlignment(Pos.CENTER);
		alturaHbox.getChildren().addAll(new Label("Altura: "), alturaText);
		
		vistaVbox.getChildren().addAll(baseHbox, alturaHbox, triangle, resultadoAreaLabel, resultadoPerimetroLabel);
		
		setContent(vistaVbox);
		
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
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

	public TextField getBaseText() {
		return baseText;
	}

	public void setBaseText(TextField baseText) {
		this.baseText = baseText;
	}

	public TextField getAlturaText() {
		return alturaText;
	}

	public void setAlturaText(TextField alturaText) {
		this.alturaText = alturaText;
	}
	

	
	
}
