package ie.atu.springboot;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name;
    }
        @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name:  " + name + ", Age: " + age;
    }

    @GetMapping("/person")
    public Person getPerson(){

        return new Person("Simon", 55);
    }
    @GetMapping("/calculate")
    public Calculator calculatorJSON(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation){

        switch (operation){
            case "add":
                return new Calculator(operation, num1 + num2);

            case "subtract":
                return new Calculator(operation, num1 - num2);

            case "multiply":
                return new Calculator(operation, num1 * num2);

            case "divide":
                if(num2 == 0) {
                    return new Calculator("Error");
                }
                else{
                    return new Calculator(operation, num1 / num2);
                }

            default:
                return new Calculator("Error");
        }



    }
}