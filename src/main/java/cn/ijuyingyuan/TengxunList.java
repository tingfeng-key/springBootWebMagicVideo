package cn.ijuyingyuan;

import cn.ijuyingyuan.Enum.AlbumParseType;
import cn.ijuyingyuan.Model.TengxunListModel;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TengxunList implements PageProcessor {

        org.slf4j.Logger logger = LoggerFactory.getLogger(TengxunList.class);
        private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

        @Override
        public void process(Page page) {
            List<Selectable> list = page.getHtml().xpath("//ul[@class='figures_list']/li").nodes();
            ArrayList models = new ArrayList();
            Integer index = 0;
            for (Selectable item: list) {
                String title = item.xpath("//a//img/@alt").toString();
                String albumId = item.xpath("//a/@data-float").toString();
                String thumb = item.xpath("//a//img/@src").toString();
                String score_l = item.xpath("//em[@class='score_l']/text()").toString();
                String score_s = item.xpath("//em[@class='score_s']/text()").toString();
                String actors = item.xpath("//div[@class='figure_desc']//a/@title").nodes().toString();
                String playNum = item.xpath("//div[@class='figure_count']//span/text()").toString();

                TengxunListModel model = new TengxunListModel();
                model.setTitle(title);
                model.setAlbumId(albumId);
                model.setThumbSrc(thumb);
                model.setScore(score_l+score_s);
                model.setActors(actors);
                model.setPlayNum(playNum);
                models.add(model);
                logger.debug(playNum);
            }
            page.putField("maps", models);
            AlbumParseType type = AlbumParseType.TENGXUN;
            logger.debug(type.getMessage(), type.getValue());
        }

        @Override
        public Site getSite() {
            return site;
        }

        public static void main(String[] args) {
            Spider.create(new TengxunList()).addUrl("http://v.qq.com/x/list/tv").thread(5).run();
    }
}
