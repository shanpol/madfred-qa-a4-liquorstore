import javax.swing.JOptionPane;


public class AgeChecker {

	//This part of code prompts user to input first name, last name and year of birth
	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog(null, "What is your first name?");
		String lastName = JOptionPane.showInputDialog(null, "What is your last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?"));
		
	//this part of the code calls the methods verifyLegalAge and concatenateNames
		boolean oldEnough = verifyLegalAge(yearOfBirth);
		String fullName = concatenateNames(firstName, lastName);
		
	//this part of code outputs information to the user depending on the age verification
		if(oldEnough == true) {
			JOptionPane.showMessageDialog(null, fullName + ", you may proceed with your shopping");
		} else {
			JOptionPane.showMessageDialog(null, fullName + ", you're not old enough, try disney.com instead!");
		}

	}
	
	/*this part of code is a method that takes an int parameter from the user 
	*for year of birth and returns a boolean value of true if its 19 years or older
	*/
public static boolean verifyLegalAge(int yob) {
	boolean legalAgeStatus = (2013-yob) >= 19;
	return legalAgeStatus;
}

//this part of the code is a method that uses two strings and concenates them into one

public static String concatenateNames(String fn, String ln){
	String fullName = fn + " " + ln;
	return fullName;
	}
}
