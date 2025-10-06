package Prack_work_4_Computer;

public class Monitor {
    private String model;
    private double diagonal; // в дюймах
    private String resolution; // например "1920x1080"
    private int refreshRate; // в Hz
    private String panelType; // IPS, TN, VA

    public Monitor(String model, double diagonal, String resolution, int refreshRate, String panelType) {
        this.model = model;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.panelType = panelType;
    }

    // Геттеры
    public String getModel() { return model; }
    public double getDiagonal() { return diagonal; }
    public String getResolution() { return resolution; }
    public int getRefreshRate() { return refreshRate; }
    public String getPanelType() { return panelType; }

    // Сеттеры
    public void setRefreshRate(int refreshRate) { this.refreshRate = refreshRate; }

    public String getInfo() {
        return String.format("Монитор: %s, %.1f\", %s, %dHz, %s",
                model, diagonal, resolution, refreshRate, panelType);
    }

    public double calculatePpi() {
        // Расчет пикселей на дюйм
        String[] res = resolution.split("x");
        int width = Integer.parseInt(res[0]);
        int height = Integer.parseInt(res[1]);
        double diagonalPixels = Math.sqrt(width * width + height * height);
        return diagonalPixels / diagonal;
    }

    public boolean isSuitableForGaming() {
        return refreshRate >= 120 && (panelType.equals("IPS") || panelType.equals("VA"));
    }

    @Override
    public String toString() {
        return getInfo();
    }
}