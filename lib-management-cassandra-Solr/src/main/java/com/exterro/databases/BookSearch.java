//package com.exterro.databases;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.solr.client.solrj.SolrClient;
//import org.apache.solr.client.solrj.SolrQuery;
//import org.apache.solr.client.solrj.impl.HttpSolrClient;
//import org.apache.solr.client.solrj.response.QueryResponse;
//import org.apache.solr.common.SolrDocument;
//import org.apache.solr.common.SolrDocumentList;
//import org.springframework.stereotype.Repository;
//
//import com.exterro.entity.Book;
//
//@Repository
//public class BookSearch {
//    private static final String SOLR_URL = "http://localhost:8983/solr/books";
//
//    public List<Book> searchBooks(String query) {
//        List<Book> books = new ArrayList<>();
//        try (SolrClient solrClient = new HttpSolrClient.Builder(SOLR_URL).build()) {
//            SolrQuery solrQuery = new SolrQuery();
//            solrQuery.set("q", query);
//            QueryResponse response = solrClient.query(solrQuery);
//            SolrDocumentList results = response.getResults();
//            for (SolrDocument document : results) {
//                Book book = new Book();
//                book.setSno(document.getFieldValue("id").toString());
//                book.setName(document.getFieldValue("title").toString());
//                book.setAuthor(document.getFieldValue("author").toString());
//                book.setYear((int) document.getFieldValue("year"));
//                // Set other book details
//                books.add(book);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return books;
//    }
//}