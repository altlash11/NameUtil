package org.util.name;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alex on 6/4/2017.
 */
public class Salutations {
    private static final Set<String> salutations;
    static {
        Set<String> sals = new HashSet<String>(
                Arrays.asList("mr",
                        "mrs",
                        "miss",
                        "dr",
                        "ms",
                        "prof",
                        "rev",
                        "lady",
                        "sir",
                        "capt",
                        "major",
                        "lt col",//TODO
                        "col",
                        "lt cmdr",
                        "the hon",
                        "hon",
                        "cmdr",
                        "flt lt",
                        "brgdr",
                        "judge",
                        "lord",
                        "the hon mrs",
                        "wng cmdr",
                        "group capt",
                        "rt hon lord",
                        "revd father",
                        "revd canon",
                        "maj gen",
                        "air cdre",
                        "viscount",
                        "dame",
                        "rear admrl"
                )
        );

        salutations = sals;
    }
    private Salutations(){}

    public static boolean contains(String element) {
        return salutations.contains(element.toLowerCase());
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
