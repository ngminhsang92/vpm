package service;

import dao.ProjectDao;
import dao.ServiceDao;
import domain.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Minh Sang on 8/15/2016.
 */
public class ProjectService {
    private ProjectDao projectDao = new ProjectDao();
    private ServiceDao serviceDao = new ServiceDao();
    public void addNewProject(String description, Date startDate, Date endDate,
                              List<Task> tasks, Status status, List<byte[]> pictures, Location location, UserRole userRole){
        Project project = new Project();
        project.setDescription(description);
        project.setStartDate(startDate);
        project.setEndDate(endDate);
        project.setTasks(tasks);
        project.setStatus(status);
        project.setPictures(pictures);
        project.setLocation(location);
        project.setCreatedBy(userRole);
        projectDao.create(project);
    }

    public Project getProject(long proId){
        return projectDao.get(proId);
    }

    public List<Project> getAllProject(){
        return projectDao.getAll();
    }

    public void updateProject(Project project){
        projectDao.update(project);
    }

    public void Remove(Project project){
        projectDao.delete(project);
    }

    public List<Project> getProjectByStatus(Status status){
       return projectDao.getByStatus(status);
    }

    public List<Task> getProjectTasks(long proId){
        return getProject(proId).getTasks();
    }

    public List<Beneficiary> getProjectBeneficiaries(long proId){
        List<Beneficiary> beneficiaryList = new ArrayList<Beneficiary>();
        for(Task task: getProject(proId).getTasks()){
            beneficiaryList.addAll(task.getBeneficiaries());
        }
        return beneficiaryList;
    }

    public List<Project> getProjectsByResource(String resourceType){
        return projectDao.getByResource(resourceType);
    }

    public List<Project> getProjectsByLocation(String location){
        return projectDao.getByLocation(location);
    }

    public List<Project> getProjectsByKeywords(String keywords){
        return projectDao.getByKeywords(keywords);
    }

    public List<Project> getProjectsByOfferedServices(long ownerId){
        List<Task> tasks = serviceDao.getTasks(ownerId);
        List<Project> projects = new ArrayList<Project>();
        for (Task task : tasks){
            projects.add(task.getProject());
        }
        return projects;
    }
}
