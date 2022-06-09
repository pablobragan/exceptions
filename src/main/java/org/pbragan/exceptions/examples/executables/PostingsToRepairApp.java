package org.pbragan.exceptions.examples.executables;

import org.pbragan.exceptions.examples.model.Posting;
import org.pbragan.exceptions.examples.services.PostingService;

import java.util.List;

public class PostingsToRepairApp {


    public static void main(String[] args){
        PostingService postingService = new PostingService();
        List<Posting> postings = postingService.listPostings();
        for (Posting posting:
                postingService.listPostings()) {
            if(10410013 == posting.getPostingId()){
                System.out.println(posting.toString());
            }
        }
        Posting posting = postingService.findByIndex(Integer.MAX_VALUE);
        if(posting != null){
            System.out.println(String.format("El posting %d es %s",Integer.MAX_VALUE,posting));
        }else{
            System.out.println(String.format("No existe el posting %d",Integer.MAX_VALUE));
        }
    }
}
