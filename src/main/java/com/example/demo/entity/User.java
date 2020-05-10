package com.example.demo.entity;

/**
 * @author wyh
 * @Date 2020/05/03
 */
public class User {

    private String competition_event_code;
    private String competition_event_name;
    private String suite_type;
    private String plan_start_at;
    private String plan_end_at;
    private String status;
    private String created_at;
    private String updated_at;
    private String created_by;
    private String updated_by;

    public User(
             String competition_event_code,
             String competition_event_name,
             String suite_type,
             String plan_start_at,
             String plan_end_at,
             String status,
             String created_at,
             String updated_at,
             String created_by,
             String updated_by) {

        this.competition_event_code = competition_event_code;
        this.competition_event_name = competition_event_name;
        this.suite_type = suite_type;
        this.plan_start_at = plan_start_at;
        this.plan_end_at = plan_end_at;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.created_by = created_by;
        this.updated_by = updated_by;

    }




    public String getCompetition_event_code() {
        return competition_event_code;
    }

    public String getCompetition_event_name() {
        return competition_event_name;
    }

    public String getSuite_type() {
        return suite_type;
    }

    public String getPlan_start_at() {
        return plan_start_at;
    }

    public String getPlan_end_at() {
        return plan_end_at;
    }

    public String getStatus() {
        return status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public String getUpdated_by() {
        return updated_by;
    }



    public void setCompetition_event_code(String competition_event_code) {
        this.competition_event_code = competition_event_code;
    }

    public void setCompetition_event_name(String competition_event_name) {
        this.competition_event_name = competition_event_name;
    }

    public void setSuite_type(String suite_type) {
        this.suite_type = suite_type;
    }

    public void setPlan_start_at(String plan_start_at) {
        this.plan_start_at = plan_start_at;
    }

    public void setPlan_end_at(String plan_end_at) {
        this.plan_end_at = plan_end_at;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }



    @Override
    public String toString() {
        return "User{" +
                "competition_event_code='" + competition_event_code + '\'' +
                ", competition_event_name='" + competition_event_name + '\'' +
                ", suite_type='" + suite_type + '\'' +
                ", plan_start_at='" + plan_start_at + '\'' +
                ", plan_end_at='" + plan_end_at + '\'' +
                ", status='" + status + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", created_by='" + created_by + '\'' +
                ", updated_by='" + updated_by + '\'' +
                '}';
    }
}