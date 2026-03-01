package com.heshiki.blogapp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface PostRepository {

    @Insert("""
            insert into posts (title, content, created_at, updated_at)
            values (#{title}, #{content}, #{createdAt}, #{updatedAt})
            """)
    void insert(@org.apache.ibatis.annotations.Param("title") String title,
                @org.apache.ibatis.annotations.Param("content") String content,
                @org.apache.ibatis.annotations.Param("createdAt") LocalDateTime createdAt,
                @org.apache.ibatis.annotations.Param("updatedAt") LocalDateTime updatedAt);
}
