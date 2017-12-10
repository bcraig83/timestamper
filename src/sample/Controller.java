package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
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
    LocalDateTime localDateTime = localDate.atTime(LocalTime.MIDNIGHT);

    Long millisecondValue = localDateTime.toEpochSecond(ZoneOffset.UTC);

    result.setText(String.valueOf(millisecondValue));
  }
}
