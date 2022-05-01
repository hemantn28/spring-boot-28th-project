package com.example.demo.controller;

import com.example.demo.model.Continent;
import com.example.demo.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBController {

    //Create
    @Autowired
    ContinentRepository continentRepository;

    @RequestMapping(value = "add_continent_db", method = RequestMethod.POST)
    public String add(@RequestBody Continent continent){
        continentRepository.save(continent);
        return "continent added to DB successfully";
    }


    //Get

    @RequestMapping(value = "get_continent_db", method = RequestMethod.GET)
    public List<Continent> getAll(){
        return continentRepository.findAll();

    }

    //Update

    @RequestMapping(value = "update_continent_db",method = RequestMethod.PUT)
    public String update(@RequestParam int totalNoOfNations,@RequestParam Integer id){
        Continent continent=continentRepository.getById(id);
        continent.setTotalNoOfNations(56);
        continentRepository.save(continent);
        return "continent totalNoOfNations updated in DB successfully";
    }


    //Delete

    @RequestMapping(value = "delete_continent_db",method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        continentRepository.deleteById(id);
return "continent deleted in Db successfully";

    }
}
