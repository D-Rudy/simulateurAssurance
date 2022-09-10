package com.mycompany.insuranceSimulator.customer;

public class Customer {

    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private Boolean isMarried;
    private Boolean hasChildren;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nom='" + lastName + '\'' +
                ", Prénom='" + firstName + '\'' +
                ", Date de naissance='" + dateOfBirth + '\'' +
                ", Marié?=" + isMarried +
                ", A des enfants?=" + hasChildren +
                '}';
    }
}
