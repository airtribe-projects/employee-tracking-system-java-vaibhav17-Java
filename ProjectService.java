package com.example.EmployeeTrackingSystem.service;

import com.example.EmployeeTrackingSystem.model.Project;
import com.example.EmployeeTrackingSystem.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public void createProject(Project project) {
        projectRepository.save(project);
    }

    public Project getProject(long id) {
        return projectRepository.findById(id).get();
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public void updateProject(Project project) {
        Project existingProject = projectRepository.findById(project.getProjectId()).get();
        if(existingProject.getProjectId() != 0) {
            existingProject.setProjectName(project.getProjectName());
            projectRepository.save(existingProject);
        }
    }

    public void deleteProjectByID(long id) {
        projectRepository.deleteById(id);
    }
}
