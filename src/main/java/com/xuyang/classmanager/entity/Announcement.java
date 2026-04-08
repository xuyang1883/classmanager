package com.xuyang.classmanager.entity;

import java.time.LocalDateTime;

public class Announcement {
    private Integer id;
    private String title;
    private String content;
    private LocalDateTime createTime;

    // getter 和 setter（必须要有）
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }
}