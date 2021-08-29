package patterns.builder;

public class Main {
    PCBuilder builder = new NotebookBuilder();
    PC PC = builder
            .fixCPU()
            .fixRAM()
            .fixSSD()
            .build();

}
