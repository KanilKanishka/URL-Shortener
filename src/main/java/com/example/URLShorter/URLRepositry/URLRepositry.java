package com.example.URLShorter.URLRepositry;

import com.example.URLShorter.Model.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface URLRepositry extends JpaRepository<URL,Integer> {

    @Query(value = "select originalurl from URL where shorturl = ?1", nativeQuery = true)
    String findByShortUrl(String id);
}
