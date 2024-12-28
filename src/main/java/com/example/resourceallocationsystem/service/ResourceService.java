//package com.example.resourceallocationsystem.service;
//
//import com.example.resourceallocationsystem.entity.Resource;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.ArrayList;
//
//@Service
//public class ResourceService {
//
//    // This method simulates fetching resources from a database
//    public List<Resource> getAllResources() {
//        // Return a list of resources (you can replace this with actual database logic)
//        List<Resource> resources = new ArrayList<>();
//        resources.add(new Resource(1, "Dennis", 4));
//        resources.add(new Resource(2, "	Kumar", 3));
//        return resources;
//    }
//}


package com.example.resourceallocationsystem.service;

import com.example.resourceallocationsystem.entity.Resource;
import com.example.resourceallocationsystem.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }
}