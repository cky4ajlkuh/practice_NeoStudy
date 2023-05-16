package com.test.task.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskDTO {
    double meanSalary;
    int numberOfHolidayDays;
    double amountOfHolidayPay;

    public TaskDTO(double meanSalary, int numberOfHolidayDays) {
        this.meanSalary = meanSalary;
        this.numberOfHolidayDays = numberOfHolidayDays;
    }
}
