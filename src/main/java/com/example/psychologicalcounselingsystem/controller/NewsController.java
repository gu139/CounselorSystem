package com.example.psychologicalcounselingsystem.controller;

import com.example.psychologicalcounselingsystem.mybatis.entity.News;
import com.example.psychologicalcounselingsystem.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/{newsID}")
    public News getNewsByNewsID(@PathVariable int newsID) {
        return newsService.getNewsByNewsID(newsID);
    }

    @GetMapping("/kind/{kind}")
    public List<News> getNewsByKind(@PathVariable int kind) {
        return newsService.getNewsByKind(kind);
    }

    @GetMapping("/all")
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @PostMapping("/addWithoutImg")
    public boolean addNewsWithoutImg(@RequestBody News news) {
        return newsService.addNewsWithoutImg(news);
    }

    @PostMapping("/add")
    public boolean addNews(@RequestBody News news) {
        return newsService.addNews(news);
    }

    @PutMapping("/update")
    public boolean updateNews(@RequestBody News news) {
        return newsService.updateNews(news);
    }

    @DeleteMapping("/delete/{newsID}")
    public boolean deleteNews(@PathVariable int newsID) {
        return newsService.deleteNews(newsID);
    }
}