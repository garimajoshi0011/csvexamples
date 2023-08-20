package com.simplejava.csvexample.csvexapmple.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplejava.csvexample.csvexapmple.service.CsvExportService;

@Controller
public class EmployeeController {

    private final CsvExportService csvExportService;

    public EmployeeController(CsvExportService csvExportService) {
        this.csvExportService = csvExportService;
    }

    @GetMapping(path = "/employees")
    public void getAllEmployeesInCsv(HttpServletResponse servletResponse) throws IOException {
        servletResponse.setContentType("text/csv");
        servletResponse.addHeader("Content-Disposition","attachment; filename=\"employees.csv\"");
        csvExportService.writeEmployeesToCsv(servletResponse.getWriter());
    }

}