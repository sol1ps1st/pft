package org.pft.model;

import com.google.common.collect.ForwardingSet;

import java.util.HashSet;
import java.util.Set;


public class Queries extends ForwardingSet<Query>{
//public class Queries extends HashSet<Query>{
    private Set<Query> delegate;
    public Queries(Queries other) {
        this.delegate = new HashSet<Query>(other.delegate);
    }

    @Override
    protected Set<Query> delegate() {
        return delegate;
    }
    public Queries withAdded(Query q){
        Queries newQueries = new Queries(this);
        newQueries.add(q);
        return  newQueries;
    }
}
