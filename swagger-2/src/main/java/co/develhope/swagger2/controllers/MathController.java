package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    @ApiOperation(value = "Says \"welcome\"", notes = "Says welcome to the user")
    public String welcomeMathMsg() {
        return "Welcome!";
    }

    @GetMapping("division-info")
    @ApiOperation(value = "Returns a new Arithmetic Operation",
            notes = "It returns a new Arithmetic Operation with all the details about division")
    public ArithmeticOperation division() {
        return new ArithmeticOperation("division", 4, "This is a division",
                new String[]{"commutativa", "bla bla", "bla"});
    }
    @GetMapping("multiplication")
    @ApiOperation(value = "Does the multiplication", notes = "It takes parameters and it returns the multiplication value")
    public int multiplication(int n, int m) {
        return n*m;
    }
    @GetMapping("square")
    @ApiOperation(value = "Does the square", notes = "It takes one parameter and it returns the square of that parameter")
    public int square(int n) {
        return n*n;
    }
}
