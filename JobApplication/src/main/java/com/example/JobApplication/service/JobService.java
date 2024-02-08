package com.example.JobApplication.service;

import com.example.JobApplication.model.JobPost;
import com.example.JobApplication.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class JobService {

    private static final Logger LOGGER = Logger.getLogger(JobService.class.getName());

    @Autowired
    public JobRepo repo;

    public List<JobPost> getAllJobs() {
        try {
            return repo.findAll();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error fetching all jobs", e);
            throw e;
        }
    }

    public void addJob(JobPost jobPost) {
        try {
            repo.save(jobPost);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error adding job", e);
            throw e;
        }
    }

    public Optional getJob(int postId) {
        try {
            return repo.findById(postId);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error fetching job with postId: " + postId, e);
            throw e;
        }
    }

    public void updateJob(JobPost jobPost) {
        try {
            repo.save(jobPost);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error updating job", e);
            throw e;
        }
    }

    public void deleteJob(int postId) {
        try {
             repo.deleteById(postId);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error fetching job with postId: " + postId, e);
            throw e;
        }

    }
}
