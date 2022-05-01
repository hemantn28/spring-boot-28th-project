package com.example.demo.controller;

import com.example.demo.model.Continent;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContinentDBController {

    @Autowired
    DBService service;
    @RequestMapping(value = "add_continents_db", method = RequestMethod.POST)
    public String add(@RequestBody Continent continent){

        return service.add(continent);
    }

    @RequestMapping(value = "get_continents_db", method = RequestMethod.GET)
    public List<Continent> getAll(){
        return service.getAll();

    }

    @RequestMapping(value = "update_continents_db",method = RequestMethod.PUT)
    public String update(@RequestParam int totalNoOfNations, @RequestParam Integer id){
       service.update(56,99);
        return "continents totalNoOfNations updated in DB successfully";
    }

    @RequestMapping(value = "delete_continents_db",method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        service.delete(101);
        return "continents deleted in Db successfully";

    }


}
