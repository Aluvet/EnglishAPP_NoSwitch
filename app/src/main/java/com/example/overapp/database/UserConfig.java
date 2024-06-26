package com.example.overapp.database;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class UserConfig extends LitePalSupport {
//
//与用户绑定的信息，存放用户的学习信息，唯一
    @Column(unique = true)
    private int id;
//默认为-1，即未选
    @Column(defaultValue = "-1")
    // 当前正在使用的书目
    // -1，说明未创建书目，是个新用户
    private int currentBookId;

    @Column(defaultValue = "0")
    // 每日需要背单词的数量
    // 如果用户未设置相关数据量，则默认为0，说明未设置单词量
    private int wordNeedReciteNum;

    // 归属用户
    private int userId;

    @Column(defaultValue = "0")
    // 上次开始背单词的时间（点了背单词的按钮的那一刻）
    // 重新选书时，记得重置这个值
    private long lastStartTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentBookId() {
        return currentBookId;
    }

    public void setCurrentBookId(int currentBookId) {
        this.currentBookId = currentBookId;
    }

    public int getWordNeedReciteNum() {
        return wordNeedReciteNum;
    }

    public void setWordNeedReciteNum(int wordNeedReciteNum) {
        this.wordNeedReciteNum = wordNeedReciteNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getLastStartTime() {
        return lastStartTime;
    }

    public void setLastStartTime(long lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

}
