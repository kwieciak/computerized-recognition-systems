package org.example.project1;

import org.example.project1.extractor.Extractor;
import org.example.project1.extractor.ExtractorFactory;
import org.example.project1.extractor.ExtractorType;
import org.example.project1.extractor.extractors.*;
import org.example.project1.util.Article;
import org.example.project1.util.ArticleReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArticleReader articleReader = new ArticleReader("project1/data/reut2-001.sgm");
        List<Article> articles = articleReader.readArticles();
        Knn knn = new Knn(3, null, articles.subList(0,10), articles.subList(10,50));
        knn.assignFeatureVectors();
        System.out.println(articles.get(1).getFeaturesVector());

        //CsvReader csvReader = new CsvReader();
        //Map<String, List<String>>  dd = csvReader.readCsv("project1/src/main/resources/org/example/project1/extractors/cities.csv");
        //System.out.println(CsvReader.readCsv("project1/src/main/resources/org/example/project1/extractors/currencies.csv"));
        //System.out.println(dd);
//        Extractor<?> extractor = new ProportionUniqueWordsToCommonWordsExtractor();
//        Double d = (Double) extractor.extract(articles.get(1));
//        System.out.println(d);
    }
}
