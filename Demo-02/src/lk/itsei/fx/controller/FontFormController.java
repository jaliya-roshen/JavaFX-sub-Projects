package lk.itsei.fx.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.List;

public class FontFormController {

    @FXML
    private ListView<String> lstView;

    public void initialize() {

        ObservableList items = lstView.getItems();
        List<String> fontNames = Font.getFontNames();
        for (String fontName : fontNames) {

            items.addAll(fontName);
        }

        clrPicker.valueProperty().addListener(new ChangeListener<Color>() {
            @Override
            public void changed(ObservableValue<? extends Color> observable, Color oldValue, Color newValue) {

                txtSampleText.setTextFill(newValue);
            }
        });
 
        sdrFontSize.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double fontSize = newValue.doubleValue();
                String currentFontName = txtSampleText.getFont().getName();
                Font font = new Font(currentFontName, fontSize);
                txtSampleText.setFont(font);
            }
        });

        lstView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                String selectFontName = newValue;
                double currentFontSize = txtSampleText.getFont().getSize();
                Font font = new Font(selectFontName, currentFontSize);
                txtSampleText.setFont(font);
            }
        });

        double currentFontSize = txtSampleText.getFont().getSize();
        sdrFontSize.setValue(currentFontSize);

        ObservableList<Integer> cmbList = cmbBox.getItems();
        for (int i = 0; i <= 100; i += 5) {

            cmbList.add(i);
        }


    }

    @FXML
    private Slider sdrFontSize;

    @FXML
    private ColorPicker clrPicker;

    @FXML
    private ComboBox<Integer> cmbBox;

    @FXML
    private Label txtSampleText;

    @FXML
    void txtInputFontValue(ActionEvent event) {

        double FontSizeValue = cmbBox.getValue();
        sdrFontSize.setValue(FontSizeValue);
        String currentFontName = txtSampleText.getFont().getName();
        Font font = new Font(currentFontName, FontSizeValue);
        txtSampleText.setFont(font);

    }


}
