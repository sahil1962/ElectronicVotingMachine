package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MainController {
	@FXML private Label textLabel = new Label();
	
	@FXML private Button GoToAdminOrVoterChoose = new Button();
	@FXML private Button GoToAdminRegisterORLoginPage = new Button();
	@FXML private Button GoToAdminRegisterAdmin  = new Button();
    @FXML private Button GoToAdminLoginPage = new Button();
    
    @FXML private Button GoToVoterLoginPage = new Button();
    @FXML private Button GoToAdminWorksPage = new Button();
    @FXML private Button GoToVoterSettingPage = new Button();
    @FXML private Button GoToAdminOrVoterPage = new Button();
    @FXML private Button GoToHowToVotePage = new Button();
    @FXML private Button GoToCastVote = new Button();
    @FXML private Button GoToPartyInfo = new Button();
//Admin Works
    //Register
    @FXML private TextField AdminRegisterCNIC = new TextField();
    @FXML private TextField AdminRegisterUsername = new TextField();
    @FXML private TextField AdminRegisterPassword = new TextField();
    //Login
    @FXML private TextField AdminUsername = new TextField();
    @FXML private TextField AdminPassword = new TextField();

    @FXML
    public void GoToAdminOrVoterChooseFunc(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("AdminOrVoterChoose.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		textLabel.setText("Hello user, this is your first app");
		System.out.println("This is Go To Admin Or Voter Choose Func");
	}

    @FXML
    public void GoToAdminRegisterORLoginPageFunc(ActionEvent event) {
		AdminWorks AW = new AdminWorks();
    	
    	String Username = "", CNIC = "", Password = "";
		Username = AdminRegisterUsername.getText().toString();
		CNIC = AdminRegisterCNIC.getText().toString();
		Password = AdminRegisterPassword.getText().toString();
		
		System.out.println("Admin Username : " + Username);
		System.out.println("Admin CNIC : " + CNIC);
		System.out.println("Admin Password : " + Password);
		AW.Register(Username, CNIC, Password);
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("AdminRegisterORLogin.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		textLabel.setText("Hello user, this is your first app");
		System.out.println("This is Go To Admin Or Voter Choose Func");
	}
    
    @FXML
    public void GoToAdminRegisterAdminFunc(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("RegisterAdmin.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		textLabel.setText("Hello user, this is your first app");
		System.out.println("This is Go To Admin Or Voter Choose Func");
	}
    
    @FXML
    public void GoToAdminLoginPageFunc(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
			System.out.println("Admin button is pressed");
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML    
    public void GoToVoterLoginPageFunc(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("VoterLogin.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
			System.out.println("Voter button is pressed");
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML    
    public void GoToAdminWorksPageFunc(ActionEvent event) {
		String Username = "", Password = "";
		Username = AdminUsername.getText().toString();
		Password = AdminPassword.getText().toString();
		
		System.out.println("Admin Username : " + Username);
		System.out.println("Admin Password : " + Password);
    	try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("AdminWorksName.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
			System.out.println("Admin is logged in");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    //@FXML
    public void GoToVoterSettingPageFunc(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("VoterCastVoteSetting.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    
//    @FXML
    public void GoToHowToVotePageFunc(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("HowToCastVotePage.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

//    @FXML
    public void GoToCastVoteFunc(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("CastVotePage.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    
//    @FXML
    public void GoToPartyInfoFunc(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("AllPartyInformation.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Java fx Project");
			stage.show();
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
