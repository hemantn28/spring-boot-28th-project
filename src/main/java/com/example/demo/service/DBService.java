package com.example.demo.service;

import com.example.demo.model.Continent;
import com.example.demo.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DBService {

    @Autowired
    ContinentRepository repository;

    public String add(Continent continent){
        repository.save(continent);
        return "continent added to DB successfully";
    }


    public List<Continent> getAll(){
        return repository.findAll();

    }


    public String update(@RequestParam int totalNoOfNations, @RequestParam Integer id){
        Continent continent=repository.getById(id);
        continent.setTotalNoOfNations(56);
        repository.save(continent);
        return "continent totalNoOfNations updated in DB successfully";
    }


    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "continent deleted in Db successfully";

    }

}
