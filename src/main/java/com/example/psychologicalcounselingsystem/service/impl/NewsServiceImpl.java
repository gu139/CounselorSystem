package com.example.psychologicalcounselingsystem.service.impl;

import com.example.psychologicalcounselingsystem.mybatis.entity.News;
import com.example.psychologicalcounselingsystem.mybatis.mapper.NewsMapper;
import com.example.psychologicalcounselingsystem.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News getNewsByNewsID(int newsID) {
        return newsMapper.getNewsByNewsID(newsID);
    }

    @Override
    public List<News> getNewsByKind(int kind) {
        return newsMapper.getNewsByKind(kind);
    }

    @Override
    public List<News> getAllNews() {
        return newsMapper.getAllNews();
    }

    @Override
    public boolean addNewsWithoutImg(News news) {
        return newsMapper.addNewsWithoutImg(news);
    }

    @Override
    public boolean addNews(News news) {
        return newsMapper.addNews(news);
    }

    @Override
    public boolean updateNews(News news) {
        return newsMapper.updateNews(news);
    }

    @Override
    public boolean deleteNews(int newsID) {
        return newsMapper.deleteNews(newsID);
    }
}