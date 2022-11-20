package cn.jasonpzhe.jasonpzhe_design_patterns.strategy;

public interface IType {
    // 属于哪种类型
    TypeEnum getType();

    // 具体解析的方法
    void resolve(Object param);
}
