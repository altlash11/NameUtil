package org.util.name;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Alex on 5/30/2017.
 */
public class NameUtilTest {

    @Test
    public void testSingleName() {
        //Arrange
        String name = "Alex";

        //Act
        Name processedName = NameUtil.getInstance().processName(name);

        //Assess
        assertEquals(name, processedName.getCompleteName());
        assertEquals(name, processedName.getFirstName());
        assertNull(processedName.getLastName());
        assertNull(processedName.getSalutation());
    }

    @Test
    public void testFirstAndLast() {
        //Arrange
        String nameInput = "Alex Bennett";
        String firstName = "Alex";
        String lastName = "Bennett";

        //Act
        Name processedName = NameUtil.getInstance().processName(nameInput);

        //Assess
        assertEquals(nameInput, processedName.getCompleteName());
        assertEquals(firstName, processedName.getFirstName());
        assertEquals(lastName, processedName.getLastName());
        assertNull(processedName.getSalutation());
    }

    @Test
    public void testSalutationFirstAndLast() {
        //Arrange
        String nameInput = "Mr. Alex Bennett";
        String salutation = "Mr";
        String firstName = "Alex";
        String lastName = "Bennett";

        //Act
        Name processedName = NameUtil.getInstance().processName(nameInput);

        //Assess
        assertEquals(nameInput, processedName.getCompleteName());
        assertEquals(salutation, processedName.getSalutation());
        assertEquals(firstName, processedName.getFirstName());
        assertEquals(lastName, processedName.getLastName());
    }

    @Test
    public void testSalutationAndLast() {
        //Arrange
        String nameInput = "Mr. Bennett";
        String salutation = "Mr";
        String lastName = "Bennett";

        //Act
        Name processedName = NameUtil.getInstance().processName(nameInput);

        //Assess
        assertEquals(nameInput, processedName.getCompleteName());
        assertEquals(salutation, processedName.getSalutation());
        assertEquals(lastName, processedName.getLastName());
        assertNull(processedName.getFirstName());
    }
}
