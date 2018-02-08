package com.company;

import javafx.scene.Node;

public class Main {

    public static void main(String[] args) {
        //Package - a way of grouping related classes and interfaces together

        //javafx.scene.Node node = null; //specified package with Node class
        //Package is not imported - always have to type it out
        //Import one package, declare another for same "Node" class

        Node node = null;
        org.w3c.dom.Node anotherNode = null;
    }
}
