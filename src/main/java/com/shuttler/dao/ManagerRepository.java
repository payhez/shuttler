package com.shuttler.dao;

import com.shuttler.model.Manager;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends ReactiveMongoRepository<Manager, String> {
}
