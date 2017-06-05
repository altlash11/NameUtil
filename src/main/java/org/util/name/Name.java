package org.util.name;

/**
 * Created by Alex on 6/4/2017.
 */
public class Name {
    private String salutation;
    private String firstName;
    private String lastName;
    private String completeName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
