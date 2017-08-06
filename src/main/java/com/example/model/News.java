package com.example.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_news")
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String text;
    private Date date;
    private Integer result;
    @OneToMany
    @JoinColumn(name = "news_id", referencedColumnName = "id_news")
    private List<Vote> votes;
    @NotNull
    @ManyToMany
    @JoinTable(name = "news_categories",
            joinColumns = {@JoinColumn(name = "news_id", referencedColumnName = "id_news")},
            inverseJoinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "id_category")})
    private List<Category> categories;
}
