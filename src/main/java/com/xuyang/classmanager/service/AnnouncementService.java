package com.xuyang.classmanager.service;

import com.xuyang.classmanager.entity.Announcement;
import com.xuyang.classmanager.mapper.AnnouncementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnnouncementService {

    @Autowired
    private AnnouncementMapper announcementMapper;

    public List<Announcement> getAllAnnouncements() {
        return announcementMapper.findAll();
    }

    public  boolean addAnnouncement(Announcement announcement){
        int result = announcementMapper.add(announcement);
        return  result > 0;
    }
}