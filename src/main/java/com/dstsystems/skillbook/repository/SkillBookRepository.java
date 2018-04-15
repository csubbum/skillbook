package com.dstsystems.skillbook.repository;
import java.util.List;

import com.dstsystems.skillbook.model.SkillBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SM on 4/12/18.
 */
@Repository
public interface SkillBookRepository extends CrudRepository<SkillBook, Long>
{

        List<SkillBook> findByName(String name);


        List<SkillBook> findAll();
}

