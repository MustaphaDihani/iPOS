/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TablesController implements Initializable {
    DAO dao;
    @FXML
    private Button Enregistrer;
    @FXML
    private Button Majour;
    @FXML
    private Button Supp;
    @FXML
    private TableView<Tables> TabTables;
    @FXML
    private TableColumn<Tables, Integer> IDCol;
    @FXML
    private TableColumn<Tables, String> NomCol;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dao=new DAO();
        showTables();
    }    
    public void showTables(){
        ObservableList<Tables> list =getTableList();
         IDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
         NomCol.setCellValueFactory(new PropertyValueFactory<>("Nom"));
         TabTables.setItems(list);
    }
    public ObservableList<Tables> getTableList(){
        ObservableList<Tables>  tableList=FXCollections.observableArrayList();
        Connection connection = (Connection) dao.getConnection();
        String QueryTables="SELECT*FROM Tables";
        Statement stmnt;
        ResultSet rslt;
        try{
            stmnt=connection.createStatement();
            rslt=stmnt.executeQuery(QueryTables);
            Tables tables;
            while(rslt.next()){
                tables=new Tables(rslt.getInt("id"),rslt.getString("TableNom"));
                tableList.add(tables);
            }
        }
        catch(SQLException Ex){
            Ex.printStackTrace();
        }
        return tableList;
    }
    
}
