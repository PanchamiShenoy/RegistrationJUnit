import java.util.regex.Pattern;

public class UserRegistration {
	String name = "^[A-Z][a-z]{2}[a-z]*";
	String phone = "[1-9][0-9]\\s[1-9][0-9]{9}";

	String email = "^[a-zA-Z+_]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}+\\.?[a-zA-Z-_]*";

	String password = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}";

	/**
	 * method to validate first name
	 * 
	 * @param firstName - firstname to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validateFirstName(String firstName) throws InvalidUserDetailException {

		boolean result = Pattern.matches(name, firstName);
		if (result) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid First name");
		}
	}

	/**
	 * method to validate second name
	 * 
	 * @param secondName - secondName to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validateLastName(String lastName) throws InvalidUserDetailException {
		boolean result = Pattern.matches(name, lastName);
		if (result) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid last name");
		}
	}

	/**
	 * method to validate phone number
	 * 
	 * @param phoneNumber - phone number to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserDetailException {
		boolean result = Pattern.matches(phone, phoneNumber);
		if (result) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid phone number");
		}
	}

	/**
	 * method to validate email
	 * 
	 * @param email-email to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validateEmail(String email1) throws InvalidUserDetailException {
		boolean result = Pattern.matches(email, email1);
		if (result) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid email");
		}

	}

	/**
	 * method to validate password
	 * 
	 * @param password -password to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validatePassword(String password1) throws InvalidUserDetailException {
		boolean result = Pattern.matches(password, password1);
		if (result) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid First name");
		}
	}

}
