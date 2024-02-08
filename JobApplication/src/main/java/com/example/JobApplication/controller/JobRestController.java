package com.example.JobApplication.controller;

import com.example.JobApplication.model.JobPost;
import com.example.JobApplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobpost")
    public List<JobPost> getJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("jobpost/{id}")
    public Optional getJob(@PathVariable("id") Integer id){
        return jobService.getJob(id);
    }

    @PostMapping("jobpost")
    public void jobPost(@RequestBody JobPost jobPost){
         jobService.addJob(jobPost);
    }

    @PutMapping("jobpost")
    public void jobupdate(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
    }

    @DeleteMapping("jobpost/{id}")
    public void deleteJob(@PathVariable("id") Integer id){
        jobService.deleteJob(id);
    }

}
