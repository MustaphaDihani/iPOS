/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DashbordController implements Initializable {
    Scene fxmlfile;
    Parent root;
    Stage Window;
    @FXML
    private Button TableBtn;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    private void openModalWindow(String Resource,String title) throws IOException{
        root =FXMLLoader.load(getClass().getResource(Resource));
        fxmlfile= new Scene(root);
        Window=new Stage();
        Window.setScene(fxmlfile);
        Window.initModality(Modality.APPLICATION_MODAL);
        Window.setAlwaysOnTop(true);
        Window.setIconified(false);
        Window.initStyle(StageStyle.UNDECORATED);
        Window.setTitle(title);
        Window.showAndWait();
        
        
    }
     void showTables() throws IOException{
        Stage stage = null;
        Parent Root = FXMLLoader.load(getClass().getResource("Tables.fxml"));
        Scene scene = new Scene(Root);
        stage.setTitle("Tables");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GereTable(ActionEvent event) throws IOException  {
   showTables();
    }

   
    

 
}
