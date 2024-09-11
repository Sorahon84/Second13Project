package org.example.ProjectSecond10;

public class E13Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email. Please use a Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && !userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. Username cannot  be empty and must be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty() && password.length() > 6 && !password.contains(this.userName)) {
            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Invalid password. Password cannot be empty, must be longer than 6 characters, and not contain the username.");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        E13Registration registration = new E13Registration();
        registration.setEmail("user@yahoo.com");
        registration.setUserName("user123");
        registration.setPassword("secPassword123");

        System.out.println();
        registration.setEmail("user@gmail.com");
        registration.setUserName("user");
        registration.setPassword("user123");
    }
}
