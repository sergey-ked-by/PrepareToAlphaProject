package patterns.builder;

public class DesktopBuilder implements PCBuilder {
    private String cpu;
    private String ram;
    private String ssd;

    public DesktopBuilder() {
        super();
    }

    @Override
    public PCBuilder fixCPU() {
        this.cpu = "AMD";
        return this;
    }

    @Override
    public PCBuilder fixRAM() {
        this.ram = "16 Gb";
        return this;
    }

    @Override
    public PCBuilder fixSSD() {
        this.ssd = "1024 Gb";
        return this;
    }

    @Override
    public PC build() {
        PC pc = new PC(cpu, ram, ssd);
        return pc;
    }
}
