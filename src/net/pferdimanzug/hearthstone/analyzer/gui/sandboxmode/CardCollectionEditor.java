package net.pferdimanzug.hearthstone.analyzer.gui.sandboxmode;

import java.io.IOException;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.BorderPane;
import javafx.util.StringConverter;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Card;
import net.pferdimanzug.hearthstone.analyzer.game.cards.CardCatalogue;
import net.pferdimanzug.hearthstone.analyzer.game.cards.CardCollection;

public class CardCollectionEditor extends BorderPane {

	@FXML
	private Label headerLabel;

	@FXML
	private Label cardCountLabel;

	@FXML
	private ListView<Card> editableListView;
	@FXML
	private ListView<Card> catalogueListView;

	@FXML
	private TextField filterTextfield;
	@FXML
	private Button clearFilterButton;

	@FXML
	private Button addCardButton;
	@FXML
	private Button removeCardButton;

	@FXML
	private Button okButton;

	@FXML
	private Button cancelButton;

	private ICardCollectionEditingListener listener;

	private int cardLimit;

	public CardCollectionEditor(String title, CardCollection cardCollection, ICardCollectionEditingListener listener, int cardLimit) {
		this.listener = listener;
		this.cardLimit = cardLimit;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CardCollectionEditor.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}

		headerLabel.setText(title);

		populateEditableView(cardCollection);
		editableListView.setCellFactory(TextFieldListCell.forListView(new CardStringConverter()));

		populateCatalogueView(null);
		catalogueListView.setCellFactory(TextFieldListCell.forListView(new CardStringConverter()));

		filterTextfield.textProperty().addListener(this::onFilterTextChanged);
		clearFilterButton.setOnAction(actionEvent -> filterTextfield.clear());

		okButton.setOnAction(this::handleOkButton);
		cancelButton.setOnAction(this::handleCancelButton);

		addCardButton.setOnAction(this::handleAddCardButton);
		removeCardButton.setOnAction(this::handleRemoveCardButton);
	}

	private void populateEditableView(CardCollection cardCollection) {
		ObservableList<Card> data = FXCollections.observableArrayList();
		for (Card card : cardCollection) {
			data.add(card);
		}
		data.addListener(this::handleEditableCardListChanged);
		handleEditableCardListChanged(null);
		editableListView.setItems(data);
	}

	private void handleEditableCardListChanged(Change<? extends Card> change) {
		int count = editableListView.getItems().size();
		cardCountLabel.setText("Cards in collection: " + count + "/" + cardLimit);
		addCardButton.setDisable(count >= cardLimit);
	}

	private void populateCatalogueView(String filter) {
		ObservableList<Card> data = FXCollections.observableArrayList();
		for (Card card : CardCatalogue.getAll()) {
			if (filter == null || card.matchesFilter(filter)) {
				data.add(card);
			}
		}
		catalogueListView.setItems(data);
	}

	private void handleCancelButton(ActionEvent actionEvent) {
		this.getScene().getWindow().hide();
	}

	private void handleOkButton(ActionEvent actionEvent) {
		CardCollection changedCollection = new CardCollection();
		for (Card card : editableListView.getItems()) {
			changedCollection.add(card);
		}
		listener.onFinishedEditing(changedCollection);
		this.getScene().getWindow().hide();
	}

	private void onFilterTextChanged(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		populateCatalogueView(newValue);
	}

	private void handleRemoveCardButton(ActionEvent actionEvent) {
		editableListView.getItems().removeAll(editableListView.getSelectionModel().getSelectedItems());
	}

	private void handleAddCardButton(ActionEvent actionEvent) {
		for (Card card : catalogueListView.getSelectionModel().getSelectedItems()) {
			editableListView.getItems().add(card.clone());
		}
	}

	private class CardStringConverter extends StringConverter<Card> {

		@Override
		public Card fromString(String arg0) {
			return null;
		}

		@Override
		public String toString(Card card) {
			String result = card.getName();
			result += " [" + card.getCardType() + "] ";
			result += "Mana: " + card.getBaseManaCost();
			return result;
		}

	}

}
