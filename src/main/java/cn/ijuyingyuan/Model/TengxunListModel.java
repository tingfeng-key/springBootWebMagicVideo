package cn.ijuyingyuan.Model;

import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.ExtractByUrl;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

@TargetUrl("")
@HelpUrl("")
public class TengxunListModel {
    @ExtractByUrl("https://v.qq.com/x/cover/(\\w+).html")
    private String albumId;

    @ExtractBy("//li[class='list_item']/a/img@src")
    private String thumbSrc;

    @ExtractBy("//li[class='list_item']/")
    private String title;
}
