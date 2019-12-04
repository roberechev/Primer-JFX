package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * 
 * @author rober
 * @see BlurController
 * @version 1.0
 * 
 *          Hay dos ramas la master en la que solo se desenfoca y sale, y la
 *          inicializacion que enfoca, desenfoca y sale.
 * 
 */

public class Main extends Application {
	@Override

	public void start(Stage primaryStage) {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("vista.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 570, 320);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
