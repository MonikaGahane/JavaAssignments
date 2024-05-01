package custome_exception;

@SuppressWarnings("serial")
public class CustManageSysException extends Exception {
	public CustManageSysException(String mesg) {
		super (mesg);
	}
}
