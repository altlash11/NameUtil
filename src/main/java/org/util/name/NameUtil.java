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

        String[] parts = input.split(DELIMITER);
        for(int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
            if(!firstNameSet) {
                firstNameSet = checkFirstName(parts[i], name);
            } else if(!lastNameSet) {
                lastNameSet = checkLastName(parts[i], name);
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



    /*
    Mr.
Mrs.
Miss
Dr.
Ms.
Prof.
Rev.
Lady
Sir
Capt.
Major
Lt.-Col.
Col.
Lady
Lt.-Cmdr.
The Hon.
Cmdr.
Flt. Lt.
Brgdr.
Judge
Lord
The Hon. Mrs
Wng. Cmdr.
Group Capt.
Rt. Hon. Lord
Revd. Father
Revd Canon
Maj.-Gen.
Air Cdre.
Viscount
Dame
Rear Admrl.


52.851%
37.062%
4.839%
2.692%
1.967%
0.098%
0.078%
0.059%
0.055%
0.048%
0.037%
0.033%
0.020%
0.017%
0.013%
0.011%
0.006%
0.006%
0.005%
0.004%
0.004%
0.004%
0.004%
0.003%
0.003%
0.003%
0.003%
0.002%
0.002%
0.002%
0.002%
0.001%
     */



}
