package com.example.screenmatch_phrases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhrasesController {

    @Autowired
    PhraseService service;
    @GetMapping("/series/phrases")
    public PhraseDTO getPhrases() {
        return service.getRandomPhrase();
    }


}
