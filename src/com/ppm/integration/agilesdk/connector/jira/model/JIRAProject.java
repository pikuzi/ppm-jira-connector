
package com.ppm.integration.agilesdk.connector.jira.model;

import org.json.JSONException;
import org.json.JSONObject;

public class JIRAProject {

    private String key;

    private String name;

    private String projectTypeKey;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectTypeKey() {
        return projectTypeKey;
    }

    public void setProjectTypeKey(String projectTypeKey) {
        this.projectTypeKey = projectTypeKey;
    }

    public static JIRAProject fromJSONObject(JSONObject obj) {
        try {
            JIRAProject project = new JIRAProject();
            project.setName(obj.getString("name"));
            project.setKey(obj.getString("key"));
            project.setProjectTypeKey(obj.getString("projectTypeKey"));
            return project;
        } catch (JSONException e) {
            throw new RuntimeException("Error while reading JSon defintiion of Project", e);
        }
    }

}
