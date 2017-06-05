package org.util.name;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Alex on 5/30/2017.
 */
public class NameUtil {

    private static final NameUtil INSTANCE = new NameUtil();
    private static final String DELIMITER = " ";

    private NameUtil() {}

    public static NameUtil getInstance() {
        return INSTANCE;
    }

    static Name processName(String input) {
        Name name = new Name();
        name.setCompleteName(input);

        boolean firstNameSet = false;
        boolean lastNameSet = false;
        boolean containsSalutation = false;

        String[] parts = input.split(DELIMITER);
        for(int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
            parts[i] = StringUtils.remove(parts[i], '.');

            if(checkSalutations(parts[i], name)){
                containsSalutation = true;
                continue;
            }

            if(containsSalutation && i == parts.length - 1) {
                checkLastName(parts[i], name);
            } else {
                if (!firstNameSet) {
                    firstNameSet = checkFirstName(parts[i], name);
                } else if (!lastNameSet) {
                    lastNameSet = checkLastName(parts[i], name);
                }
            }
        }

        return name;
    }

    private static boolean checkFirstName(String input, Name name) {
        if(!StringUtils.isBlank(input)) {
            name.setFirstName(input);
            return true;
        }
        return false;
    }

    private static boolean checkLastName(String input, Name name) {
        if(!StringUtils.isBlank(input)) {
            name.setLastName(input);
            return true;
        }
        return false;
    }

    private static boolean checkSalutations(String input, Name name) {
        if(Salutations.contains(input)) {
            name.setSalutation(input);
            return true;
        }
        return false;
    }





}
