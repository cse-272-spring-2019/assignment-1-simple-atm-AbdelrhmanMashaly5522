/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/**
 *
 * @author WEST
 */
public class TransactionWindow extends Application {
AtmWindow atm= new AtmWindow();

    @Override
    public void start(Stage primaryStage) throws Exception {
         
      
        

    }
    public void showWindow(Stage primaryStage , Account account , int transfer){
        TextField textfield=new TextField("");
        Button one1=new Button("1");
        Button two2=new Button("2");
        Button three3=new Button("3");
        Button four4=new Button("4");
        Button five5=new Button("5");
        Button six6=new Button("6");
        Button seven7=new Button("7");
        Button eight8=new Button("8");
        Button nine9=new Button("9");
        Button zero=new Button("0");
        Button enter=new Button("Enter");
        Button back=new Button("Back");
        Label errorLabel = new Label();

        
        GridPane grid = new GridPane();
        grid.add(textfield, 3, 2);
        grid.add(zero, 1, 4);
          grid.add(one1, 0, 1);
          grid.add(two2, 1, 1);
          grid.add(three3, 2, 1);
          grid.add(four4, 0, 2);
          grid.add(five5, 1, 2);
          grid.add(six6, 2, 2);
          grid.add(seven7, 0, 3);
          grid.add(eight8, 1, 3);
          grid.add(nine9, 2, 3);
          grid.add(enter, 4, 4);
          grid.add(back, 4, 5);
          grid.add(errorLabel,1 ,6);

        Scene scene = new Scene(grid,600,400);
        one1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+one1.getText();
                textfield.setText(textFieldNewstring);
            }
        });
         two2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+two2.getText();
                textfield.setText(textFieldNewstring);
            }
        });
          three3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+three3.getText();
                textfield.setText(textFieldNewstring);
            }
        });
           four4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+four4.getText();
                textfield.setText(textFieldNewstring);
            }
        });
            five5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+five5.getText();
                textfield.setText(textFieldNewstring);
            }
        });
             six6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+six6.getText();
                textfield.setText(textFieldNewstring);
            }
        });
              seven7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+seven7.getText();
                textfield.setText(textFieldNewstring);
            }
        });
               eight8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+eight8.getText();
                textfield.setText(textFieldNewstring);
            }
        });
                nine9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+nine9.getText();
                textfield.setText(textFieldNewstring);
            }
        });
                 zero.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textFieldNewstring=textfield.getText()+zero.getText();
                textfield.setText(textFieldNewstring);
            }
        });
       enter.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String amount=textfield.getText();
                if(transfer==1){
                    
                    account.deposite(amount);
                }
                else 
                    account.withdraw(amount);
                }
        });
         back.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
                atm.showWindow(primaryStage,account);
            }
        });
         
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
