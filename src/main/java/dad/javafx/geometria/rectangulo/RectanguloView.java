package dad.javafx.geometria.rectangulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends Tab {
	
	private Rectangle rectangulo;
	private Label resultadoAreaLabel, resultadoPerimetroLabel;
	private TextField anchoText, altoText;
	
	public RectanguloView() {
		super("Rectángulo");
		
		anchoText = new TextField();
		
		altoText = new TextField();
		
		resultadoAreaLabel = new Label();
		
		resultadoPerimetroLabel = new Label();
		
		rectangulo = new Rectangle();
		rectangulo.setFill(Color.rgb(0, 162, 232));
		rectangulo.setStrokeWidth(2); 
		rectangulo.setStroke(Color.BLACK);
		
		VBox vistaVbox = new VBox();
		vistaVbox.setAlignment(Pos.CENTER);
		vistaVbox.setSpacing(10);
		HBox areaHbox = new HBox();
		areaHbox.setAlignment(Pos.CENTER);
		HBox perimetroHbox = new HBox();
		perimetroHbox.setAlignment(Pos.CENTER);
		
		areaHbox.getChildren().addAll(new Label("Ancho: "), anchoText);
		perimetroHbox.getChildren().addAll(new Label("Alto: "), altoText);
		vistaVbox.getChildren().addAll(areaHbox, perimetroHbox, rectangulo, resultadoAreaLabel, resultadoPerimetroLabel);
		
		setContent(vistaVbox);
		
	}

	public Rectangle getRectangulo() {
		return rectangulo;
	}

	public void setRectangulo(Rectangle rectangulo) {
		this.rectangulo = rectangulo;
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

	public TextField getAnchoText() {
		return anchoText;
	}

	public void setAnchoText(TextField anchoText) {
		this.anchoText = anchoText;
	}

	public TextField getAltoText() {
		return altoText;
	}

	public void setAltoText(TextField altoText) {
		this.altoText = altoText;
	}

	
	
}
