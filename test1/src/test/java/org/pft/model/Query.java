package org.pft.model;

public class Query {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Query)) return false;

        Query query = (Query) o;

        return queryText != null ? queryText.equals(query.queryText) : query.queryText == null;
    }

    @Override
    public int hashCode() {
        return queryText != null ? queryText.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Query{" +
                "queryText='" + queryText + '\'' +
                '}';
    }

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
