package application.controller;


import java.net.URL;
import java.util.ResourceBundle;
import application.MainApp;
import application.model.Language;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

public class LanguageChangerController {

	private MainApp mainApp;

	@FXML
	private ResourceBundle resources;
	@FXML
	private AnchorPane loginPanel;
	@FXML
	private URL location;

	private final ObservableList<Language> languages = FXCollections.observableArrayList(new Language("Italiano", 1),
			new Language("English", 2), new Language("Espanol", 3), new Language("Deutsche", 4));

	@FXML
	private ComboBox<Language> languagebox = new ComboBox<>();

	@FXML
	void initialize() {
		mainApp = new MainApp();
		manageLanguageCombo();
	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public MainApp getMainApp() {
		return mainApp;
	}

	public void manageLanguageCombo() {
		languagebox.setItems(languages);
		languagebox.setPromptText("Choose a language");
		
		/*combobox.getSelectionModel().getSelectedItem().fieldNeededFromLanguageClass()*/
		languagebox.setOnAction((e) -> {
			System.out.println(languagebox.getSelectionModel().getSelectedItem().getKey());
		});
	}

}
