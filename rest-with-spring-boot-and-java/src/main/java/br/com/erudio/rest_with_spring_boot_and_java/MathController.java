package br.com.erudio.rest_with_spring_boot_and_java;

import br.com.exceptions.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class MathController {


    @GetMapping("/sum/{n1}/{n2}")
    public Double sum(@PathVariable(value = "n1") String n1,
                      @PathVariable(value = "n2") String n2) throws Exception {

        if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)){
            throw new UnsuportedMathOperationException("Please set a numeric value seu abestado");
        }

        return SimpleMath.sum(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));

    }
    @GetMapping("/subtract/{n1}/{n2}")
    public Double subtract(@PathVariable(value = "n1") String n1,
                      @PathVariable(value = "n2") String n2) throws Exception {

        if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)){
            throw new UnsuportedMathOperationException("Please set a numeric value seu abestado");
        }


        return SimpleMath.subtract(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));

    }

    @GetMapping("/mult/{n1}/{n2}")
    public Double mult(@PathVariable(value = "n1") String n1,
                      @PathVariable(value = "n2") String n2) throws Exception {

        if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)){
            throw new UnsuportedMathOperationException("Please set a numeric value seu abestado");
        }

        return SimpleMath.multiplication(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));

    }

    @GetMapping("/div/{n1}/{n2}")
    public Double div(@PathVariable(value = "n1") String n1,
                      @PathVariable(value = "n2") String n2) throws Exception {

        if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)){
            throw new UnsuportedMathOperationException("Please set a numeric value seu abestado");
        }

        return SimpleMath.div(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));

    }

    @GetMapping("/average/{n1}/{n2}")
    public Double average(@PathVariable(value = "n1") String n1,
                      @PathVariable(value = "n2") String n2) throws Exception {

        if (!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)){
            throw new UnsuportedMathOperationException("Please set a numeric value seu abestado");
        }

        return SimpleMath.avarage(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));

    }

    @GetMapping("/square/{n1}")
    public Double square(@PathVariable(value = "n1") String n1) throws Exception {

        if (!NumberConverter.isNumeric(n1)){
            throw new UnsuportedMathOperationException("Please set a numeric value seu abestado");
        }

        return SimpleMath.square(NumberConverter.convertToDouble(n1));

    }


}
