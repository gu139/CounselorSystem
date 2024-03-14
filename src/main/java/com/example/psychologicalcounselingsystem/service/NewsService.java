package com.example.psychologicalcounselingsystem.service;

import com.example.psychologicalcounselingsystem.mybatis.entity.News;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NewsService {



    public News getNewsByNewsID(Integer newsID);

    public List<News> getNewsByKind(Integer kind);

    public List<News> getAllNews();

    public boolean addNewsWithoutImg(News news);

    public boolean addNews(News news);

    public boolean updateNews(News news);

    public boolean deleteNews(int newsID);
}