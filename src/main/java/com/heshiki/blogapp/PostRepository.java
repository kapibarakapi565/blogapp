package com.heshiki.blogapp;

import org.apache.ibatis.annotations.*;


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
    @Select("select * from posts")
    List<PostEntity> findAll();

    @Select("select * from posts where id = #{id}")
    PostEntity findById(long id);

    @Update("UPDATE posts SET title = #{title}, content = #{content}, updated_at = #{updatedAt} WHERE id = #{id}")
    void update(@Param("id") long id,
                @Param("title") String title,
                @Param("content") String content,
                @Param("updatedAt") LocalDateTime updatedAt);

    @Delete("delete from posts where id=#{id}")
    void deleteById(long id);
}
