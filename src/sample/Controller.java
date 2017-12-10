package sample;

import static java.time.temporal.ChronoField.EPOCH_DAY;

import java.time.LocalDate;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Controller {

  @FXML
  private DatePicker datePicker;

  @FXML
  private TextField result;

  public void calculateMillisecondValue() {
    System.out.println(datePicker.getValue());

    LocalDate localDate = datePicker.getValue();

    Long millisecondValue = localDate.getLong(EPOCH_DAY);

    result.setText(String.valueOf(millisecondValue));
  }
}
