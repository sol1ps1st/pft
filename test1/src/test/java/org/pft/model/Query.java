package org.pft.model;

public class Query {
    public Query(String queryText){
        setQueryText(queryText);
    }

    private String queryText;
    public String getQueryText(){
        return  queryText;
    }
    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }
}
