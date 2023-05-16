package com.test.task.service;

import com.test.task.dto.TaskDTO;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    double AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH = 29.3;

    public double getHolidayMoney(double meanSalary, int numberOfHolidayDays) {
        TaskDTO dto = new TaskDTO(meanSalary, numberOfHolidayDays);
        dto.setAmountOfHolidayPay(meanSalary / AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH * numberOfHolidayDays);
        return dto.getAmountOfHolidayPay();
    }
}
