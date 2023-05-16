package com.test.task.api;

import com.test.task.dto.TaskDTO;
import com.test.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/calculator")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/calculate")
    public ResponseEntity<Double> getSum(@RequestParam double meanSalary, @RequestParam int numberOfHolidayDays) {
        return ResponseEntity.ok(taskService.getHolidayMoney(meanSalary, numberOfHolidayDays));
    }
}
