package com.codewithmosh;

public class Main {
    public static void main(String[] names) {
      var graph = new Graph();
      graph.addNode("A");
      graph.addNode("B");
      graph.addNode("C");
      graph.addEdge("A", "B");
      graph.addEdge("A", "C");
      graph.removeNode("A");
      graph.addEdge("B", "C");
      graph.print();
    }
}
