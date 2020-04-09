package com.codewithmosh;

public class Main {
    public static void main(String[] names) {
      var graph = new Graph();
      graph.addNode("A");
      graph.addNode("B");
      graph.addNode("C");
      graph.addNode("D");

      graph.addEdge("A", "B");
      graph.addEdge("B", "C");
      graph.addEdge("A", "C");
      graph.addEdge("D", "A");
      //var list = graph.topologicalSort();
      //System.out.println(list);
      System.out.println(graph.hasCycle());
    }
}
