import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mashaly
 */
public class Loginform extends Application {

    LoginAuthientcation authientcation;
    AtmWindow atm;
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Account account =new Account("0");
        authientcation = new LoginAuthientcation();
        atm = new AtmWindow();
        primaryStage.setTitle("Login");
       
    
       Label passwordLabel = new Label("password");
       
      
       PasswordField passwordField = new PasswordField();
        Button submit = new Button ("submit");
        Label validationLabel = new Label();
        
        GridPane grid = new GridPane();
        
        grid.add(passwordLabel, 0 ,1);
        
        grid.add(passwordField, 1 , 1);
        grid.add(submit, 1 , 2);
        grid.add(validationLabel,1,3);
    
        submit.setOnAction(new EventHandler<ActionEvent>() {

           public void handle(ActionEvent event) {
               
               String password= passwordField.getText();
               
               boolean valid = authientcation.validate(password);
               if(valid){
                   validationLabel.setText("Welcome momoo");
                   primaryStage.close();
                   atm.showWindow(primaryStage,account);
                   
               }
               else {
                   validationLabel.setText("Wrong user or password");}
           }
        });
        
               Scene scene = new Scene(grid,600,400);
               primaryStage.setScene(scene);
               primaryStage.show();
           
        
        }
                }
                
                