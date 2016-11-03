package site.luoyu;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by xd on 2016/10/27.
 */

@RunWith(SpringJUnit4ClassRunner.class)
//todo 不加web容器环境会怎样
//@WebAppConfiguration
@ContextConfiguration( locations = {
        "file:src/main/webapp/WEB-INF/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class SpringContext {
}
