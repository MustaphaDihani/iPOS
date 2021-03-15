/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class POS extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Dashbord.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("POS");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        launch(args);
    }
    
}
