package com.ik.service.miniprogram.model;

import java.io.Serializable;
import java.util.Date;
import org.mybatis.extend.generic.model.BaseModel;

/**
 * Model: AnswerSheet
 * Table: answer_sheets
 * Alias: ans
 *
 * This Model generated by MyBatis Generator Extend.
 */
public class AnswerSheet extends BaseModel<Integer> implements Serializable {
    /**
     * 试卷ID
     * paper_id
     */
    private Integer paperId;

    /**
     * 学生ID
     * student_id
     */
    private Integer studentId;

    /**
     * 老师ID
     * teacher_id
     */
    private Integer teacherId;

    /**
     * 得分
     * score
     */
    private Float score;

    /**
     * 开始答题时间
     * started_at
     */
    private Date startedAt;

    /**
     * 完成于
     * completed_at
     */
    private Date completedAt;

    /**
     * 创建时间
     * created_at
     */
    private Date createdAt;

    /**
     * 更新时间
     * updated_at
     */
    private Date updatedAt;

    /**
     * 提问
     * questions
     */
    private String questions;

    /**
     * 学生答案
     * student_answer
     */
    private String studentAnswer;

    /**
     * 老师批改
     * teacher_correction
     */
    private String teacherCorrection;

    /**
     * 评语
     * remark
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 试卷ID
     * paper_id
     */
    public Integer getPaperId() {
        return paperId;
    }

    /**
     * 试卷ID
     * paper_id
     *
     * @param paperId 试卷ID
     */
    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    /**
     * 学生ID
     * student_id
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * 学生ID
     * student_id
     *
     * @param studentId 学生ID
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * 老师ID
     * teacher_id
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * 老师ID
     * teacher_id
     *
     * @param teacherId 老师ID
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 得分
     * score
     */
    public Float getScore() {
        return score;
    }

    /**
     * 得分
     * score
     *
     * @param score 得分
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * 开始答题时间
     * started_at
     */
    public Date getStartedAt() {
        return startedAt;
    }

    /**
     * 开始答题时间
     * started_at
     *
     * @param startedAt 开始答题时间
     */
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * 完成于
     * completed_at
     */
    public Date getCompletedAt() {
        return completedAt;
    }

    /**
     * 完成于
     * completed_at
     *
     * @param completedAt 完成于
     */
    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * 创建时间
     * created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     * created_at
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 更新时间
     * updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 更新时间
     * updated_at
     *
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 提问
     * questions
     */
    public String getQuestions() {
        return questions;
    }

    /**
     * 提问
     * questions
     *
     * @param questions 提问
     */
    public void setQuestions(String questions) {
        this.questions = questions;
    }

    /**
     * 学生答案
     * student_answer
     */
    public String getStudentAnswer() {
        return studentAnswer;
    }

    /**
     * 学生答案
     * student_answer
     *
     * @param studentAnswer 学生答案
     */
    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    /**
     * 老师批改
     * teacher_correction
     */
    public String getTeacherCorrection() {
        return teacherCorrection;
    }

    /**
     * 老师批改
     * teacher_correction
     *
     * @param teacherCorrection 老师批改
     */
    public void setTeacherCorrection(String teacherCorrection) {
        this.teacherCorrection = teacherCorrection;
    }

    /**
     * 评语
     * remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 评语
     * remark
     *
     * @param remark 评语
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", paperId=").append(paperId);
        sb.append(", studentId=").append(studentId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", score=").append(score);
        sb.append(", startedAt=").append(startedAt);
        sb.append(", completedAt=").append(completedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", questions=").append(questions);
        sb.append(", studentAnswer=").append(studentAnswer);
        sb.append(", teacherCorrection=").append(teacherCorrection);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AnswerSheet other = (AnswerSheet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}