package com.koc.place.adapter.in.rest;

import com.koc.place.domain.Place;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
class SearchResponse {
    private final Long id;

    private final String name;
    private final String contact;
    private final String url;
    private final String description;
    private final List<String> category;

    private final String postNo;
    private final String street;
    private final String parcel;
    private final String detail;

    private final Double longitude;
    private final Double latitude;

    public static SearchResponse from(Place place) {
        return new SearchResponse(
                place.getId(),
                place.getName(),
                place.getContact(),
                place.getUrl(),
                place.getDescription(),
                place.getCategory(),
                place.getAddress().getPostNo(),
                place.getAddress().getStreet(),
                place.getAddress().getParcel(),
                place.getAddress().getDetail(),
                place.getAddress().getLongitude(),
                place.getAddress().getLatitude()
        );
    }
}
