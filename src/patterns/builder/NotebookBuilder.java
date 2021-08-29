package patterns.builder;

public class NotebookBuilder implements PCBuilder {
    private String cpu;
    private String ram;
    private String ssd;

    public NotebookBuilder() {
        super();
    }

    @Override
    public PCBuilder fixCPU() {
        this.cpu = "Intel";
        return this;
    }

    @Override
    public PCBuilder fixRAM() {
        this.ram = "8 Gb";
        return this;
    }

    @Override
    public PCBuilder fixSSD() {
        this.ssd = "512 Gb";
        return this;
    }

    @Override
    public PC build() {
        PC pc = new PC(cpu, ram, ssd);
        return pc;
    }
}
