
package com.reptile;

import com.reptile.zhihu.Zhihu;
import org.junit.Test;

import java.util.List;

import static com.reptile.Spider.sendGet;

/**
 * @author csx22004
 * @version $Id: MainTest, v 0.1 2016/10/11 9:01 csx22004 Exp $
 */
public class MainTest {

    /**
     * 知乎编辑推荐页面数据测试
     */
    @Test
    public void testZhihu() {
        // 定义即将访问的链接
        String url = "https://www.zhihu.com/explore/recommendations";
        // 访问链接并获取页面内容
        String result = sendGet(url);
        // 获取该页面的所有的知乎对象
        List<Zhihu> zhihuList = Spider.getZhihu(result);
        // 打印结果
        System.out.println(zhihuList);
    }

}
