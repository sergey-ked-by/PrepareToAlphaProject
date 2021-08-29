package patterns.builder;

public interface PCBuilder {
    public PCBuilder fixCPU();
    public PCBuilder fixRAM();
    public PCBuilder fixSSD();
    public PC build();
}
