package com.dstsystems.skillbook.service;

import com.dstsystems.skillbook.model.SkillBook;
import com.dstsystems.skillbook.repository.SkillBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SM on 4/12/18.
 */
@Service
public class SkillBookService {
    @Autowired
    SkillBookRepository skillBookRespository;

    public List<SkillBook> searchSkill(String name) {
        return skillBookRespository.findByName(name);

    }
}
