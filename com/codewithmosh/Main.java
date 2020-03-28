package com.codewithmosh;

public class Main {
    public static void main(String[] names) {
      var graph = new Graph();
      graph.addNode("A");
      graph.addNode("B");
      graph.addNode("C");
      graph.addNode("D");
      graph.addNode("E");

      graph.addEdge("A", "B");
      graph.addEdge("A", "E");
      graph.addEdge("B", "E");
      graph.addEdge("C", "A");
      graph.addEdge("C", "B");
      graph.addEdge("C", "D");
      graph.DFSRecursive("C");
    }
}
