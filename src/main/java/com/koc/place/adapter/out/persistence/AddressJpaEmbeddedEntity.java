package com.koc.place.adapter.out.persistence;

import com.koc.place.domain.Address;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
class AddressJpaEmbeddedEntity {
    private String postNo;
    private String street;
    private String parcel;
    private String detail;

    private Double longitude;
    private Double latitude;

    public Address toAddress() {
        return new Address(
                this.postNo,
                this.street,
                this.parcel,
                this.detail,
                this.longitude,
                this.latitude
        );
    }
}
