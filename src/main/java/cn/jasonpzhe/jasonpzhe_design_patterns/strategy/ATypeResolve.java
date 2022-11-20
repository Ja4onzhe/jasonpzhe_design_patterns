package cn.jasonpzhe.jasonpzhe_design_patterns.strategy;

import org.springframework.stereotype.Component;

/**
 * @description: A类型的解析实现
 * @author: zhe.pan
 * @create: 2022-11-20
 **/
@Component
public class ATypeResolve implements IType{
    @Override
    public TypeEnum getType() {
        return TypeEnum.TYPE_A;
    }

    @Override
    public void resolve(Object param) {
        System.out.println("执行A类型的具体逻辑"+param);

    }
}
