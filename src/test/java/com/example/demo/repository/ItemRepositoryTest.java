package com.example.demo.repository;

import com.example.demo.DemoApplicationTests;
import com.example.demo.model.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ItemRepositoryTest extends DemoApplicationTests {

    @Autowired ItemRepository itemRepository;

    @Test
    public void create()    {
        Item item = new Item();
        item.setName("노트북");
        item.setPrice(10000);
        item.setContent("삼성 노트북");

        Item newItem = itemRepository.save(item);
        assertNotNull(newItem);

    }

    @Test
    public void read(){

        Long id = 1L;
        Optional<Item> item = itemRepository.findById(id);
        assertTrue(item.isPresent());

    }
}