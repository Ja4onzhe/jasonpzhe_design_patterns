package cn.jasonpzhe.jasonpzhe_design_patterns.strategy;

public enum TypeEnum {
    TYPE_A("A", "A类型"),
    TYPE_B("B", "B类型"),
    TYPE_C("C", "C类型");

    private String type;
    private String desc;

    TypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
