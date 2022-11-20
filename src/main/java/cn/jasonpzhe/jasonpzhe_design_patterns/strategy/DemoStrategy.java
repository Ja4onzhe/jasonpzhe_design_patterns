package cn.jasonpzhe.jasonpzhe_design_patterns.strategy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 策略模式的使用实例
 * @author: zhe.pan
 * @create: 2022-11-20
 **/
@Component
public class DemoStrategy implements ApplicationContextAware {

    private Map<TypeEnum,IType> typeMap = new ConcurrentHashMap();

    // 利用spring bean生命周期的初始化Aware接口逻辑，把不同的策略放到map中
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, IType> beansOfType = applicationContext.getBeansOfType(IType.class);
        beansOfType.values().forEach(e->typeMap.put(e.getType(),e));
    }

    public void resolveType(TypeEnum typeEnum,Object param){
        IType iType = typeMap.get(typeEnum);
        if (iType != null){
            iType.resolve(param);
        }
    }
}
