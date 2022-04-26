package com.example.address.service;

import com.example.address.entity.Address;
import com.example.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class AddressService {

//    @Autowired
//    AddressRepository addressRepository;
//
//    public List<Address> getAddresses(int page,int size){
//        Pageable pageable = PageRequest.of(page,size);
//        Page<Address> addressPage = addressRepository.findAll(pageable);
//
//        return addressPage.getContent();
//    }
//
//    public Address getAddress(Integer id){
//        Optional<Address> optionalAddress = addressRepository.findById(id);
//        return optionalAddress.orElse(null);
//
//
//    }
//
//    public Address addAddress(Address address) {
//        Address address1 = new Address();
//        Address save = addressRepository.save(address);
//        return save;
//    }
//
//    public Address editAddress(Integer id, Address address) {
//        Optional<Address> addressOptional = addressRepository.findById(id);
//        if (addressOptional.isPresent()){
//            Address address1 = addressOptional.get();
//            address1.setCity(address.getCity());
//            address1.setDistrict(address.getDistrict());
//            address1.setStreet(address.getStreet());
//            Address save = addressRepository.save(address1);
//            return save;
//        }
//        return null;
//
//    }
//
//    public boolean deleteAddress(Integer raqami) {
//        try {
//        addressRepository.deleteById(raqami);
//        return true;
//        }catch (Exception e){
//            return false;
//        }
//    }
}
