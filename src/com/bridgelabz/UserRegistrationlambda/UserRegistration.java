package com.bridgelabz.UserRegistrationlambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     * @param name to check the name pattern
     */
    public boolean emailCheck(String name) throws UserRegistrationException {
        if (name == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("([a-zA-Z0-9-_]{3,})[a-zA-Z0-9.-_]*[@][a-zA-Z0-9]*[a-zA-Z0-9.-_]{3,}[a-zA-Z0-9.-_]*", name);
            return check;
        };
        return verification.validate(name);
    }

    /**
     * @param name is used to check pattern for first name
     */
    public boolean firstName(String name) throws UserRegistrationException {

        if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        } else if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("([A-Z][a-z]{2,})", name);
            return check;
        };
        return verification.validate(name);

    }

    /**
     * @param name checks the pattern of last name
     */
    public boolean lastName(String name) throws UserRegistrationException {
        if (name == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("([A-Z][a-z]{2,})", name);
            return check;
        };
        return verification.validate(name);
    }

    /**
     * @param number checks the number pattern
     */

    public boolean numberCheck(String number) throws UserRegistrationException {
        if (number == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (number.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("[9][1][\s][0-9]{10}", number);
            return check;
        };
        return verification.validate(number);
    }

    /**
     * @param password checks the password pattern
     */

    public boolean checkPassword(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (password.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9]{8,}[@$!%*?&]{1}$", password);
            return check;
        };
        return verification.validate(password);
    }


public static void main(String[] args) throws UserRegistrationException {
	UserRegistration usr = new UserRegistration();
	Scanner sc = new Scanner(System.in);
	boolean flag = false;

	do {
		System.out.println("****** Welcome to Lambda Function to validate User Entry ******");
		System.out.println("1: Check Name Pattern");
		System.out.println("2: Check E-Mail Pattern");
		System.out.println("3: Check PhoneNum Pattern");
		System.out.println("4: Check PassWord Pattern");
		System.out.println("5: Exit");
		System.out.println("Enter to option : ");
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Enter the first Name : ");
			String name = sc.next();
			usr.firstName(name);
			break;
		case 2:
			System.out.println("Enter the last Name : ");
			String name1 = sc.next();
			usr.lastName(name1);
			break;
			
		case 3:
			System.out.println("Enter the e-Mail : ");
			String eMail = sc.next();
			usr.emailCheck(eMail);
			break;
			
		case 4:
			System.out.println("Enter the phoneNum : ");
			String phoneNum = sc.next();
			usr.numberCheck(phoneNum);
			break;
			
		case 5:
			System.out.println("Enter the passWord : ");
			String passWord = sc.next();
			usr.checkPassword(passWord);
			break;
			
		case 6:
			
			flag = true;
			break;
		}

	} while (flag);
}
}