package com.practice.test;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
    @Query("select t from TestEntity t  where t.name = ?1")
    TestEntity findByFirstname(String name);
}
