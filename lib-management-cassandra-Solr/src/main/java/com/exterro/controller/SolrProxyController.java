package com.exterro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SolrProxyController {

    private static final String SOLR_URL = "http://localhost:8983/solr/books/select?q=name:";

    @GetMapping("/searchBooks")
    public String searchBooks(@RequestParam String bookName) {
    	System.out.println("inside proxy....");
    	 String query = "\"" + bookName + "\"";
    	 String url = SOLR_URL + query + "&wt=json";
    	 System.out.println("@#$%^&^%$#@##$%^&"+url);
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("Output2.........."+restTemplate.getForObject(url, String.class));
        return restTemplate.getForObject(url, String.class);
    }
}
