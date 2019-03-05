package com.ik.service.miniprogram.service.impl;

import java.util.Date;

import org.mybatis.extend.generic.service.impl.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ik.crm.commons.util.DateUtils;
import com.ik.service.miniprogram.mapper.AnswerSheetMapper;
import com.ik.service.miniprogram.model.AnswerSheet;
import com.ik.service.miniprogram.service.AnswerSheetService;
import com.ik.service.miniprogram.vo.AnswerSheetRequest;

/**
 * ServiceImpl: AnswerSheetServiceImpl
 * Mapper : AnswerSheetMapper
 * Model  : AnswerSheet
 *
 * This ServiceImpl generated by MyBatis Generator Extend at 2018-12-04 10:26:51
 */
@Service
@Transactional
public class AnswerSheetServiceImpl extends GenericServiceImpl<AnswerSheet, Integer, AnswerSheetMapper>
        implements AnswerSheetService {
    @Autowired
    private AnswerSheetMapper answerSheetMapper;

    @Override
    public AnswerSheetMapper getGenericMapper() {
        return answerSheetMapper;
    }

    @Override
    public void saveAnswerSheet(AnswerSheetRequest answerSheetRequest) {
        AnswerSheet answerSheet = new AnswerSheet();
        answerSheet.setPaperId(answerSheetRequest.getPaperId());
        answerSheet.setStudentId(answerSheetRequest.getStudentId());
        answerSheet.setTeacherId(answerSheetRequest.getTeacherId());
        answerSheet.setScore(answerSheetRequest.getScore());
        answerSheet.setQuestions(answerSheetRequest.getQuestions());
        answerSheet.setStudentAnswer(answerSheetRequest.getStudentAnswer());
        answerSheet.setTeacherCorrection(answerSheetRequest.getTeacherCorrection());
        answerSheet.setRemark(answerSheetRequest.getRemark());
        answerSheet.setStartedAt(DateUtils.parseDate(answerSheetRequest.getStartedAt()));
        answerSheet.setCompletedAt(DateUtils.parseDate(answerSheetRequest.getCompletedAt()));

        answerSheet.setCreatedAt(new Date());
        answerSheet.setUpdatedAt(new Date());
        answerSheetMapper.insertSelective(answerSheet);
    }
}