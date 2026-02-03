package operator;

import java.util.ArrayList;

import entity.Member;
import entity.Project;

public class ProjectOperator implements SimpleOperator<Project> {

    private MemberOperator mo;
    private ArrayList<Project> projectList;

    public ProjectOperator() {
        this.projectList = new ArrayList<>();
    }

    public MemberOperator getMo() {
        return mo;
    }

    public void setMo(MemberOperator mo) {
        this.mo = mo;
    }

    public ArrayList<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public void showAll() {
        for (Project project : this.projectList) {
            System.out.println(project);
        }
    }

    @Override
    public void add(Project project) {
        Project foundProject = this.search(project);
        if (foundProject == null) {
            this.projectList.add(project);
        }
    }

    @Override
    public void update(Project project) {
        Project foundProject = this.search(project);
        if (foundProject != null) {
            foundProject.setName(project.getName());
            foundProject.setProfit(project.getProfit());
            foundProject.setProgress(project.getProgress());
            foundProject.setMemberList(project.getMemberList());
        }
    }

    @Override
    public void remove(Project project) {
        Project foundProject = this.search(project);
        if (foundProject != null) {
            this.projectList.remove(foundProject);
        }
    }

    @Override
    public Project search(Project project) {
        for (Project existedProject : this.projectList) {
            if (existedProject.getId().equals(project.getId())) {
                return existedProject;
            }
        }

        return null;
    }
    
}
