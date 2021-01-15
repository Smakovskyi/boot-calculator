package ua.kpi.calculator.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.kpi.calculator.model.Calculable;

@RestController
@RequestMapping("/api/calc/")
@AllArgsConstructor
public class CalculatorController {
  private Calculable calculable;

  @GetMapping("add")
  public ResponseEntity<String> add(@RequestParam("first")  int first,
                                    @RequestParam("second") int second){
    int result = calculable.add(first, second);
    return ResponseEntity.ok(Integer.toString(result));
  }

  @GetMapping("sub")
  public ResponseEntity<String> sub(@RequestParam("first")  int first,
      @RequestParam("second") int second){
    int result = calculable.sub(first, second);
    return ResponseEntity.ok(Integer.toString(result));
  }

}
