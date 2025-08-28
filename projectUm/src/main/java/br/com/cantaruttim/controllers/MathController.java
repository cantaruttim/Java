package br.com.cantaruttim.controllers;

import br.com.cantaruttim.exception.UnsupportedMathOperationException;
import br.com.cantaruttim.math.SimpleMath;
import br.com.cantaruttim.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    // localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.sum(
                NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo)
        );
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.sub(
                NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo)
        );
    }

    @RequestMapping("/multiply/{numberOne}/{numberTwo}")
    public Double multiply(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.multiply(
                NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo)
        );
    }

    @RequestMapping("/divide/{numberOne}/{numberTwo}")
    public Double divide(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.divide(
                NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo)
        );
    }

    @RequestMapping("/sqrt/{numberOne}/{numberTwo}")
    public Double sqrt(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.sqrt(
            NumberConverter.convertToDouble(numberOne) ,
            NumberConverter.convertToDouble(numberTwo)
        );
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.mean(
                NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo)
        );
    }



}
