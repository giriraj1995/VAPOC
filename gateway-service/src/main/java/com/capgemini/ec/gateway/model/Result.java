
package com.capgemini.ec.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value=Include.NON_EMPTY)
//@JsonInclude(value=Include.NON_EMPTY)
public class Result {

	private String promoted_by;

	private String parent;

	private String caused_by;

	private String watch_list;

	private UTenantSubcategory u_tenant_subcategory;

	private String upon_reject;

	private String sys_updated_on;

	private String approval_history;

	private String number;

	private String proposed_by;

	private String u_contact_attempt;

	private String u_security_type;

	private String lessons_learned;

	private String state;

	private String sys_created_by;

	private String knowledge;

	private String order;

	private CmdbCI cmdb_ci;

	private String delivery_plan;

	private String impact;

	private String active;

	private String work_notes_list;

	private String u_vendor;

	private String priority;

	private String sys_domain_path;

	private String business_duration;

	private String group_list;

	private String u_copied_from;

	private String u_template;

	private String approval_set;

	private String u_security_related;

	private String major_incident_state;

	private String short_description;

	private String correlation_display;

	private String delivery_task;

	private String work_start;

	private String trigger_rule;

	private String additional_assignee_list;

	private String notify;

	private String service_offering;

	private String sys_class_name;

	private ClosedBy closed_by;

	private String follow_up;

	private String parent_incident;

	private String reopened_by;

	private String reassignment_count;

	private AssignedTo assigned_to;

	private String sla_due;

	private String comments_and_work_notes;

	private UTenantCategory u_tenant_category;

	private String u_tenant_resolution_code;

	private String escalation;

	private String upon_approval;

	private String correlation_id;

	private String timeline;

	private String u_vendor_ticket_number;

	private String made_sla;

	private String promoted_on;

	private String child_incidents;

	private String hold_reason;

	private ResolvedBy resolved_by;

	private String sys_updated_by;

	private OpenedBy opened_by;

	private String user_input;

	private String sys_created_on;

	private SysDomain sys_domain;

	private String proposed_on;

	private String actions_taken;

	private TaskFor task_for;

	private String calendar_stc;

	private String closed_at;

	private String u_sd2sd_interface_type;

	private BusinessService business_service;

	private String business_impact;

	private String rfc;

	private String time_worked;

	private String expected_start;

	private String opened_at;

	private String work_end;

	private CallerId caller_id;

	private String reopened_time;

	private String resolved_at;

	private String u_interface_type;

	private String work_notes;

	private AssignmentGroup assignment_group;

	private String business_stc;

	private String cause;

	private String description;

	private String calendar_duration;

	private String u_sd2sd_external_system;

	private String close_notes;

	private String sys_id;

	private String contact_type;

	private String incident_state;

	private String urgency;

	private String problem_id;

	private Company company;

	private String activity_due;

	private String severity;

	private String overview;

	private String comments;

	private String approval;

	private String u_environment;

	private String due_date;

	private String sys_mod_count;

	private String u_affected_user;

	private String reopen_count;

	private String sys_tags;

	private String u_external_system;

	private String u_knowledge_article;

	private String location;

	private String u_sd2sd_service_provider;

	public String getPromoted_by() {
		return promoted_by;
	}

