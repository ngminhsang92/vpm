package dao;

import domain.CrudRespository;
import domain.Project;

import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
public class ProjectDao implements CrudRespository<Project, Long>{

    public void create(Project entity) {

    }

    public void update(Project entity) {

    }

    public Project findOne(Long id) {
        return null;
    }

    public List findAll() {
        return null;
    }

    public boolean exist(Long id) {
        return false;
    }

    public long count() {
        return 0;
    }

    public void delete(Long id) {

    }

}
