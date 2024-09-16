package com.subha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subha.entity.Item;

public interface ItemRepo extends JpaRepository<Item,String> {

}
