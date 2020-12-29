package com.github.dockerjava.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Used for Listing config.
 *
 * @since {@link RemoteApiVersion#VERSION_1_30}
 */
public class Config implements Serializable {
    public static final long serialVersionUID = 1L;

    /**
     * @since 1.30
     */
    @JsonProperty("ID")
    private String id;

    /**
     * @since 1.30
     */
    @JsonProperty("CreatedAt")
    private Date createdAt;

    /**
     * @since 1.30
     */
    @JsonProperty("UpdatedAt")
    private Date updatedAt;

    /**
     * @since 1.30
     */
    @JsonProperty("Spec")
    private ServiceSpec spec;

    /**
     * @since 1.30
     */
    @JsonProperty("Version")
    private ResourceVersion version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(ServiceSpec spec) {
        this.spec = spec;
    }

    public ResourceVersion getVersion() {
        return version;
    }

    public void setVersion(ResourceVersion version) {
        this.version = version;
    }
}
