package com.example.address.controller;

import com.example.address.entity.Address;
import com.example.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api/address")
public class AddressController {

//    @Autowired
//    AddressService addressService;
//
//    @GetMapping
//    public HttpEntity<?> getAddresses(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "10") int size){
//        List<Address> addresses=addressService.getAddresses(page,size);
//        return ResponseEntity.ok(addresses);
//    }
//    @GetMapping("/{id}")
//    public HttpEntity<?> getAddress(@PathVariable Integer id){
//        Address address = addressService.getAddress(id);
//        return ResponseEntity.status(address!=null?200:409).body(address);//409=>conflict //200=>ok
//    }
//
//    @PostMapping
//    public HttpEntity<?> addAddress(@RequestBody Address address){
//      Address saveAddress =  addressService.addAddress(address);
//      return ResponseEntity.status(201).body(saveAddress);
//    }
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> editAddress(@PathVariable Integer id,@RequestBody Address address){
//            Address editAddressById = addressService.editAddress(id,address);
//            return ResponseEntity.status(editAddressById!=null?202:409).body(editAddressById);
//        }
//
//        @DeleteMapping("/{id}")
//    public HttpEntity<?> deleteAddressById(@PathVariable(value = "id") Integer raqami){
//               boolean result = addressService.deleteAddress(raqami);
//               if (result)
//               return ResponseEntity.noContent().build();
//                   return ResponseEntity.notFound().build();
//        }
//



}

