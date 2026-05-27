public class ClassTests_GrafoComplejo {
    public static void main(String[] args) throws InterruptedException {
        Graph graph = new Graph();

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(0, 3, 7);
        graph.addEdge(1, 4, 3);
        graph.addEdge(1, 5, 6);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        graph.addEdge(3, 5, 2);
        graph.addEdge(3, 6, 4);
        graph.addEdge(4, 6, 5);
        graph.addEdge(5, 6, 1);

        SequentialShortestPathSolver sequential = new SequentialShortestPathSolver(graph, 6);
        PathResult sequentialResult = sequential.solve(0);

        System.out.println("Resultado secuencial:");
        System.out.println(sequentialResult);

        ParallelShortestPathSolver parallel = new ParallelShortestPathSolver(graph, 6);
        PathResult parallelResult = parallel.solve(0);

        System.out.println("Resultado paralelo:");
        System.out.println(parallelResult);
    }
}
