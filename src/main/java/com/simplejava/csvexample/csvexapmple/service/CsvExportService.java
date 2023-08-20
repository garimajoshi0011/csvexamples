package com.simplejava.csvexample.csvexapmple.service;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.simplejava.csvexample.csvexapmple.entity.Employee;
import com.simplejava.csvexample.csvexapmple.repo.EmployeeRepository;

@Service
public class CsvExportService {

    private static final Logger log = LoggerFactory.getLogger(CsvExportService.class);

    private final EmployeeRepository employeeRepository;

    public CsvExportService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void writeEmployeesToCsv(Writer writer) {

        List<Employee> employees = employeeRepository.findAll();
        try (CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)) {
            csvPrinter.printRecord("ID", "First Name", "Last Name","Email","Department");
            for (Employee employee : employees) {
                csvPrinter.printRecord(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getDepartment());
            }
        } catch (IOException e) {
            log.error("Error While writing CSV ", e);
        }
    }
}