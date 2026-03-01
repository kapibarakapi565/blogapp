package com.heshiki.blogapp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface PostRepository {
    @Select("select * from posts")
    List<PostEntity> findAll();

    @Insert("insert into posts (title, content, created_at, updated_at) " +
            "values (#{title}, #{content}, #{created_at), #{updated_at})")
    void insert(String title, String content, LocalDateTime created_at, LocalDateTime updated_at);
}
