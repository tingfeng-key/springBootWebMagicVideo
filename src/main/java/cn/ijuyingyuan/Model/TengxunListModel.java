package cn.ijuyingyuan.Model;

import cn.ijuyingyuan.Enum.AlbumParseType;
import cn.ijuyingyuan.Enum.AlbumStatusEnum;

import java.util.Date;

public class TengxunListModel {
    /**
     * 专辑ID
     */
    private String albumId;
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }
    public String getAlbumId() {
        return albumId;
    }

    /**
     * 缩略图地址
     */
    private String thumbSrc;
    public void setThumbSrc(String thumbSrc) {
        this.thumbSrc = thumbSrc;
    }
    public String getThumbSrc() {
        return thumbSrc;
    }

    /**
     * 专辑标题
     */
    private String title;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    /**
     * 演员
     */
    private String actors;
    public void setActors(String actors) {
        this.actors = actors;
    }
    public String getActors() {
        return actors;
    }

    /**
     * 评分
     */
    private String score;
    public void setScore(String score) {
        this.score = score;
    }
    public String getScore() {
        return score;
    }

    /**
     * 播放量
     */
    private String playNum;
    public void setPlayNum(String playNum) {
        this.playNum = playNum;
    }
    public String getPlayNum() {
        return playNum;
    }

    /**
     * 总集数
     */
    private int totalVideoNumber;
    public void setTotalVideoNumber(int totalVideoNumber) {
        this.totalVideoNumber = totalVideoNumber;
    }
    public int getTotalVideoNumber() {
        return totalVideoNumber;
    }

    /**
     * 当前更新集数
     */
    private int updateVideoNumber;
    public void setUpdateVideoNumber(int updateVideoNumber) {
        this.updateVideoNumber = updateVideoNumber;
    }
    public int getUpdateVideoNumber() {
        return updateVideoNumber;
    }

    /**
     * 标签
     */
    private String tags;
    public void setTags(String tags) {
        this.tags = tags;
    }
    public String getTags() {
        return tags;
    }

    /**
     * 别名
     */
    private String asName;
    public void setAsName(String asName) {
        this.asName = asName;
    }
    public String getAsName() {
        return asName;
    }

    /**
     * 地区
     */
    private String area;
    public void setArea(String area) {
        this.area = area;
    }
    public String getArea() {
        return area;
    }

    /**
     * 描述
     */
    private String desc;
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }

    /**
     * 发布时间
     */
    private String pulishAt;
    public void setPulishAt(String pulishAt) {
        this.pulishAt = pulishAt;
    }
    public String getpulishAT() {
        return pulishAt;
    }

    /**
     * 收录时间
     */
    private Date createAt;
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 更新时间
     */
    private Date UpdateAt;
    public void setUpdateAt(Date updateAt) {
        UpdateAt = updateAt;
    }
    public Date getUpdateAt() {
        return UpdateAt;
    }

    /**
     * 下架时间
     */
    private Date DeleteAt;
    public void setDeleteAt(Date deleteAt) {
        DeleteAt = deleteAt;
    }
    public Date getDeleteAt() {
        return DeleteAt;
    }

    /**
     * 解析类型
     */
    private Integer parseType = AlbumParseType.TENGXUN.getValue();
    public void setParseType(Integer parseType) {
        this.parseType = parseType;
    }
    public Integer getParseType() {
        return parseType;
    }

    /**
     * 状态
     */
    private Integer status = AlbumStatusEnum.CREATE.getValue();
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getStatus() {
        return status;
    }
}
