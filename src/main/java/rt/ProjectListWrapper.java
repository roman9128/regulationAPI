package rt;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

@JacksonXmlRootElement(localName = "projects")
class ProjectListWrapper {

    @JacksonXmlProperty(localName = "project")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Project> projects;

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}