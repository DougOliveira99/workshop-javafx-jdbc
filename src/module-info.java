module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui;
	opens gui to javafx.fxml;
	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
	opens application to javafx.graphics, javafx.fxml;
}
