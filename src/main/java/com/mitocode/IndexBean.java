package com.mitocode;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
@Getter
@Setter
public class IndexBean implements Serializable {

    private List<String> list;
    private String name;

    @PostConstruct
    public void init(){
        list = new ArrayList<>();
    }

    public void add(){
        list.add(name);
    }

    public void remove(String e){
        list.removeIf( x -> x.equals(e));
    }
}
