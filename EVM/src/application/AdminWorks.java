package application;

public class AdminWorks {
	
	public void Register(String Username, String CNIC, String Password) {
		OracleCon OrcaleConnection = new OracleCon();
		boolean CheckNewAdminCNIC = OrcaleConnection.CheckNoAlreadyRegisterAdmin(CNIC);
		if (CheckNewAdminCNIC == false) {
			System.out.println("********New Admin Registered Successfully********");
			OrcaleConnection.RegisterAdminFunction(Username, CNIC, Password);
		}
		
		
	}

}
