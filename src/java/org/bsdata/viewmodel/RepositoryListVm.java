
package org.bsdata.viewmodel;

import java.util.ArrayList;
import java.util.List;


public class RepositoryListVm {
    
    private List<RepositoryVm> repositories;
    private String feedUrl;
    private String errorMessage;
    
    public RepositoryListVm() {
        repositories = new ArrayList<>();
    }

    public List<RepositoryVm> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<RepositoryVm> repositories) {
        this.repositories = repositories;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
