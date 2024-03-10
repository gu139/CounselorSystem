package com.example.psychologicalcounselingsystem.mybatis.mapper;

import com.example.psychologicalcounselingsystem.mybatis.entity.News;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NewsMapper {

    //  newsid查找
    @Select("select * from news where newsID =#{newsID}")
    @ResultMap("newsMap")
    News getNewsByNewsID(@Param("newsID") int newsID);

    // kind查找，分类查找所有News，kind是类型
    @Select("select * from news where kind = #{kind}")
    @ResultMap("newsMap")
    List<News> getNewsByKind(@Param("kind") int kind);

    //所有news
    @Select("select * from news")
    @ResultMap("newsMap")
    List<News> getAllNews();

    //添加news,没有图片信息
    @Insert("insert into news(newsID, newsTitle, newsTime, newsNote) VALUES (#{newsID},#{newsTitle},#{newsTime},#{newsNote})")
    @Options(useGeneratedKeys = true,keyProperty = "newsID")
    boolean addNewsWithoutImg(News news);

    //添加news，包含图片信息
    @Insert("insert into news(newsID, imgSrc, newsTitle, newsTime, newsNote) VALUES (#{newsID},#{imgSrc},#{newsTitle},#{newsTime},#{newsNote})")
    @Options(useGeneratedKeys = true,keyProperty = "newsID")
    boolean addNews(News news);
    
    //修改News,通过newsID
    @Update("update news set imgSrc=#{news.imgSrc},kind=#{news.kind}, newsTitle = #{news.newsTitle}, newsNote = #{news.newsNote} ,newsTime=#{news.newsTime} where newsID = #{news.newsID}")
    @ResultMap("newsMap")
    boolean updateNews(@Param("news")News news);

    @Delete("delete from news where newsID = #{newsID}")
    @ResultMap("newsMap")
    boolean deleteNews(@Param("newsID") int newsID);
}

