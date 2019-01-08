/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.interfaces;


import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface ISysTabular extends Serializable {

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.PK_ID</code>. uniqueId,PK_ID
     */
    public ISysTabular setPkId(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.T_COMMENT</code>. comment,T_COMMENT
     */
    public String getTComment();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.T_COMMENT</code>. comment,T_COMMENT
     */
    public ISysTabular setTComment(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.S_NAME</code>. name,S_NAME
     */
    public String getSName();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.S_NAME</code>. name,S_NAME
     */
    public ISysTabular setSName(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.S_CODE</code>. code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.S_CODE</code>. code,S_CODE
     */
    public ISysTabular setSCode(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.S_SERIAL</code>. serial,S_SERIAL
     */
    public String getSSerial();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.S_SERIAL</code>. serial,S_SERIAL
     */
    public ISysTabular setSSerial(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.S_TYPE</code>. 标识Tabular的类型字符串,type,S_TYPE
     */
    public String getSType();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.S_TYPE</code>. 标识Tabular的类型字符串,type,S_TYPE
     */
    public ISysTabular setSType(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.J_CONFIG</code>. config,J_CONFIG
     */
    public ISysTabular setJConfig(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.I_ORDER</code>. order,I_ORDER
     */
    public Integer getIOrder();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.I_ORDER</code>. order,I_ORDER
     */
    public ISysTabular setIOrder(Integer value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public ISysTabular setIsActive(Boolean value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public ISysTabular setZSigma(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public ISysTabular setZLanguage(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public ISysTabular setZCreateBy(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public ISysTabular setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public ISysTabular setZUpdateBy(String value);

    /**
     * Getter for <code>DB_HTL.SYS_TABULAR.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    /**
     * Setter for <code>DB_HTL.SYS_TABULAR.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public ISysTabular setZUpdateTime(LocalDateTime value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISysTabular
     */
    public void from(com.htl.domain.tables.interfaces.ISysTabular from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISysTabular
     */
    public <E extends com.htl.domain.tables.interfaces.ISysTabular> E into(E into);

    default ISysTabular fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getString("PK_ID"));
        setTComment(json.getString("T_COMMENT"));
        setSName(json.getString("S_NAME"));
        setSCode(json.getString("S_CODE"));
        setSSerial(json.getString("S_SERIAL"));
        setSType(json.getString("S_TYPE"));
        setJConfig(json.getString("J_CONFIG"));
        setIOrder(json.getInteger("I_ORDER"));
        setIsActive(json.getBoolean("IS_ACTIVE"));
        setZSigma(json.getString("Z_SIGMA"));
        setZLanguage(json.getString("Z_LANGUAGE"));
        setZCreateBy(json.getString("Z_CREATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        setZUpdateBy(json.getString("Z_UPDATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PK_ID", getPkId());
        json.put("T_COMMENT", getTComment());
        json.put("S_NAME", getSName());
        json.put("S_CODE", getSCode());
        json.put("S_SERIAL", getSSerial());
        json.put("S_TYPE", getSType());
        json.put("J_CONFIG", getJConfig());
        json.put("I_ORDER", getIOrder());
        json.put("IS_ACTIVE", getIsActive());
        json.put("Z_SIGMA", getZSigma());
        json.put("Z_LANGUAGE", getZLanguage());
        json.put("Z_CREATE_BY", getZCreateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        json.put("Z_UPDATE_BY", getZUpdateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return json;
    }

}
