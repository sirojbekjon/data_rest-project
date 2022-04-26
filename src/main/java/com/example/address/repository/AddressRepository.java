package com.example.address.repository;

import com.example.address.entity.Address;
import com.example.address.projection.CustomAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


//excerptProjection bu o'zimiz hohlagan field larni berib yuborish uchun ishlatiladi
@RepositoryRestResource(path = "address",collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address,Integer> {


    //search qilib olish uchun
    @RestResource(path = "byName")
    public Page<Address> findAllByCity(@Param("city") String city, Pageable pageable);
}
