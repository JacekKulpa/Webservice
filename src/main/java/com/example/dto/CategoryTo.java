package com.example.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CategoryTo {

    private Long id;
    @NotNull
    private CategoryType categoryType;
    private List<NewsTo> news;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public List<NewsTo> getNews() {
        return news;
    }

    public void setNews(List<NewsTo> news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryTo that = (CategoryTo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (categoryType != that.categoryType) return false;
        return news != null ? news.equals(that.news) : that.news == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (categoryType != null ? categoryType.hashCode() : 0);
        result = 31 * result + (news != null ? news.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return String.format("CategoryTo{id=%d, categoryType=%s, news_size=%d}", id, categoryType, news.size());
    }


    public enum CategoryType {

        TECHNOLOGIES, ECONOMY, ENVIRONMENT;
    }
}