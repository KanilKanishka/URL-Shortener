package com.example.URLShorter.URLService;

import com.example.URLShorter.Model.URL;
import com.example.URLShorter.URLRepositry.URLRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.URLShorter.URLLogic.URLLogic.getShortUrl;
import static com.example.URLShorter.URLLogic.URLLogic.isUrlValid;


@Service
public class URLService {
    @Autowired
    private URLRepositry urlRepositry;

    public String getOriginalUrl(String id){
        return urlRepositry.findByShortUrl(id);
    }
    public URL generateShortUrl(String url) {
        if (!isUrlValid(url)) {
            System.out.println("URL is not valid");
            return null;
        }
        URL urlObject = new URL();
        urlObject.setOriginalurl(url);
        urlObject.setShorturl(getShortUrl(url));

        return urlRepositry.save(urlObject);
    }
}
