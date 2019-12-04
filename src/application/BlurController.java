package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
/**
 * 
 * @author rober
 *
 *
 */
public class BlurController {
	// int i = 0;
	@FXML
	private Pane pane;

	@FXML
	public void setblur() {

		// if (i % 2 == 0) {
		pane.setEffect(new GaussianBlur(15));
		// i++;
		// } else {
		// pane.setEffect(new GaussianBlur(0));
		// i++;
		// }

	}

	@FXML
	public void setFocus() {
		pane.setEffect(new GaussianBlur(0));
	}

	@FXML
	private void handleClose() {

		System.exit(0);
	}

	@FXML
	public void initialize() {
		pane.setEffect(new GaussianBlur(5));
	}

}