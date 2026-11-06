package com.joysistvi.day20.encapsulation;

import java.util.regex.Pattern;

public class UserAccount {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final int MIN_PASSWORD_LENGTH = 8;

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserAccount() {
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        if (middleName == null || middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = requireNonBlank(firstName, "First name");
    }

    public void setMiddleName(String middleName) {
        // Middle name is optional
        this.middleName = middleName == null ? "" : middleName.trim();
    }

    public void setLastName(String lastName) {
        this.lastName = requireNonBlank(lastName, "Last name");
    }

    public void setAddress(String address) {
        this.address = requireNonBlank(address, "Address");
    }

    public void setEmail(String email) {
        String value = requireNonBlank(email, "Email");
        if (!EMAIL_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException(
                    "Email must follow the format name@domain.com.");
        }
        this.email = value;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < MIN_PASSWORD_LENGTH) {
            throw new IllegalArgumentException(
                    "Password must be at least " + MIN_PASSWORD_LENGTH + " characters long.");
        }
        if (password.contains(" ")) {
            throw new IllegalArgumentException("Password must not contain spaces.");
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        if (!hasLetter || !hasDigit) {
            throw new IllegalArgumentException(
                    "Password must contain at least one letter and one number.");
        }
        this.password = password;
    }

    private String requireNonBlank(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " must not be empty.");
        }
        return value.trim();
    }
}
