package com.re.bt1;

import com.re.bt1.entity.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/api/v1/employees")
    public ResponseEntity<List<Employee>> getAllEmployee() {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1L, "Nguyen Van A", "123456"),
                new Employee(2L, "Tran Thi B", "123456"),
                new Employee(3L, "Le Van C", "123456")
        );

        return ResponseEntity.ok(employeeList);
    }
}
