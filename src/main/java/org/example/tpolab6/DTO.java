package org.example.tpolab6;

import java.util.ArrayList;
import java.util.List;

public class DTO {
    private List<Person> list = new ArrayList<>();
    public DTO() {}

    public List<Person> gList() {
        return list;
    }

    public void addToList(List<Person> nList){
        list.addAll(nList);
    }
}
