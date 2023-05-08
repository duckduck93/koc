package com.koc.place.adapter.in.rest;

import com.koc.place.domain.Place;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
class SearchPageResponse {
    private Integer page;
    private Integer size;
    private Long total;
    private List<SearchResponse> items;

    public static SearchPageResponse from(Page<Place> places) {
        return new SearchPageResponse(
                places.getNumber(),
                places.getSize(),
                places.getTotalElements(),
                places.map(SearchResponse::from).getContent()
        );
    }
}