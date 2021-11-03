package Atividade37.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class baseController<T> {
    public ArrayList<T>dados; 
    Scanner sc = new Scanner(System.in);

    //CRUD

    public void create(T obj){
        this.dados.add(obj);
    }

    public ArrayList<T> read(){
        return this.dados;
    }

    public void update(T obj){
        if(contains(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj){
        this.dados.remove(obj);
    }

    public boolean contains(T obj){
        return this.dados.contains(obj);
    }   
}
