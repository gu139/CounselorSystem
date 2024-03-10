package com.example.psychologicalcounselingsystem.service;

import com.example.psychologicalcounselingsystem.mybatis.entity.News;
import com.example.psychologicalcounselingsystem.mybatis.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {



    public News getNewsByNewsID(int newsID);

    public List<News> getNewsByKind(int kind);

    public List<News> getAllNews();

    public boolean addNewsWithoutImg(News news);

    public boolean addNews(News news);

    public boolean updateNews(News news);

    public boolean deleteNews(int newsID);
}