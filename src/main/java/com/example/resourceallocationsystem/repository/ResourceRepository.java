//package com.example.resourceallocationsystem.repository;
//
//public class ResourceRepository {
//
//}
package com.example.resourceallocationsystem.repository;

import com.example.resourceallocationsystem.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}