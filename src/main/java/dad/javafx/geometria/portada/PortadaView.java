package dad.javafx.geometria.portada;

import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PortadaView extends Tab{
	private Circle circuloShape;
	private Rectangle rectanguloShape;
	private Triangle trianguloShape;
	private Hexagon hexagonoShape;
	private Label titulo;
	
	public PortadaView() {
		super("Portada");
		circuloShape = new Circle();
		circuloShape.setRadius(40);
		circuloShape.setFill(Color.RED);
		circuloShape.setStrokeWidth(2);
		circuloShape.setStroke(Color.BLACK);
		
		rectanguloShape = new Rectangle();
		rectanguloShape.setHeight(60);
		rectanguloShape.setWidth(80);
		rectanguloShape.setFill(Color.rgb(0, 162, 232));
		rectanguloShape.setStrokeWidth(2);
		rectanguloShape.setStroke(Color.BLACK);
		
		trianguloShape = new Triangle();
		trianguloShape.setHeight(60);
		trianguloShape.setBase(80);
		trianguloShape.setFill(Color.GREEN);
		trianguloShape.setStrokeWidth(2);
		trianguloShape.setStroke(Color.BLACK);
		
		hexagonoShape = new Hexagon();
		hexagonoShape.setRadius(40);
		hexagonoShape.setFill(Color.PURPLE);
		hexagonoShape.setStrokeWidth(2);
		hexagonoShape.setStroke(Color.BLACK);
		
		VBox vistaVbox = new VBox();
		vistaVbox.setAlignment(Pos.CENTER);
		vistaVbox.setSpacing(40);
		
		GridPane grid = new GridPane();
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setAlignment(Pos.CENTER);
		grid.add(circuloShape, 1, 0);
		grid.add(rectanguloShape, 0, 0);
		grid.add(trianguloShape, 0, 1);
		grid.add(hexagonoShape, 1, 1);
		
		titulo = new Label("Calculadora de áreas");
		titulo.setStyle("-fx-font-size: 30px");
		
		vistaVbox.getChildren().addAll(titulo, grid);
		
		setContent(vistaVbox);
	}
	
	
}
