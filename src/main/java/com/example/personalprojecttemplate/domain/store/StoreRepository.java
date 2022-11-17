package com.example.personalprojecttemplate.domain.store;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.personalprojecttemplate.domain.store.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
}