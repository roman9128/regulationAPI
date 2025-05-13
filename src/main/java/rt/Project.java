package rt;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

import java.time.LocalDateTime;

public class Project {
    @JacksonXmlProperty(isAttribute = true, localName = "id")
    private String id;
    @JacksonXmlProperty(localName = "title")
    private String title;
    @JacksonXmlProperty(localName = "projectId")
    private String projectId;
    @JacksonXmlProperty(localName = "date")
    private LocalDateTime date;
    @JacksonXmlProperty(localName = "stage")
    private String stage;
    @JacksonXmlProperty(localName = "status")
    private String status;
    @JacksonXmlProperty(localName = "department")
    private String department;
    @JacksonXmlProperty(localName = "procedure")
    private String procedure;
    @JacksonXmlProperty(localName = "responsible")
    private String responsible;
    @JacksonXmlProperty(localName = "regulatoryImpact")
    private String regulatoryImpact;
    @JacksonXmlProperty(localName = "procedureResult")
    private String procedureResult;
    @JacksonXmlProperty(localName = "parallelStageStartDiscussion")
    private LocalDateTime parallelStageStartDiscussion;
    @JacksonXmlProperty(localName = "parallelStageEndDiscussion")
    private LocalDateTime parallelStageEndDiscussion;
    @JacksonXmlProperty(localName = "nextStageDuration")
    private String nextStageDuration;
    @JacksonXmlProperty(localName = "startDiscussion")
    private LocalDateTime startDiscussion;
    @JacksonXmlProperty(localName = "endDiscussion")
    private LocalDateTime endDiscussion;
    @JacksonXmlProperty(localName = "discussionDays")
    private String discussionDays;
    @JacksonXmlProperty(localName = "publishDate")
    private LocalDateTime publishDate;
    @JacksonXmlProperty(localName = "kind")
    private String kind;
    @JacksonXmlProperty(localName = "regulatorScissors")
    private String regulatorScissors;

    public Project() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getRegulatoryImpact() {
        return regulatoryImpact;
    }

    public void setRegulatoryImpact(String regulatoryImpact) {
        this.regulatoryImpact = regulatoryImpact;
    }

    public String getProcedureResult() {
        return procedureResult;
    }

    public void setProcedureResult(String procedureResult) {
        this.procedureResult = procedureResult;
    }

    public LocalDateTime getParallelStageStartDiscussion() {
        return parallelStageStartDiscussion;
    }

    public void setParallelStageStartDiscussion(LocalDateTime parallelStageStartDiscussion) {
        this.parallelStageStartDiscussion = parallelStageStartDiscussion;
    }

    public LocalDateTime getParallelStageEndDiscussion() {
        return parallelStageEndDiscussion;
    }

    public void setParallelStageEndDiscussion(LocalDateTime parallelStageEndDiscussion) {
        this.parallelStageEndDiscussion = parallelStageEndDiscussion;
    }

    public String getNextStageDuration() {
        return nextStageDuration;
    }

    public void setNextStageDuration(String nextStageDuration) {
        this.nextStageDuration = nextStageDuration;
    }

    public LocalDateTime getStartDiscussion() {
        return startDiscussion;
    }

    public void setStartDiscussion(LocalDateTime startDiscussion) {
        this.startDiscussion = startDiscussion;
    }

    public LocalDateTime getEndDiscussion() {
        return endDiscussion;
    }

    public void setEndDiscussion(LocalDateTime endDiscussion) {
        this.endDiscussion = endDiscussion;
    }

    public String getDiscussionDays() {
        return discussionDays;
    }

    public void setDiscussionDays(String discussionDays) {
        this.discussionDays = discussionDays;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getRegulatorScissors() {
        return regulatorScissors;
    }

    public void setRegulatorScissors(String regulatorScissors) {
        this.regulatorScissors = regulatorScissors;
    }
}
