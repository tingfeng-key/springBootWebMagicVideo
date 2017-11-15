package cn.ijuyingyuan;

import cn.ijuyingyuan.Model.TengxunListModel;
import cn.ijuyingyuan.Pipeline.TengxunListPipeline;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;

public class TengxunList {
    public static void main(String[] args) {
        OOSpider.create(Site.me(), new ConsolePageModelPipeline(), TengxunListModel.class)
                .addUrl("http://v.qq.com/x/list/tv");
    }
}
