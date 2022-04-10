package com.magomed.calculatorspring.controllers;

import com.magomed.calculatorspring.models.CalculatorsModel;
import com.magomed.calculatorspring.service.CalculatorsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/calculator")
public class CalculatorsController {
    CalculatorsService calculatorsService = new CalculatorsService();

    @RequestMapping(method = RequestMethod.GET)
    public String form(Model model){
        model.addAttribute("values", new CalculatorsModel());
        return "CalcForm";
    }

    @RequestMapping(method = RequestMethod.POST, params = "action=addition")
    public String resultAddition(@ModelAttribute CalculatorsModel calculatorsModel,
                                 Model model){
        model.addAttribute("value", calculatorsService.addition(calculatorsModel.firstValue, calculatorsModel.secondValue));
        return "Result";
    }
    @RequestMapping(method = RequestMethod.POST, params = "action=subtraction")
    public String resultSubtraction(@ModelAttribute CalculatorsModel calculatorsModel,
                                 Model model){
        model.addAttribute("value", calculatorsService.subtraction(calculatorsModel.firstValue, calculatorsModel.secondValue));
        return "Result";
    }
    @RequestMapping(method = RequestMethod.POST, params = "action=multiplication")
    public String resultMultiplication(@ModelAttribute CalculatorsModel calculatorsModel,
                                 Model model){
        model.addAttribute("value", calculatorsService.multiplication(calculatorsModel.firstValue, calculatorsModel.secondValue));
        return "Result";
    }
    @RequestMapping(method = RequestMethod.POST, params = "action=division")
    public String resultDivision(@ModelAttribute CalculatorsModel calculatorsModel,
                                 Model model){
        model.addAttribute("value", calculatorsService.division(calculatorsModel.firstValue, calculatorsModel.secondValue));
        return "Result";
    }
}
