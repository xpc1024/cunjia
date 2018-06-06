package com.cunjia.ordering.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Permission {
    private Long id;

    private String url;

    private String name;

}