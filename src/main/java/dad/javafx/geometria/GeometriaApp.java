package dad.javafx.geometria;

import dad.javafx.geometria.circulo.CirculoController;
import dad.javafx.geometria.hexagono.HexagonoController;
import dad.javafx.geometria.portada.PortadaController;
import dad.javafx.geometria.rectangulo.RectanguloController;
import dad.javafx.geometria.triangulo.TrianguloController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class GeometriaApp extends Application {

	private PortadaController portadaController = new PortadaController();
	private RectanguloController rectanguloController = new RectanguloController();
	private CirculoController circuloController = new CirculoController();
	private HexagonoController hexagonoController = new HexagonoController();
	private TrianguloController trianguloController = new TrianguloController();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TabPane root = new TabPane();
		root.getTabs().addAll(
				portadaController.getView(),
				rectanguloController.getView(),
				circuloController.getView(),
				trianguloController.getView(),
				hexagonoController.getView()
				);
		
		Scene scene = new Scene(root, 900, 650);
		
		primaryStage.setTitle("Geometría");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
