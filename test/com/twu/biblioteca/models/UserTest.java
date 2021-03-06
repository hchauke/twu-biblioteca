package com.twu.biblioteca.models;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserTest {
    private static User user;

    @BeforeClass
    public static void setUp() {
        user = new User("Name", "Email", "Password", "PhoneNumber");
    }

    @Test
    public void userMustHaveALoginAndPasswordAndEmailAndNameAndPhoneNumber() {
        Assert.assertTrue(user instanceof User);
    }

    @Test
    public void usersLoginIsGeneratedAccordingToTheNumberOfUsers() {
        Assert.assertEquals(User.generateUserLogin(User.userCount - 1), user.getLogin());

        User u = new User("T", "T", "T", "T");
        Assert.assertEquals(User.generateUserLogin(User.userCount - 1), u.getLogin());

        User u2 = new User("T", "T", "T", "T");
        Assert.assertEquals(User.generateUserLogin(User.userCount - 1), u2.getLogin());
    }

}
