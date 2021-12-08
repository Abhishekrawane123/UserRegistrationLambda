package com.bridgelabz.UserRegistrationlambda;

import org.junit.Assert;
import org.junit.Test;


public class TestUserRegistration {

    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            Boolean result = user.emailCheck("abc@abc.com");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPatternForFirstNameWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean name = user.firstName("Subham");
            Assert.assertTrue(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPatternOfLastNameWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean lastName = user.lastName("Das");
            Assert.assertEquals(true, lastName);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAMobileNumberPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean number = user.numberCheck("91 7003321213");
            Assert.assertTrue(number);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPasswordPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean password = user.checkPassword("Xxxxxxx9@");
            Assert.assertTrue(password);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }


}