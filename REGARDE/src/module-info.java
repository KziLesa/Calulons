module REGARDE {
	requires javafx.controls;
	requires javafx.graphics;
	exports view;
	opens application to javafx.graphics, javafx.fxml;
}
