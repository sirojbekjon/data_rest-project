package com.example.address.projection;

import com.example.address.entity.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();

    String getCity();

    String getDistrict();

    String getStreet();
}
