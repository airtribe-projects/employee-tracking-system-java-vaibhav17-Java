package com.example.EmployeeTrackingSystem.controller;

import com.example.EmployeeTrackingSystem.model.Project;
import com.example.EmployeeTrackingSystem.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    // inserting project
    @PostMapping("/projects")
    public void addProject(@RequestBody Project project) {
        projectService.createProject(project);
    }

    // displaying project by id
    @GetMapping("/projects/{id}")
    public Project getProject(@PathVariable long id){
        return projectService.getProject(id);
    }

    // displaying list of all Project
    @GetMapping("/projects")
    public List<Project> getAllProject() {
        return projectService.getAllProjects();
    }

    // updating Project by id
    @PutMapping("/projects")
    public void updateProject(@RequestBody Project project){
        projectService.updateProject(project);
    }

    // deleting Project by id
    @DeleteMapping("/projects/{id}")
    public void deleteProjectByID(@PathVariable long id){
        projectService.deleteProjectByID(id);
    }

}
