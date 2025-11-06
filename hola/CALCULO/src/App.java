import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args)  {
        launch(args);
        
    }

    @Override
    public void start(Stage arg0)  {
        Parent root;
        try{
         root=FXMLLoader.load(getClass().getResource("captura.fxml") );
         Scene scene = new Scene(root);
         arg0.setTitle(" programa de calculo");
         arg0.setScene(scene);
         arg0.show();


        }catch(IOException e){
            System.out.println("error "+ e);
        }
       
    }
}
