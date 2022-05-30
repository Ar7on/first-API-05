package it.develhope.FirstApiexrcise05.controllers;

import it.develhope.FirstApiexrcise05.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping(value = "")
    public String getCar(){
        return new CarDTO("tesla3","model3",45.9999).toString();
    }

    @PostMapping
    public String postCar(@Valid  @RequestBody CarDTO carDTO, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("a nwe car is been created " + carDTO.toString());
        response.setStatus(201);
        return carDTO.toString();

    }

}
