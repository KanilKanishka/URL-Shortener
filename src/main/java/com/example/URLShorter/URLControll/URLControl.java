package com.example.URLShorter.URLControll;

import com.example.URLShorter.Model.URL;
import com.example.URLShorter.URLService.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("url/shortner")
@CrossOrigin(origins = "http://localhost:3306")
public class URLControl {

    @Autowired
    private URLService urlService;

    @GetMapping("/{id}")
    public String getOriginUrl(@PathVariable String id) {
        return urlService.getOriginalUrl(id);
    }

    @PostMapping
        public URL generateShortUrl(@RequestBody String url) {
        return urlService.generateShortUrl(url);

    }

    public void redirection(String id){
        // get long url from id

        // redirect to long url
    }




}
