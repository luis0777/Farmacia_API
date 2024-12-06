package com.apispringboot.farmacia.service;

import com.apispringboot.farmacia.entity.Item;
import com.apispringboot.farmacia.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItens(){
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id){
        return itemRepository.findById(id);
    }

    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public Item updateItem(Long id, Item itemDetails){
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        item.setNome(itemDetails.getNome());
        item.setDescricao(itemDetails.getDescricao());
        item.setQuantidade(itemDetails.getQuantidade());
        item.setPreco(itemDetails.getPreco());
        return itemRepository.save(item);
    }

    public void deleteItem(Long id){
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        itemRepository.delete(item);
    }
}