	public void setPromoted_by(String promoted_by) {
		this.promoted_by = promoted_by;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getCaused_by() {
		return caused_by;
	}

	public void setCaused_by(String caused_by) {
		this.caused_by = caused_by;
	}

	public String getWatch_list() {
		return watch_list;
	}

	public void setWatch_list(String watch_list) {
		this.watch_list = watch_list;
	}

	public UTenantSubcategory getU_tenant_subcategory() {
		return u_tenant_subcategory;
	}

	public void setU_tenant_subcategory(UTenantSubcategory u_tenant_subcategory) {
		this.u_tenant_subcategory = u_tenant_subcategory;
	}

	public String getUpon_reject() {
		return upon_reject;
	}

	public void setUpon_reject(String upon_reject) {
		this.upon_reject = upon_reject;
	}

	public String getSys_updated_on() {
		return sys_updated_on;
	}

	public void setSys_updated_on(String sys_updated_on) {
		this.sys_updated_on = sys_updated_on;
	}

	public String getApproval_history() {
		return approval_history;
	}

	public void setApproval_history(String approval_history) {
		this.approval_history = approval_history;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getProposed_by() {
		return proposed_by;
	}

	public void setProposed_by(String proposed_by) {
		this.proposed_by = proposed_by;
	}

	public String getU_contact_attempt() {
		return u_contact_attempt;
	}

	public void setU_contact_attempt(String u_contact_attempt) {
		this.u_contact_attempt = u_contact_attempt;
	}

	public String getU_security_type() {
		return u_security_type;
	}

	public void setU_security_type(String u_security_type) {
		this.u_security_type = u_security_type;
	}

	public String getLessons_learned() {
		return lessons_learned;
	}

	public void setLessons_learned(String lessons_learned) {
		this.lessons_learned = lessons_learned;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSys_created_by() {
		return sys_created_by;
	}

	public void setSys_created_by(String sys_created_by) {
		this.sys_created_by = sys_created_by;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public CmdbCI getCmdb_ci() {
		return cmdb_ci;
	}

	public void setCmdb_ci(CmdbCI cmdb_ci) {
		this.cmdb_ci = cmdb_ci;
	}

	public String getDelivery_plan() {
		return delivery_plan;
	}

	public void setDelivery_plan(String delivery_plan) {
		this.delivery_plan = delivery_plan;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getWork_notes_list() {
		return work_notes_list;
	}

	public void setWork_notes_list(String work_notes_list) {
		this.work_notes_list = work_notes_list;
	}

	public String getU_vendor() {
		return u_vendor;
	}

	public void setU_vendor(String u_vendor) {
		this.u_vendor = u_vendor;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getSys_domain_path() {
		return sys_domain_path;
	}

	public void setSys_domain_path(String sys_domain_path) {
		this.sys_domain_path = sys_domain_path;
	}

	public String getBusiness_duration() {
		return business_duration;
	}

	public void setBusiness_duration(String business_duration) {
		this.business_duration = business_duration;
	}

	public String getGroup_list() {
		return group_list;
	}

	public void setGroup_list(String group_list) {
		this.group_list = group_list;
	}

	public String getU_copied_from() {
		return u_copied_from;
	}

	public void setU_copied_from(String u_copied_from) {
		this.u_copied_from = u_copied_from;
	}

	public String getU_template() {
		return u_template;
	}

	public void setU_template(String u_template) {
		this.u_template = u_template;
	}

	public String getApproval_set() {
		return approval_set;
	}

	public void setApproval_set(String approval_set) {
		this.approval_set = approval_set;
	}

	public String getU_security_related() {
		return u_security_related;
	}

	public void setU_security_related(String u_security_related) {
		this.u_security_related = u_security_related;
	}

	public String getMajor_incident_state() {
		return major_incident_state;
	}

	public void setMajor_incident_state(String major_incident_state) {
		this.major_incident_state = major_incident_state;
	}

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}

	public String getCorrelation_display() {
		return correlation_display;
	}

	public void setCorrelation_display(String correlation_display) {
		this.correlation_display = correlation_display;
	}

	public String getDelivery_task() {
		return delivery_task;
	}

	public void setDelivery_task(String delivery_task) {
		this.delivery_task = delivery_task;
	}

	public String getWork_start() {
		return work_start;
	}

	public void setWork_start(String work_start) {
		this.work_start = work_start;
	}

	public String getTrigger_rule() {
		return trigger_rule;
	}

	public void setTrigger_rule(String trigger_rule) {
		this.trigger_rule = trigger_rule;
	}

	public String getAdditional_assignee_list() {
		return additional_assignee_list;
	}

	public void setAdditional_assignee_list(String additional_assignee_list) {
		this.additional_assignee_list = additional_assignee_list;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public String getService_offering() {
		return service_offering;
	}

	public void setService_offering(String service_offering) {
		this.service_offering = service_offering;
	}

	public String getSys_class_name() {
		return sys_class_name;
	}

	public void setSys_class_name(String sys_class_name) {
		this.sys_class_name = sys_class_name;
	}

	public ClosedBy getClosed_by() {
		return closed_by;
	}

	public void setClosed_by(ClosedBy closed_by) {
		this.closed_by = closed_by;
	}

	public String getFollow_up() {
		return follow_up;
	}

	public void setFollow_up(String follow_up) {
		this.follow_up = follow_up;
	}

	public String getParent_incident() {
		return parent_incident;
	}

	public void setParent_incident(String parent_incident) {
		this.parent_incident = parent_incident;
	}

	public String getReopened_by() {
		return reopened_by;
	}

	public void setReopened_by(String reopened_by) {
		this.reopened_by = reopened_by;
	}

	public String getReassignment_count() {
		return reassignment_count;
	}

	public void setReassignment_count(String reassignment_count) {
		this.reassignment_count = reassignment_count;
	}

	public AssignedTo getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(AssignedTo assigned_to) {
		this.assigned_to = assigned_to;
	}

	public String getSla_due() {
		return sla_due;
	}

	public void setSla_due(String sla_due) {
		this.sla_due = sla_due;
	}

	public String getComments_and_work_notes() {
		return comments_and_work_notes;
	}

	public void setComments_and_work_notes(String comments_and_work_notes) {
		this.comments_and_work_notes = comments_and_work_notes;
	}

	public UTenantCategory getU_tenant_category() {
		return u_tenant_category;
	}

	public void setU_tenant_category(UTenantCategory u_tenant_category) {
		this.u_tenant_category = u_tenant_category;
	}

	public String getU_tenant_resolution_code() {
		return u_tenant_resolution_code;
	}

	public void setU_tenant_resolution_code(String u_tenant_resolution_code) {
		this.u_tenant_resolution_code = u_tenant_resolution_code;
	}

	public String getEscalation() {
		return escalation;
	}

	public void setEscalation(String escalation) {
		this.escalation = escalation;
	}

	public String getUpon_approval() {
		return upon_approval;
	}

	public void setUpon_approval(String upon_approval) {
		this.upon_approval = upon_approval;
	}

	public String getCorrelation_id() {
		return correlation_id;
	}

	public void setCorrelation_id(String correlation_id) {
		this.correlation_id = correlation_id;
	}

	public String getTimeline() {
		return timeline;
	}

	public void setTimeline(String timeline) {
		this.timeline = timeline;
	}

	public String getU_vendor_ticket_number() {
		return u_vendor_ticket_number;
	}

	public void setU_vendor_ticket_number(String u_vendor_ticket_number) {
		this.u_vendor_ticket_number = u_vendor_ticket_number;
	}

	public String getMade_sla() {
		return made_sla;
	}

	public void setMade_sla(String made_sla) {
		this.made_sla = made_sla;
	}

	public String getPromoted_on() {
		return promoted_on;
	}

	public void setPromoted_on(String promoted_on) {
		this.promoted_on = promoted_on;
	}

	public String getChild_incidents() {
		return child_incidents;
	}

	public void setChild_incidents(String child_incidents) {
		this.child_incidents = child_incidents;
	}

	public String getHold_reason() {
		return hold_reason;
	}

	public void setHold_reason(String hold_reason) {
		this.hold_reason = hold_reason;
	}

	public ResolvedBy getResolved_by() {
		return resolved_by;
	}

	public void setResolved_by(ResolvedBy resolved_by) {
		this.resolved_by = resolved_by;
	}

	public String getSys_updated_by() {
		return sys_updated_by;
	}

	public void setSys_updated_by(String sys_updated_by) {
		this.sys_updated_by = sys_updated_by;
	}

	public OpenedBy getOpened_by() {
		return opened_by;
	}

	public void setOpened_by(OpenedBy opened_by) {
		this.opened_by = opened_by;
	}

	public String getUser_input() {
		return user_input;
	}

	public void setUser_input(String user_input) {
		this.user_input = user_input;
	}

	public String getSys_created_on() {
		return sys_created_on;
	}

	public void setSys_created_on(String sys_created_on) {
		this.sys_created_on = sys_created_on;
	}

	public SysDomain getSys_domain() {
		return sys_domain;
	}

	public void setSys_domain(SysDomain sys_domain) {
		this.sys_domain = sys_domain;
	}

	public String getProposed_on() {
		return proposed_on;
	}

	public void setProposed_on(String proposed_on) {
		this.proposed_on = proposed_on;
	}

	public String getActions_taken() {
		return actions_taken;
	}

	public void setActions_taken(String actions_taken) {
		this.actions_taken = actions_taken;
	}

	public TaskFor getTask_for() {
		return task_for;
	}

	public void setTask_for(TaskFor task_for) {
		this.task_for = task_for;
	}

	public String getCalendar_stc() {
		return calendar_stc;
	}

	public void setCalendar_stc(String calendar_stc) {
		this.calendar_stc = calendar_stc;
	}

	public String getClosed_at() {
		return closed_at;
	}

	public void setClosed_at(String closed_at) {
		this.closed_at = closed_at;
	}

	public String getU_sd2sd_interface_type() {
		return u_sd2sd_interface_type;
	}

	public void setU_sd2sd_interface_type(String u_sd2sd_interface_type) {
		this.u_sd2sd_interface_type = u_sd2sd_interface_type;
	}

	public BusinessService getBusiness_service() {
		return business_service;
	}

	public void setBusiness_service(BusinessService business_service) {
		this.business_service = business_service;
	}

	public String getBusiness_impact() {
		return business_impact;
	}

	public void setBusiness_impact(String business_impact) {
		this.business_impact = business_impact;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTime_worked() {
		return time_worked;
	}

	public void setTime_worked(String time_worked) {
		this.time_worked = time_worked;
	}

	public String getExpected_start() {
		return expected_start;
	}

	public void setExpected_start(String expected_start) {
		this.expected_start = expected_start;
	}

	public String getOpened_at() {
		return opened_at;
	}

	public void setOpened_at(String opened_at) {
		this.opened_at = opened_at;
	}

	public String getWork_end() {
		return work_end;
	}

	public void setWork_end(String work_end) {
		this.work_end = work_end;
	}

	public CallerId getCaller_id() {
		return caller_id;
	}

	public void setCaller_id(CallerId caller_id) {
		this.caller_id = caller_id;
	}

	public String getReopened_time() {
		return reopened_time;
	}

	public void setReopened_time(String reopened_time) {
		this.reopened_time = reopened_time;
	}

	public String getResolved_at() {
		return resolved_at;
	}

	public void setResolved_at(String resolved_at) {
		this.resolved_at = resolved_at;
	}

	public String getU_interface_type() {
		return u_interface_type;
	}

	public void setU_interface_type(String u_interface_type) {
		this.u_interface_type = u_interface_type;
	}

	public String getWork_notes() {
		return work_notes;
	}

	public void setWork_notes(String work_notes) {
		this.work_notes = work_notes;
	}

	public AssignmentGroup getAssignment_group() {
		return assignment_group;
	}

	public void setAssignment_group(AssignmentGroup assignment_group) {
		this.assignment_group = assignment_group;
	}

	public String getBusiness_stc() {
		return business_stc;
	}

	public void setBusiness_stc(String business_stc) {
		this.business_stc = business_stc;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCalendar_duration() {
		return calendar_duration;
	}

	public void setCalendar_duration(String calendar_duration) {
		this.calendar_duration = calendar_duration;
	}

	public String getU_sd2sd_external_system() {
		return u_sd2sd_external_system;
	}

	public void setU_sd2sd_external_system(String u_sd2sd_external_system) {
		this.u_sd2sd_external_system = u_sd2sd_external_system;
	}

	public String getClose_notes() {
		return close_notes;
	}

	public void setClose_notes(String close_notes) {
		this.close_notes = close_notes;
	}

	public String getSys_id() {
		return sys_id;
	}

	public void setSys_id(String sys_id) {
		this.sys_id = sys_id;
	}

	public String getContact_type() {
		return contact_type;
	}

	public void setContact_type(String contact_type) {
		this.contact_type = contact_type;
	}

	public String getIncident_state() {
		return incident_state;
	}

	public void setIncident_state(String incident_state) {
		this.incident_state = incident_state;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public String getProblem_id() {
		return problem_id;
	}

	public void setProblem_id(String problem_id) {
		this.problem_id = problem_id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getActivity_due() {
		return activity_due;
	}

	public void setActivity_due(String activity_due) {
		this.activity_due = activity_due;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public String getU_environment() {
		return u_environment;
	}

	public void setU_environment(String u_environment) {
		this.u_environment = u_environment;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	public String getSys_mod_count() {
		return sys_mod_count;
	}

	public void setSys_mod_count(String sys_mod_count) {
		this.sys_mod_count = sys_mod_count;
	}

	public String getU_affected_user() {
		return u_affected_user;
	}

	public void setU_affected_user(String u_affected_user) {
		this.u_affected_user = u_affected_user;
	}

	public String getReopen_count() {
		return reopen_count;
	}

	public void setReopen_count(String reopen_count) {
		this.reopen_count = reopen_count;
	}

	public String getSys_tags() {
		return sys_tags;
	}

	public void setSys_tags(String sys_tags) {
		this.sys_tags = sys_tags;
	}

	public String getU_external_system() {
		return u_external_system;
	}

	public void setU_external_system(String u_external_system) {
		this.u_external_system = u_external_system;
	}

	public String getU_knowledge_article() {
		return u_knowledge_article;
	}

	public void setU_knowledge_article(String u_knowledge_article) {
		this.u_knowledge_article = u_knowledge_article;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getU_sd2sd_service_provider() {
		return u_sd2sd_service_provider;
	}

	public void setU_sd2sd_service_provider(String u_sd2sd_service_provider) {
		this.u_sd2sd_service_provider = u_sd2sd_service_provider;
	}

	@Override
	public String toString() {
		return "Result [promoted_by=" + promoted_by + ", parent=" + parent + ", caused_by=" + caused_by
				+ ", watch_list=" + watch_list + ", u_tenant_subcategory=" + u_tenant_subcategory + ", upon_reject="
				+ upon_reject + ", sys_updated_on=" + sys_updated_on + ", approval_history=" + approval_history
				+ ", number=" + number + ", proposed_by=" + proposed_by + ", u_contact_attempt=" + u_contact_attempt
				+ ", u_security_type=" + u_security_type + ", lessons_learned=" + lessons_learned + ", state=" + state
				+ ", sys_created_by=" + sys_created_by + ", knowledge=" + knowledge + ", order=" + order + ", cmdb_ci="
				+ cmdb_ci + ", delivery_plan=" + delivery_plan + ", impact=" + impact + ", active=" + active
				+ ", work_notes_list=" + work_notes_list + ", u_vendor=" + u_vendor + ", priority=" + priority
				+ ", sys_domain_path=" + sys_domain_path + ", business_duration=" + business_duration + ", group_list="
				+ group_list + ", u_copied_from=" + u_copied_from + ", u_template=" + u_template + ", approval_set="
				+ approval_set + ", u_security_related=" + u_security_related + ", major_incident_state="
				+ major_incident_state + ", short_description=" + short_description + ", correlation_display="
				+ correlation_display + ", delivery_task=" + delivery_task + ", work_start=" + work_start
				+ ", trigger_rule=" + trigger_rule + ", additional_assignee_list=" + additional_assignee_list
				+ ", notify=" + notify + ", service_offering=" + service_offering + ", sys_class_name=" + sys_class_name
				+ ", closed_by=" + closed_by + ", follow_up=" + follow_up + ", parent_incident=" + parent_incident
				+ ", reopened_by=" + reopened_by + ", reassignment_count=" + reassignment_count + ", assigned_to="
				+ assigned_to + ", sla_due=" + sla_due + ", comments_and_work_notes=" + comments_and_work_notes
				+ ", u_tenant_category=" + u_tenant_category + ", u_tenant_resolution_code=" + u_tenant_resolution_code
				+ ", escalation=" + escalation + ", upon_approval=" + upon_approval + ", correlation_id="
				+ correlation_id + ", timeline=" + timeline + ", u_vendor_ticket_number=" + u_vendor_ticket_number
				+ ", made_sla=" + made_sla + ", promoted_on=" + promoted_on + ", child_incidents=" + child_incidents
				+ ", hold_reason=" + hold_reason + ", resolved_by=" + resolved_by + ", sys_updated_by=" + sys_updated_by
				+ ", opened_by=" + opened_by + ", user_input=" + user_input + ", sys_created_on=" + sys_created_on
				+ ", sys_domain=" + sys_domain + ", proposed_on=" + proposed_on + ", actions_taken=" + actions_taken
				+ ", task_for=" + task_for + ", calendar_stc=" + calendar_stc + ", closed_at=" + closed_at
				+ ", u_sd2sd_interface_type=" + u_sd2sd_interface_type + ", business_service=" + business_service
				+ ", business_impact=" + business_impact + ", rfc=" + rfc + ", time_worked=" + time_worked
				+ ", expected_start=" + expected_start + ", opened_at=" + opened_at + ", work_end=" + work_end
				+ ", caller_id=" + caller_id + ", reopened_time=" + reopened_time + ", resolved_at=" + resolved_at
				+ ", u_interface_type=" + u_interface_type + ", work_notes=" + work_notes + ", assignment_group="
				+ assignment_group + ", business_stc=" + business_stc + ", cause=" + cause + ", description="
				+ description + ", calendar_duration=" + calendar_duration + ", u_sd2sd_external_system="
				+ u_sd2sd_external_system + ", close_notes=" + close_notes + ", sys_id=" + sys_id + ", contact_type="
				+ contact_type + ", incident_state=" + incident_state + ", urgency=" + urgency + ", problem_id="
				+ problem_id + ", company=" + company + ", activity_due=" + activity_due + ", severity=" + severity
				+ ", overview=" + overview + ", comments=" + comments + ", approval=" + approval + ", u_environment="
				+ u_environment + ", due_date=" + due_date + ", sys_mod_count=" + sys_mod_count + ", u_affected_user="
				+ u_affected_user + ", reopen_count=" + reopen_count + ", sys_tags=" + sys_tags + ", u_external_system="
				+ u_external_system + ", u_knowledge_article=" + u_knowledge_article + ", location=" + location
				+ ", u_sd2sd_service_provider=" + u_sd2sd_service_provider + "]";
	}

}
