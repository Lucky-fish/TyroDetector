package org.gbcraft.tyrodetector.bean;

public class VHRule {
    private final Integer limit;
    // Spigot default is 0, just equals lowest Y
    private final Integer height;

    public VHRule(Integer value, Integer height) {
        this.limit = value;
        this.height = height;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getHeight() {
        return height;
    }
}
