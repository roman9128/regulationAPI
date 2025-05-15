package rt;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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
    @JacksonXmlProperty(localName = "circlePersons")
    private String circlePersons;
    @JacksonXmlProperty(localName = "problem")
    private String problem;
    @JacksonXmlProperty(localName = "objectives")
    private String objectives;
    @JacksonXmlProperty(localName = "socialRelations")
    private String socialRelations;
    @JacksonXmlProperty(localName = "rationale")
    private String rationale;
    @JacksonXmlProperty(localName = "transitionPeriod")
    private String transitionPeriod;
    @JacksonXmlProperty(localName = "regulatoryImpact")
    private String regulatoryImpact;
    @JacksonXmlProperty(localName = "procedureResult")
    private String procedureResult;
    @JacksonXmlProperty(localName = "parallelStageStartDiscussion")
    private LocalDateTime parallelStageStartDiscussion;
    @JacksonXmlProperty(localName = "parallelStageEndDiscussion")
    private LocalDateTime parallelStageEndDiscussion;
    @JacksonXmlProperty(localName = "startDiscussion")
    private LocalDateTime startDiscussion;
    @JacksonXmlProperty(localName = "endDiscussion")
    private LocalDateTime endDiscussion;
    @JacksonXmlProperty(localName = "kind")
    private String kind;
    @JacksonXmlProperty(localName = "regulatorScissors")
    private String regulatorScissors;
    private final String baseLink = "https://regulation.gov.ru/Regulation/Npa/PublicView?npaID=";

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

    public String getCirclePersons() {
        return circlePersons;
    }

    public void setCirclePersons(String circlePersons) {
        this.circlePersons = circlePersons;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public String getSocialRelations() {
        return socialRelations;
    }

    public void setSocialRelations(String socialRelations) {
        this.socialRelations = socialRelations;
    }

    public String getRationale() {
        return rationale;
    }

    public void setRationale(String rationale) {
        this.rationale = rationale;
    }

    public String getTransitionPeriod() {
        return transitionPeriod;
    }

    public void setTransitionPeriod(String transitionPeriod) {
        this.transitionPeriod = transitionPeriod;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project project)) return false;

        return getProjectId().equals(project.getProjectId());
    }

    @Override
    public int hashCode() {
        return getProjectId().hashCode();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy г.", Locale.getDefault());
        final StringBuilder sb = new StringBuilder();
        sb.append("    Проект НПА:").append(System.lineSeparator());
        sb.append("ссылка на проект: ").append(baseLink).append(id).append(System.lineSeparator());
        sb.append("id проекта (короткий): ").append(id).append(System.lineSeparator());
        sb.append("id проекта (полный): ").append(projectId).append(System.lineSeparator());
        sb.append("вид: ").append(kind).append(System.lineSeparator());
        sb.append("название: ").append(title).append(System.lineSeparator());
        sb.append("разработчик: ").append(department).append(System.lineSeparator());
        sb.append("дата создания: ").append(date.format(formatter)).append(System.lineSeparator());
        sb.append("этап проекта: ").append(stage).append(System.lineSeparator());
        sb.append("статус: ").append(status).append(System.lineSeparator());
        sb.append("процедура: ").append(procedure).append(System.lineSeparator());
        sb.append("ответственный сотрудник: ").append(responsible).append(System.lineSeparator());
        sb.append("степень регулирующего воздействия: ").append(regulatoryImpact).append(System.lineSeparator());
        sb.append("решение по итогам процедуры ОРВ: ").append(procedureResult).append(System.lineSeparator());
        sb.append("дата начала независимой антикоррупционной экспертизы: ").append(parallelStageStartDiscussion.format(formatter)).append(System.lineSeparator());
        sb.append("дата окончания независимой антикоррупционной экспертизы: ").append(parallelStageEndDiscussion.format(formatter)).append(System.lineSeparator());
        sb.append("дата начала общественного обсуждения: ").append(startDiscussion.format(formatter)).append(System.lineSeparator());
        sb.append("дата окончания общественного обсуждения: ").append(endDiscussion.format(formatter)).append(System.lineSeparator());
        sb.append("обязательные требования (регуляторная гильотина): ").append(regulatorScissors).append(System.lineSeparator());
        sb.append("краткое описание проблемы: ").append(problem).append(System.lineSeparator());
        sb.append("краткое изложение целей регулирования: ").append(objectives).append(System.lineSeparator());
        sb.append("круг лиц: ").append(circlePersons).append(System.lineSeparator());
        sb.append("общая характеристика соответствующих общественных отношений: ").append(socialRelations).append(System.lineSeparator());
        sb.append("обоснование необходимости подготовки проекта нормативно правового акта: ").append(rationale).append(System.lineSeparator());
        sb.append("срок переходного периода (в календарных днях): ").append(transitionPeriod).append(System.lineSeparator());
        return sb.toString();
    }
}