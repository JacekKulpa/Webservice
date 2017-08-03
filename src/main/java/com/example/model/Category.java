package com.example.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Long id;
    @NotNull
    private CategoryType categoryType;
    @ManyToMany(mappedBy = "categories")
    private List<News> news;

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

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != null ? !id.equals(category.id) : category.id != null) return false;
        if (categoryType != category.categoryType) return false;
        return news != null ? news.equals(category.news) : category.news == null;
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

        return String.format("Category{id=%d, categoryType=%s, news_size=%d}", id, categoryType, news.size());
    }


    public enum CategoryType {

        TECHNOLOGIES, ECONOMY, ENVIRONMENT;
    }
}