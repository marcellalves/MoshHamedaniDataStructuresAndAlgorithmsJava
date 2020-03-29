package com.codewithmosh;

public class Main {
    public static void main(String[] names) {
      var graph = new Graph();
      graph.addNode("X");
      graph.addNode("A");
      graph.addNode("B");
      graph.addNode("P");

      graph.addEdge("X", "A");
      graph.addEdge("X", "B");
      graph.addEdge("A", "P");
      graph.addEdge("B", "P");
      var list = graph.topologicalSort();
      System.out.println(list);
    }
}
