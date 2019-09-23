package cn.eleven.springbootstarter.demo;

import cn.eleven.springbootstarter.demo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-23 21:46
 * @author: 十一
 */
@RestController
public class SomeServiceController {


    @Autowired
    private SomeService someService;

    @RequestMapping("/{word}")
    public Map test(@PathVariable String word) {


        String wrap = someService.wrap(word);
        HashMap hashMap = new HashMap();
        hashMap.put("data",wrap);
        return hashMap;

    }
}
