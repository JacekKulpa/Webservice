package com.example.dto;

import com.example.model.VoteDetails;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
public class NewsTo {

    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String text;
    private Date date;
    private Integer result;
    @NotNull
    private List<CategoryTo> categories;
    private List<VoteDetails> votesDetails;
}
