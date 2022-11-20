package cn.jasonpzhe.jasonpzhe_design_patterns.strategy;

import cn.jasonpzhe.jasonpzhe_design_patterns.JasonpzheDesignPatternsApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author: zhe.pan
 * @create: 2022-11-20
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JasonpzheDesignPatternsApplication.class)//启动类名
public class test01 {
    @Resource
    private DemoStrategy demoStrategy;
    @Test
    void test(){
        demoStrategy.resolveType(TypeEnum.TYPE_A,"A的参数");
        demoStrategy.resolveType(TypeEnum.TYPE_B,"B的参数");
        demoStrategy.resolveType(TypeEnum.TYPE_C,"C的参数");
    }
}
