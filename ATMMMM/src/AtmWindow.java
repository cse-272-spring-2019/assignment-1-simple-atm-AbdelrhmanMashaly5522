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
public class AtmWindow extends Application{

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void showWindow(Stage primaryStage,Account account){
       
        TransactionWindow transaction = new TransactionWindow();
        primaryStage.setTitle("Atm window");
        
        Button Deposit = new Button ("Deposit");
        Button Withdraw = new Button ("Withdraw");
        Button BalanceInquiry = new Button ("Balance");
        Button Prev = new Button ("previous");
        Button next = new Button ("next");
        Label showAmount= new Label();
        
        GridPane grid = new GridPane();
        grid.add(Deposit, 0 ,0);
        grid.add(Withdraw, 0 ,1);
        grid.add(Prev, 1 ,0);
        grid.add(next, 1 , 1);
        grid.add(showAmount, 0, 3);
        grid.add(BalanceInquiry,1,3);
        
        Deposit.setOnAction(e -> {
           primaryStage.close();
           transaction.showWindow(primaryStage , account , 1);
        });
         Withdraw.setOnAction(e -> {
           primaryStage.close();
           transaction.showWindow(primaryStage,account , 0);
        });
        BalanceInquiry.setOnAction(e -> {
          showAmount.setText(account.balance);
        });
        
        
        Scene  scene= new Scene(grid,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}
