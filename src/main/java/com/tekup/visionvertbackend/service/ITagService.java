package com.tekup.visionvertbackend.service;


import com.tekup.visionvertbackend.entities.Tag;

import java.util.List;

public interface ITagService {

    Tag insertTag(Tag post);

    List<Tag> getAllTags();

    Tag updateTag(Tag post);

    void deleteById(Long id);

    Tag getById(Long id);
}
