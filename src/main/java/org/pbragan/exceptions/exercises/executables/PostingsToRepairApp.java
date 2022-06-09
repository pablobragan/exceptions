package org.pbragan.exceptions.exercises.executables;

import org.pbragan.exceptions.exercises.model.Posting;
import org.pbragan.exceptions.exercises.services.PostingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PostingsToRepairApp {

    private final static Logger logger = LoggerFactory.getLogger(PostingsToRepairApp.class);

    public static void main(String[] args){
        logger.info("INICIO de {}",PostingsToRepairApp.class);
        PostingService postingService = new PostingService();
        List<Posting> postings = postingService.listPostings();
        for (Posting posting:
                postingService.listPostings()) {
            if(10410013 == posting.getPostingId()){
                logger.info(posting.toString());
            }
        }
        Posting posting = postingService.findByIndex(Integer.MAX_VALUE);
        if(posting != null){
            logger.info(String.format("El posting %d es %s",Integer.MAX_VALUE,posting));
        }else{
            logger.error(String.format("No existe el posting %d",Integer.MAX_VALUE));
        }
    }
}
