package com.jaydhurve.jobapp.jobs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    public List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobs;
    }
}
