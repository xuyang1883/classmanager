package com.xuyang.classmanager.controller;

import com.xuyang.classmanager.entity.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/announcement")
public class AnnouncementController {

    @Autowired
    private com.xuyang.classmanager.service.AnnouncementService announcementService;  // 只保留这一个

    @GetMapping("/list")
    public List<com.xuyang.classmanager.entity.Announcement> list() {
        return announcementService.getAllAnnouncements();
    }
    @PostMapping("/add")
    public String add(@RequestParam String title, @RequestParam String content) {
        Announcement announcement = new Announcement();
        announcement.setTitle(title);
        announcement.setContent(content);

        boolean success = announcementService.addAnnouncement(announcement);
        if (success) {
            return "发布成功";
        } else {
            return "发布失败";
        }
    }

}