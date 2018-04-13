package com.dstsystems.skillbook.controller;

import com.dstsystems.skillbook.model.SkillBook;
import com.dstsystems.skillbook.service.SkillBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by SM on 4/12/18.
 */
@RestController
public class SkillBookController {

    @Autowired
    SkillBookService skillBookService;

    @RequestMapping(value = "/getSkill/{name}", method = RequestMethod.GET)
    Collection<SkillBook> readBookmarks(@PathVariable String name) {
        return skillBookService.searchSkill(name);
    }


}
