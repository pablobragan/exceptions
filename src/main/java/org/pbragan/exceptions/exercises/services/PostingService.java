package org.pbragan.exceptions.exercises.services;

import org.pbragan.exceptions.exercises.model.Posting;
import org.pbragan.exceptions.examples.utils.PostingUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class PostingService {

    private static final Logger logger = LoggerFactory.getLogger(PostingService.class);
    private Collection<Posting> cachedPostings;

    /**
     * El metodo a partir de una collection retorna un LinkedList
     *
     * @return
     */
    public LinkedList<Posting> listPostings(){
        Collection<Posting> postings = PostingUtils.getListPostings();
        return (LinkedList<Posting>) postings;
    }

    /**
     * El metodo retorna el posting en la ubicacion indicada
     * @param index
     * @return
     */
    public Posting findByIndex(int index){
        ArrayList<Posting> postings = null;
        postings = getPostings();
        return postings.get(index);
    }

    /**
     * Obtiene postings de la cache o del utils si no hay datos
     * @return
     */
    protected ArrayList<Posting> getPostings() {
        ArrayList<Posting> postings;
        if(!cachedPostings.isEmpty()){
            postings = (ArrayList<Posting>) cachedPostings;
        }else{
            cachedPostings = PostingUtils.getListPostings();
            postings = (ArrayList<Posting>) cachedPostings;
        }
        return postings;
    }

}
