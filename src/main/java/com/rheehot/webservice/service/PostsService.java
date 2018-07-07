package com.rheehot.webservice.service;

import com.rheehot.webservice.domain.posts.PostsRepository;
import com.rheehot.webservice.dto.PostsMainResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {

    private PostsRepository postsRepository;

//    @Transactional
//    public Long save(PostsSaveRequestDto dto){
//        return postsRepository.save(dto.toEntity()).getId();
//    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new) //.map(posts -> new PostsMainResponseDto(posts))
                .collect(Collectors.toList());
    }
}
