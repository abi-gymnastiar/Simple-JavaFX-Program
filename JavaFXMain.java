import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage s)
    {
        s.setTitle("Input Name Program");
        TilePane r = new TilePane();
        Label l = new Label("Your Name is Here");
        TextInputDialog td = new TextInputDialog();
        Button d = new Button("Input Name");
  
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                // show the text input dialog
                td.showAndWait();
  
                // set the text of the label
                l.setText(td.getEditor().getText());
            }
        };
  
        d.setOnAction(event);
  
        r.getChildren().add(d);
        r.getChildren().add(l);
  
        Scene sc = new Scene(r, 500, 300);
        s.setScene(sc);
        s.show();
    }
  
    public static void main(String args[])
    {
        launch(args);
    }
}
