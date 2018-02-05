package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {//interface defines "what" needs to be done not "how"
    //Using List instead of ArrayList is a form of abstraction
    List<String> write();
    void read(List<String> savedValues);

}
