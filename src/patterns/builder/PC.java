package patterns.builder;

public class PC {

    private String cpu;
    private String ram;
    private String ssd;

    public PC() {
        super();
    }

    public PC(String cpu, String ram, String ssd) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                '}';
    }
}
